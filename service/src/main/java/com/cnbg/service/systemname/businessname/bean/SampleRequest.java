package com.cnbg.service.systemname.businessname.bean;

import com.cnbg.service.commom.head.RequestHeadDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

//添加此注解即可让参数按照顺序排列

@XmlAccessorType( XmlAccessType.FIELD )
public class SampleRequest {
    @XmlElement(required = true)
    private RequestHeadDTO requestHead;
    @XmlElement(required = true)
    private SampleRequestDTO requestBody;

    public RequestHeadDTO getRequestHead() {
        return requestHead;
    }

    public void setRequestHead(RequestHeadDTO requestHead) {
        this.requestHead = requestHead;
    }

    public SampleRequestDTO getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(SampleRequestDTO requestBody) {
        this.requestBody = requestBody;
    }
}
