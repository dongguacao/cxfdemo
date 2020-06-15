package cn.com.desmart.cxfdemo.service;


import cn.com.desmart.cxfdemo.pojo.ResponseHeadDTO;
import cn.com.desmart.cxfdemo.pojo.SampleRequest;
import cn.com.desmart.cxfdemo.pojo.SampleResponse;
import cn.com.desmart.cxfdemo.pojo.SampleResponseDTO;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(endpointInterface="cn.com.desmart.cxfdemo.service.IHelloService",serviceName="helloWorld")
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