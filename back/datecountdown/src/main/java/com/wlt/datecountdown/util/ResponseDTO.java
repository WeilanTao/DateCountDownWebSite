package com.wlt.datecountdown.util;

import java.io.Serializable;

/**
 * Interface Default Response Data Transfer Object
 * @param <T>
 */
public class ResponseDTO<T> implements Serializable {
    private int  responseCode;
    private boolean isSuccess;
    private T responseData;
    private String responseMsg;

    public ResponseDTO(){

    }

    public ResponseDTO(int responseCode,String responseMsg,T responseData){
        this.responseCode=responseCode;
        this.responseData=responseData;
        this.responseMsg=responseMsg;

    }
    public ResponseDTO(int responseCode, boolean isSuccess, T responseData, String responseMsg){
        this.isSuccess=isSuccess;
        this.responseCode=responseCode;
        this.responseData=responseData;
        this.responseMsg=responseMsg;

    }

    public int getResponseCode() {
        return responseCode;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public T getResponseData() {
        return responseData;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }



    public Boolean isOk(){
        return ResponseCode.SUCCESS.getCode()==this.responseCode;

    }
    public static <T> ResponseDTO<T> ok(T data){
        int code= ResponseCode.SUCCESS.getCode();

        if (data instanceof Boolean && Boolean.FALSE.equals(data)) {
            code = ResponseCode.FAILURE.getCode();
        }
        return new ResponseDTO(code,"SUCCESS",data);
    }

    public static <T> ResponseDTO<T> failed(String msg){
        return new ResponseDTO( ResponseCode.FAILURE.getCode(),msg,null);
    }

    public static <T> ResponseDTO<T> failed(MyErrorCode errorCode) {
        return new ResponseDTO(errorCode.getCode(), errorCode.getMsg(), null);
    }


    public String toString() {
        return "R(code=" + this.getResponseCode() + ", data=" + this.getResponseData() + ", msg=" + this.getResponseMsg() + ")";
    }


}
