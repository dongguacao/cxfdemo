package com.cnbg.service.systemname.businessname.bean;

import com.cnbg.service.commom.head.ResponseHeadDTO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType( XmlAccessType.FIELD )
public class SampleResponse {
    @XmlElement(required = true)
    private ResponseHeadDTO responseHead;
    private SampleResponseDTO responseBody;

    public ResponseHeadDTO getResponseHead() {
        return responseHead;
    }

    public void setResponseHead(ResponseHeadDTO responseHead) {
        this.responseHead = responseHead;
    }

    public SampleResponseDTO getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(SampleResponseDTO responseBody) {
        this.responseBody = responseBody;
    }
}
