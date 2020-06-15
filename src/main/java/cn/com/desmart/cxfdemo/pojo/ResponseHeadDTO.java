package cn.com.desmart.cxfdemo.pojo;

public class ResponseHeadDTO {
    String seqNo;
    String reqSeqNo;
    String respSeqNo;
    String status;

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
}
