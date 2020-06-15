package cn.com.desmart.cxfdemo.service;

import cn.com.desmart.cxfdemo.pojo.SampleRequest;
import cn.com.desmart.cxfdemo.pojo.SampleResponse;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IHelloService {
    @WebResult(name = "SampleResponse",targetNamespace = "cn.com.desmart.cxfdemo.pojo")
    public SampleResponse sayHi(@WebParam(name="sampleRequest") SampleRequest sampleRequest);

}