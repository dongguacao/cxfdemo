package cn.com.desmart.cxfdemo.pojo;

public class SampleResponse {

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
