package ESB;

import org.junit.Test;

public class ESB_ECIFMN2001 {
    @Test
    public static void main(String[] args) throws Exception {
        String xml = " <ns:reqt  xmlns:ns=\"http://esb.xjrccb.com/1500200007\">"+
                " <ns:svcHead>"+
                " <ns:SvcId>1500200007</ns:SvcId>"+
                " <ns:OptId>01</ns:OptId>"+
                " <ns:VerNo>1.0</ns:VerNo>"+
                " <ns:CsmId>sheji</ns:CsmId>"+
                " <ns:CsmTms>2008-09-29T01:49:45</ns:CsmTms>"+
                " <ns:CsmSeqNo>123</ns:CsmSeqNo>"+
                " </ns:svcHead>"+
                " <ns:extHead>"+
                " <ns:FileFlag>0</ns:FileFlag>"+
                " </ns:extHead>"+
                " <ns:appHead>"+
                " <ns:sndAppCd>110001</ns:sndAppCd>"+
                " <ns:tranOrg>110001</ns:tranOrg>"+
                " <ns:teller>110001</ns:teller>"+
                " </ns:appHead>"+
                " <ns:appBody>"+
                " <ns:certificateType>110001</ns:certificateType>"+
                " <ns:certificateNo>511923199108080033</ns:certificateNo>"+
                " <ns:customerName>提莫</ns:customerName>"+
                " <ns:customerType>B201</ns:customerType>"+
                " <ns:certificatevalidDate>2008-09-29T01:49:45</ns:certificatevalidDate>"+
                " <ns:certificateExpiryDate>2008-09-29T01:49:45</ns:certificateExpiryDate>"+
                " <ns:nationality>CHN</ns:nationality>"+
                " <ns:sex>1</ns:sex>"+
                " <ns:occupation>1</ns:occupation>"+
                " <ns:addressList>"+
                " <ns:detail>"+
                " <ns:addressType>06</ns:addressType>"+
                " <ns:detailedAddress>222333</ns:detailedAddress>"+
                " </ns:detail>"+
                "</ns:addressList>"+
                "<ns:telephoneList>"+
                " <ns:detail>"+
                " <ns:telephoneAddresType>2</ns:telephoneAddresType>"+
                " <ns:mainTelephoneNumber>13566667777</ns:mainTelephoneNumber>"+
                " </ns:detail>"+
                "</ns:telephoneList>"+
                " </ns:appBody>"+
                " </ns:reqt>";

        System.out.println(xml);
        String respmsg=SendXmlToESB.sendXml(
                 xml,
                "1500200007",
                "https://wxtest.xjrccb.com.cn/CRM/1500200007"
        ) ;
        System.out.print(respmsg) ;
    }
}
