package ESB;


import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

public class ESB_XDGRXXTB2 {

    public static void sendTest(String url1, String paramStr){
        String result = null;
        Service service = new Service();
        Call call;
        try{
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(url1);
            call.setOperationName(new QName(url1,"synCustInfo"));
            call.addParameter("reqtJson", XMLType.XSD_STRING, ParameterMode.IN);
            call.setEncodingStyle("UTF-8");
            call.setReturnType(XMLType.XSD_STRING);
            result = (String) call.invoke(new Object[]{paramStr});
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public static void main(String[] args) throws Exception {
        String xml = "{\"operate_type\" : \"2\",\"party_id\" : \"00db18eb9b413c492c7d5bc038a2b0c5\",\"customer_num\" : \"000000125326427\",\"IncomeExpend\":[{\"incomeExpendDetail\":[{\"amt\":0,\"income_amt\":130000,\"income_detail\":\"\",\"income_name\":\"种植\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":30000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"生活\",\"payout_type\":\"111\"},{\"amt\":40000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"种植\",\"payout_type\":\"112\"}],\"year\":\"2014\",\"year_income_amount\":130000,\"year_margin\":60000,\"year_payout_amount\":70000},{\"incomeExpendDetail\":[{\"amt\":0,\"income_amt\":200000,\"income_detail\":\"\",\"income_name\":\"种植\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":20000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"生活\",\"payout_type\":\"111\"},{\"amt\":100000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"种植\",\"payout_type\":\"112\"}],\"year\":\"2015\",\"year_income_amount\":200000,\"year_margin\":80000,\"year_payout_amount\":120000},{\"incomeExpendDetail\":[{\"amt\":0,\"income_amt\":120000,\"income_detail\":\"\",\"income_name\":\"葡萄种植\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":30000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"生活支出\",\"payout_type\":\"111\"},{\"amt\":30000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"葡萄种植\",\"payout_type\":\"112\"}],\"year\":\"2016\",\"year_income_amount\":120000,\"year_margin\":60000,\"year_payout_amount\":60000},{\"incomeExpendDetail\":[{\"amt\":20000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"生活支出\",\"payout_type\":\"111\"},{\"amt\":10000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"葡萄种植\",\"payout_type\":\"112\"},{\"amt\":0,\"income_amt\":120000,\"income_detail\":\"\",\"income_name\":\"葡萄种植\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"}],\"year\":\"2017\",\"year_income_amount\":120000,\"year_margin\":90000,\"year_payout_amount\":30000},{\"incomeExpendDetail\":[{\"amt\":0,\"income_amt\":150000,\"income_detail\":\"\",\"income_name\":\"葡萄、棉花\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":80000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"种植支出\",\"payout_type\":\"112\"},{\"amt\":10000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"日常支出\",\"payout_type\":\"111\"}],\"year\":\"2012\",\"year_income_amount\":150000,\"year_margin\":60000,\"year_payout_amount\":90000},{\"incomeExpendDetail\":[{\"amt\":0,\"income_amt\":100000,\"income_detail\":\"\",\"income_name\":\"葡萄\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":30000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"日常\",\"payout_type\":\"111\"}],\"year\":\"2011\",\"year_income_amount\":100000,\"year_margin\":70000,\"year_payout_amount\":30000},{\"incomeExpendDetail\":[{\"amt\":0,\"income_amt\":100000,\"income_detail\":\"\",\"income_name\":\"354型拖拉机\",\"income_type\":\"114\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":0,\"income_amt\":200000,\"income_detail\":\"\",\"income_name\":\"葡萄、啤酒花\",\"income_type\":\"111\",\"payout_detail\":\"\",\"payout_name\":\"\",\"payout_type\":\"\"},{\"amt\":20000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"日常支出\",\"payout_type\":\"111\"},{\"amt\":150000,\"income_amt\":0,\"income_detail\":\"\",\"income_name\":\"\",\"income_type\":\"\",\"payout_detail\":\"\",\"payout_name\":\"种植支出\",\"payout_type\":\"112\"}],\"year\":\"2013\",\"year_income_amount\":300000,\"year_margin\":130000,\"year_payout_amount\":170000}],\"contact\":{\"address_code\":\"831101\",\"bide_address\":\"六工镇下六工村&三组\",\"bide_status\":\"1\",\"bide_year\":\"4\",\"email\":\"\",\"message_address\":\"下六工三组\",\"mobile_telephone\":\"13899607179\",\"phone\":\"\",\"unit_address\":\"\",\"unit_address_code\":\"\"},\"custInfo\":{\"party_id\":\"00db18eb9b413c492c7d5bc038a2b0c5\",\"customer_num\":\"000000125326427\",\"cust_name\":\"测试八\",\"id_no\":\"511423198911200550\",\"id_type\":\"1\",\"accumulation_fund_code\":\"\",\"age\":47,\"birthday\":\"1966-12-15\",\"career_year\":\"3\",\"company_name\":\"\",\"company_relation\":\"\",\"country\":\"101\",\"cust_classify_cd\":\"111\",\"cust_name_cd\":\"KRL_TEST1\",\"cust_poor_type\":\"\",\"degree_level\":\"0\",\"domicile\":\"新疆维吾尔自治区昌吉回族自治州昌吉市\",\"educational_level\":\"7\",\"finish_date\":\"\",\"finish_school\":\"\",\"gender\":\"2\",\"guarantee_loan_cust_type\":\"\",\"health_status\":\"1\",\"industry\":\"1\",\"is_accumulation_fund\":\"0\",\"is_in_card\":\"1\",\"is_medical_safety\":\"0\",\"is_mybank_partner\":\"0\",\"marital_status\":\"3\",\"medical_code\":\"\",\"mybank_loan_card_status\":\"1\",\"mybank_stock_amount\":0,\"nationality\":\"10\",\"native_place\":\"下六工村\",\"native_property\":\"1\",\"occupation\":\"9\",\"personal_type\":\"1\",\"political_status\":\"5\",\"poor_ind\":\"\",\"safeguard_code\":\"\",\"small_owner_ind\":\"\",\"speciality\":\"\",\"team\":\"三组\",\"technical_post\":\"1\"},\"family\":{\"familyMember\":[{\"name\":\"测试八的配偶\",\"customer_relation\":\"1\",\"certificate_type\":\"1\",\"certificate_code\":\"511423198911200569\",\"birthday\":\"1989-11-20\"},{\"name\":\"子女\",\"customer_relation\":\"2\",\"certificate_type\":\"1\",\"certificate_code\":\"511423198911200059\",\"birthday\":\"1989-11-20\"}],\"family_amount\":3,\"family_explain\":\"已婚\",\"family_maintain_population\":1,\"family_member_health\":\"1\",\"family_work_amount\":2},\"manager\":{\"user_num\":\"8029991001\",\"org_cd\":\"8029991\"},\"collateral\":[{\"acquire_way_of_collateral_cd\":\"1\",\"all_pledge_ind\":\"1\",\"asset_status\":\"1\",\"blemish_ind\":\"0\",\"book_value\":2000000,\"city_cd\":\"101650100\",\"collateral_card_department\":\"12\",\"collateral_name\":\"房地产12\",\"guaranty_id\":\"\",\"collateral_type_cd\":\"1\",\"common_assets_ind\":\"0\",\"common_owner_name\":\"\",\"district_cd\":\"101650107\",\"evaluate_date\":\"2019-02-01 08:00:00.0\",\"forbid_circulate_ind\":\"0\",\"handover_date\":\"2019-03-01 08:00:00.0\",\"invalid_ind\":\"0\",\"is_state_sector_approval\":\"\",\"market_value\":2000000,\"nationalisation_ind\":\"0\",\"nationality_cd\":\"101\",\"property_disputed_ind\":\"0\",\"province_cd\":\"101210000\",\"rented_licensed_ind\":\"0\",\"right_cert_type_cd\":\"15\",\"right_certification_num\":\"\",\"street_address\":\"1\",\"submitting_date\":\"2021-11-05 08:00:00.0\",\"takeover_ind\":\"1\",\"way_guaranty_effective_cd\":\"1\"}],\"work\":{\"business\":\"\",\"department\":\"\",\"fax\":\"\",\"join_unit_date\":\"\",\"linkman\":\"\",\"linkman_dept\":\"\",\"linkman_phone\":\"\",\"telephone\":\"\",\"unit_name\":\"\",\"unit_property\":\"\",\"work_years\":\"\"}}";

        ESB_XDGRXXTB2.sendTest(
                "https://wxtest.xjrccb.com.cn/CRE/0200200020?wsdl",xml
        ) ;
    }
}
