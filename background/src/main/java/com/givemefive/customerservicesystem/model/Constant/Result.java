package com.givemefive.customerservicesystem.model.Constant;

public class Result {

    private boolean isComplete = false;//判断操作是否成功

    private String ERRmessage = "";

    public String getERRmessage() {
        return ERRmessage;
    }

    public void setERRmessage(String ERRmessage) {
        this.ERRmessage = ERRmessage;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
