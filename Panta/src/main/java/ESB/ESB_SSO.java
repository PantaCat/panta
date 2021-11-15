package ESB;

import org.junit.Test;

public class ESB_SSO {
    @Test
    public static void main(String[] args) throws Exception {
        String xml = " <ns:reqt  xmlns:ns=\"http://esb.xjrccb.com/0400300049\">"+
                " <ns:svcHead>"+
                " <ns:SvcId>0400300049</ns:SvcId>"+
                " <ns:OptId>01</ns:OptId>"+
                " <ns:VerNo>1.0</ns:VerNo>"+
                " <ns:CsmId>sheji</ns:CsmId>"+
                " <ns:CsmTms>2008-09-29T01:49:45</ns:CsmTms>"+
                " <ns:CsmSeqNo>123</ns:CsmSeqNo>"+
                " </ns:svcHead>"+
                " <ns:extHead/>"+
                " <ns:appHead>"+
                " </ns:appHead>"+
                " <ns:appBody>"+
                " <ns:appid>111</ns:appid>"+
                " <ns:access_token>test</ns:access_token>"+
                " <ns:code>string</ns:code>"+
                " </ns:appBody>"+
                " </ns:reqt>";

        String respmsg=SendXmlToESB.sendXml(
                 xml,
                "0400300049",
                "https://wxtest.xjrccb.com.cn/MDP/0400300049"
        ) ;
        System.out.print(respmsg) ;
    }
}
