package com.cnbg.client.commom.head;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType( XmlAccessType.FIELD )
@XmlType(name = "ResponseHeadDTO")
public class ResponseHeadDTO {
    private String seqNo;
    private String reqSeqNo;
    private String respSeqNo;
    @XmlElement(required = true)
    private String status;
    private String esbCode;
    private String esbMessage;
    private String appCode;
    private String appMessage;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getReqSeqNo() {
        return reqSeqNo;
    }

    public void setReqSeqNo(String reqSeqNo) {
        this.reqSeqNo = reqSeqNo;
    }

    public String getRespSeqNo() {
        return respSeqNo;
    }

    public void setRespSeqNo(String respSeqNo) {
        this.respSeqNo = respSeqNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEsbCode() {
        return esbCode;
    }

    public void setEsbCode(String esbCode) {
        this.esbCode = esbCode;
    }

    public String getEsbMessage() {
        return esbMessage;
    }

    public void setEsbMessage(String esbMessage) {
        this.esbMessage = esbMessage;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppMessage() {
        return appMessage;
    }

    public void setAppMessage(String appMessage) {
        this.appMessage = appMessage;
    }
}
