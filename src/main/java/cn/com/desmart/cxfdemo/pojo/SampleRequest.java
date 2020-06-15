package cn.com.desmart.cxfdemo.pojo;

public class SampleRequest {
    private RequestHeadDTO requestHead;
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
