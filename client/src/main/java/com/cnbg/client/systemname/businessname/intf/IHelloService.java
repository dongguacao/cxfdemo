package com.cnbg.client.systemname.businessname.intf;

import com.cnbg.client.systemname.businessname.bean.SampleRequest;
import com.cnbg.client.systemname.businessname.bean.SampleResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//定义服务名称
@WebService(targetNamespace = "http://service.cnbg.com.cn/systemname/businessname/intf")
//使用此注解 可在请求报文中不携带方法名称
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IHelloService {
    //定义一个方法 action为调用的 标识，相当于requestmapping
    @WebMethod(action = "test")
    //定义响应参数的参数名称，以及namespace
    @WebResult(name = "SampleResponse",targetNamespace = "http://service.cnbg.com/systemname/businessname/bean")
    SampleResponse sayHi(@WebParam(name="SampleRequest",targetNamespace = "http://service.cnbg.com/systemname/businessname/bean") SampleRequest sampleRequest);

}