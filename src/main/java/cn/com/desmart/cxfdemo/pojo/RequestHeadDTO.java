package cn.com.desmart.cxfdemo.pojo;

public class RequestHeadDTO {
    String reqSeqNo;
    String serviceName;
    String version;
    String consumerID;

    public String getReqSeqNo() {
        return reqSeqNo;
    }

    public void setReqSeqNo(String reqSeqNo) {
        this.reqSeqNo = reqSeqNo;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getConsumerID() {
        return consumerID;
    }

    public void setConsumerID(String consumerID) {
        this.consumerID = consumerID;
    }
}
