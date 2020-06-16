package com.cnbg.service.systemname.businessname.intf;


import com.cnbg.service.commom.head.ResponseHeadDTO;
import com.cnbg.service.systemname.businessname.bean.SampleRequest;
import com.cnbg.service.systemname.businessname.bean.SampleResponse;
import com.cnbg.service.systemname.businessname.bean.SampleResponseDTO;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(endpointInterface= "com.cnbg.service.systemname.businessname.intf.IHelloService",serviceName="CXFTEST")
public class HelloService implements IHelloService {

    @Override
    public SampleResponse sayHi(SampleRequest sampleRequest) {
        SampleResponse sampleResponse = new SampleResponse();
        ResponseHeadDTO responseHead = new ResponseHeadDTO();
        responseHead.setReqSeqNo(sampleRequest.getRequestHead().getReqSeqNo());
        sampleResponse.setResponseHead(responseHead);
        SampleResponseDTO responseBody = new SampleResponseDTO();
        responseBody.setOutput1("sadsa");
        sampleResponse.setResponseBody(responseBody);
        return sampleResponse;
    }
}