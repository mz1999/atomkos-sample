package com.apusic.samples.utils;

public class CodedResponse {

    private int retcode;

    private String message;

    private String userId;

    private String commodityCode;

    private int originalCount;

    private int count;

    public CodedResponse(int retcode, String message, String userId, String commodityCode, int originalCount, int count) {
        this.retcode = retcode;
        this.message = message;
        this.userId = userId;
        this.commodityCode = commodityCode;
        this.originalCount = originalCount;
        this.count = count;
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public int getOriginalCount() {
        return originalCount;
    }

    public void setOriginalCount(int originalCount) {
        this.originalCount = originalCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
