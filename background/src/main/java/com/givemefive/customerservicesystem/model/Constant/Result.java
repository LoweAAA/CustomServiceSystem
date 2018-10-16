package com.givemefive.customerservicesystem.model.Constant;

public class Result {

    private boolean isComplete = false;//判断操作是否成功

    private Object data;//返回数据

    private String flag; //结果标志

    private String ERRmessage = "";

    private String Token = "";

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

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

    public void writeToResult(Object data,String flag,String errMessage, Boolean isComplete){
        this.data = data;
        this.flag = flag;
        this.ERRmessage = errMessage;
        this.isComplete = isComplete;
    }


    public String toString(){
        return "isComplete: " + isComplete + "\n"
                + "data: " + data + "\n"
                + "flag: " + flag + "\n"
                + "ERRmessage: " + ERRmessage ;
    }
}
