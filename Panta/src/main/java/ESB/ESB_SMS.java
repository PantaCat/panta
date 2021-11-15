package ESB;

import org.junit.Test;

public class ESB_SMS {
    @Test
    public static void main(String[] args) throws Exception {
        String xml = " <ns:reqt  xmlns:ns=\"http://esb.xjrccb.com/9900200001\">"+
                " <ns:svcHead>"+
                " <ns:SvcId>9900200001</ns:SvcId>"+
                " <ns:OptId>01</ns:OptId>"+
                " <ns:VerNo>1.0.0.0</ns:VerNo>"+
                " <ns:CsmId>8888</ns:CsmId>"+
                " <ns:CsmTms>2008-09-29T01:49:45</ns:CsmTms>"+
                " <ns:CsmSeqNo>sghfhrdr5rssdgg5etesg5eet5yge5</ns:CsmSeqNo>"+
                " </ns:svcHead>"+
                " <ns:extHead/>"+
                " <ns:appHead>"+
                " <ns:BpkSendTms>0</ns:BpkSendTms>"+
                " <ns:ReqBrcNo>8888</ns:ReqBrcNo>"+
                " <ns:BsnNo>8888</ns:BsnNo>"+
                " <ns:AuthNo>8888</ns:AuthNo>"+
                " </ns:appHead>"+
                " <ns:appBody>"+
                " <ns:OpenCardBrc>string</ns:OpenCardBrc>"+
                " <ns:MblNo>19136133770</ns:MblNo>"+
                " <ns:SmsCott>【uuu】，。</ns:SmsCott>"+
                " </ns:appBody>"+
                " </ns:reqt>";

        String xx = "<ns:reqt  xmlns:ns=\"http://esb.xjrccb.com/9900200001\">" +
                " <ns:svcHead>" +
                "  <ns:SvcId>9900200001</ns:SvcId>" +
                "  <ns:OptId>01</ns:OptId>" +
                "  <ns:VerNo>1.0.0.0</ns:VerNo>" +
                "  <ns:CsmId>8888</ns:CsmId>" +
                "  <ns:CsmTms>2021-11-11T19:56:37</ns:CsmTms>" +
                "  <ns:CsmSeqNo>sghfhrdr5rssdgg5efdfdfdffdtesg5eet5yge5</ns:CsmSeqNo>" +
                " </ns:svcHead>" +
                " <ns:extHead>" +
                "  <ns:FileFlag>0</ns:FileFlag>" +
                " </ns:extHead>" +
                " <ns:appHead>" +
                "  <ns:ReqBrcNo>8888</ns:ReqBrcNo>" +
                "  <ns:BsnNo>8888</ns:BsnNo>" +
                "  <ns:BpkSendTms>0</ns:BpkSendTms>" +
                "  <ns:AuthNo>8888</ns:AuthNo>" +
                " </ns:appHead>" +
                " <ns:appBody>" +
                "  <ns:MblNo>19988886666</ns:MblNo>" +
                "  <ns:OpenCardBrc>String</ns:OpenCardBrc>" +
                "  <ns:SmsCott>ttt</ns:SmsCott>" +
                " </ns:appBody>" +
                " </ns:reqt>";

        String respmsg=SendXmlToESB.sendXml(
                 xx,
                "9900200001",
                "https://ebank.test.xjrccb.com.cn/CSMS/9900200001"
        ) ;
        System.out.print(respmsg) ;
    }
}
