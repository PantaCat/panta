package ESB;

import org.junit.Test;

public class ESB_XDGRXXTB {
    @Test
    public static void main(String[] args) throws Exception {
        String xml = " <ns:reqt  xmlns:ns=\"http://esb.xjrccb.com/0200200020\">"+
                " <ns:svcHead>"+
                " <ns:SvcId>0200200020</ns:SvcId>"+
                " <ns:OptId>01</ns:OptId>"+
                " <ns:VerNo>1.0</ns:VerNo>"+
                " <ns:CsmId>sheji</ns:CsmId>"+
                " <ns:CsmTms>2008-09-29T01:49:45</ns:CsmTms>"+
                " <ns:CsmSeqNo>123</ns:CsmSeqNo>"+
                " </ns:svcHead>"+
                " <ns:extHead/>"+
                " <ns:appHead/>"+
                " <ns:appBody>"+
//                " <ns:operate_type>1</ns:operate_type>"+
//                " <ns:personal_type>1</ns:personal_type>"+
//                " <ns:cust_name>测试八</ns:cust_name>"+
//                " <ns:id_type>1</ns:id_type>"+
//                " <ns:id_no>511423198911200550</ns:id_no>"+
                " </ns:appBody>"+
                " </ns:reqt>";

        String respmsg=SendXmlToESB.sendXml(
                 xml,
                "0200200020",
                "https://wxtest.xjrccb.com.cn/CRE/0200200020?wsdl"
        ) ;
        System.out.print(respmsg) ;
    }
}
