package com.cnbg.service.systemname.businessname.intf;


import com.cnbg.service.commom.head.ResponseHeadDTO;
import com.cnbg.service.systemname.businessname.bean.SampleRequest;
import com.cnbg.service.systemname.businessname.bean.SampleResponse;
import com.cnbg.service.systemname.businessname.bean.SampleResponseDTO;
import org.apache.cxf.interceptor.InInterceptors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@InInterceptors(interceptors={"com.cnbg.service.config.AuthInterceptor"})
@WebService(endpointInterface= "com.cnbg.service.systemname.businessname.intf.IHelloService",targetNamespace = "http://service.cnbg.com.cn/systemname/businessname/intf")
public class HelloService implements IHelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
    @Override
    public SampleResponse sayHi(SampleRequest sampleRequest) {
        SampleResponse sampleResponse = new SampleResponse();
        ResponseHeadDTO responseHead = new ResponseHeadDTO();
        responseHead.setReqSeqNo(sampleRequest.getRequestHead().getReqSeqNo());
        sampleResponse.setResponseHead(responseHead);
        SampleResponseDTO responseBody = new SampleResponseDTO();
        responseBody.setOutput1("sadsa");
        logger.info("sadsa");
        sampleResponse.setResponseBody(responseBody);
        return sampleResponse;
    }
}