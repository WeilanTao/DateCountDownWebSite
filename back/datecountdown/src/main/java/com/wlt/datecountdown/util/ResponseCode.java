package com.wlt.datecountdown.util;

public enum ResponseCode {

    SUCCESS( 200, "success" ),

    FAILURE( 400, "failure" ),

    UNAUTHORIZED( 401, "unauthorized" ),

    FORBIDDEN( 403, "Forbidden" ),

    NOT_FOUND( 404, "Not found" ),

    INTERNAL_SERVER_ERROR( 500, "Inner server error" );

    private int code;
    private String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
