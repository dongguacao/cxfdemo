package com.cnbg.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class InvokeTest {

    //服务端wsdl
    private static String wsdl = "http://172.25.37.47:7800/cxf/test?wsdl";

    public static void main(String[] args) throws Exception {
        InputStream soapInputStream = getSoapInputStream("1", "2", "3", "4", "5", "6", "7");

        byte[] bytes = new byte[1024];
        soapInputStream.read(bytes);

        System.out.println(new String(bytes));

    }


    private static InputStream getSoapInputStream(String reqSeqNo, String serviceName, String version, String consumerID, String providerID, String sign, String input1) throws Exception {
        try {
            //获取请求规范
            String soap = getSoapRequest(reqSeqNo,serviceName,version,consumerID,providerID,sign,input1);
            if (soap == null) {
                return null;
            }
            //调用的天气预报webserviceURL
            URL url = new URL(wsdl);
            URLConnection conn = url.openConnection();
            conn.setUseCaches(false);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Length", Integer.toString(soap.length()));
            conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            //调用的接口方法是“test” 这个参数取决于服务端 @WebMethod(action = "test") 这个注解
            conn.setRequestProperty("SOAPAction", "test");
            OutputStream os = conn.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
            osw.write(soap);
            osw.flush();
            osw.close();
            //获取webserivce返回的流
            InputStream is = conn.getInputStream();
            return is;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private static String getSoapRequest(String reqSeqNo, String serviceName, String version, String consumerID, String providerID, String sign, String input1) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><tns0:Envelope xmlns:tns0=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns0=\"http://service.cnbg.com/commom/head\" xmlns:tns1=\"http://service.cnbg.com/systemname/businessname/bean\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <tns0:Header/>\n" +
                "  <tns0:Body>\n" +
                "    <tns1:SampleRequest>\n" +
                "      <tns1:requestHead>\n" +
                "        <ns0:reqSeqNo>" +
                reqSeqNo +
                "</ns0:reqSeqNo>\n" +
                "        <ns0:serviceName>" +
                serviceName +
                "</ns0:serviceName>\n" +
                "        <ns0:version>" +
                version +
                "</ns0:version>\n" +
                "        <ns0:consumerID>" +
                consumerID +
                "</ns0:consumerID>\n" +
                "        <ns0:providerID>" +
                providerID +
                "</ns0:providerID>\n" +
                "        <ns0:sign>" +
                sign +
                "</ns0:sign>\n" +
                "      </tns1:requestHead>\n" +
                "      <tns1:requestBody>\n" +
                "        <tns1:input1>" +
                input1 +
                "</tns1:input1>\n" +
                "      </tns1:requestBody>\n" +
                "    </tns1:SampleRequest>\n" +
                "  </tns0:Body>\n" +
                "</tns0:Envelope>");
        return sb.toString();
    }


}
