package ESB;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.junit.Test;
import org.w3c.dom.Document;

public class SendXmlToESB {
    /**
     * 请求ESB服务
     * @param xml
     * 			请求报文
     * @param svcId
     * 			服务号
     * @return xml
     *         响应报文
     * @throws Exception
     */


    public static String sendXml(String xml, String svcId,String urlStr)
            throws Exception {
        //  直接通过主机认证
        HostnameVerifier hv = new HostnameVerifier() {
            @Override
            public boolean verify(String urlHostName, SSLSession session) {
                return true;
            }
        };
        //  配置认证管理器
        javax.net.ssl.TrustManager[] trustAllCerts = {new TrustAllTrustManager()};
        SSLContext sc = SSLContext.getInstance("SSL");
        SSLSessionContext sslsc = sc.getServerSessionContext();
        sslsc.setSessionTimeout(0);
        sc.init(null, trustAllCerts, null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        //  激活主机认证
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
        URL url = new URL(urlStr);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();


        byte[] buf = xml.getBytes("utf-8");
        InputStream in = new ByteArrayInputStream(buf);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        Document doc = factory.newDocumentBuilder().parse(in);

        DOMSource requestMsg = new DOMSource(doc);

        String ns = "http://esb.xjrccb.com/" + svcId + "wsdl";

        QName serviceName = new QName(ns, "TradeService");
        QName portName = new QName(ns, "TradePort");
        Service service = Service.create(serviceName);

        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, urlStr);
        Dispatch dispatch = service.createDispatch(portName, Source.class,
                Service.Mode.PAYLOAD);

        Source responseMsg = (Source) dispatch.invoke(requestMsg);

        TransformerFactory transFactory = TransformerFactory.newInstance();
        Transformer transformer = transFactory.newTransformer();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        StreamResult result = new StreamResult();
        result.setOutputStream(baos);

        transformer.transform(responseMsg, result);

        return baos.toString("utf-8");
    }



}
