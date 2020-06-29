package com.cnbg.client;

import com.cnbg.client.commom.head.RequestHeadDTO;
import com.cnbg.client.systemname.businessname.bean.SampleRequest;
import com.cnbg.client.systemname.businessname.bean.SampleRequestDTO;
import com.cnbg.client.systemname.businessname.bean.SampleResponse;
import com.cnbg.client.systemname.businessname.intf.IHelloService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InvokeTest {

    //服务端wsdl
    private static String wsdl = "http://172.25.37.47:7800/cxf/test?wsdl";

    public static void main(String[] args) throws Exception {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:client.xml");
        IHelloService service = (IHelloService) ctx.getBean("sampleService");

        SampleRequest sampleRequest = new SampleRequest();
        RequestHeadDTO requestHead = new RequestHeadDTO();
        requestHead.setReqSeqNo("1231");
        requestHead.setConsumerID("31");
        requestHead.setProviderID("12");
        requestHead.setServiceName("321321");
        requestHead.setSign("321");
        requestHead.setVersion("aaa");
        sampleRequest.setRequestHead(requestHead);
        SampleRequestDTO requestBody = new SampleRequestDTO();
        requestBody.setInput1("132132");
        sampleRequest.setRequestBody(requestBody);
        SampleResponse sampleResponse = service.sayHi(sampleRequest);
        System.out.println(sampleResponse.getResponseBody().getOutput1());

    }

}
