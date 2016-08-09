package com.andmobi.myweather.modle;

/**
 * Description:
 * Created by andmobi003 on 2016/8/1 17:50
 */
public class BaseResponse<T> {
    private String error_code; /*返回码 0为成功*/


    private String reason; /*返回信息*/


    private T result;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
