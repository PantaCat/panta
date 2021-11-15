package ESB;

import org.junit.Test;

public class ESB_ZXCX {
    @Test
    public static void main(String[] args) throws Exception {
        String xml = " <ns:reqt  xmlns:ns=\"http://esb.xjrccb.com/0500300038\">"+
                " <ns:svcHead>"+
                " <ns:SvcId>0500300038</ns:SvcId>"+
                " <ns:OptId>01</ns:OptId>"+
                " <ns:VerNo>1.0</ns:VerNo>"+
                " <ns:CsmId>sheji</ns:CsmId>"+
                " <ns:CsmTms>2008-09-29T01:49:45</ns:CsmTms>"+
                " <ns:CsmSeqNo>123</ns:CsmSeqNo>"+
                " </ns:svcHead>"+
                " <ns:extHead/>"+
                " <ns:appHead>"+
                " <ns:acceptSysId>888</ns:acceptSysId>"+
                " <ns:operationType>01</ns:operationType>"+
                " </ns:appHead>"+
                " <ns:appBody>"+
                " <ns:ReportType>19136133770</ns:ReportType>"+
                " <ns:QueryUserID>test</ns:QueryUserID>"+
                " <ns:QueryOrgID>string</ns:QueryOrgID>"+
                " <ns:CustomerName>string</ns:CustomerName>"+
                " <ns:CertType>string</ns:CertType>"+
                " <ns:CertID>string</ns:CertID>"+
                " <ns:QueryReason>string</ns:QueryReason>"+
                " <ns:QueryAccessStrategy>string</ns:QueryAccessStrategy>"+
                " <ns:RequestSource>string</ns:RequestSource>"+
                " <ns:AuthFlag>string</ns:AuthFlag>"+
                " </ns:appBody>"+
                " </ns:reqt>";

        String respmsg=SendXmlToESB.sendXml(
                 xml,
                "0500300038",
                "https://wxtest.xjrccb.com.cn/CCSP/0500300038"
        ) ;
        System.out.print(respmsg) ;
    }
}
