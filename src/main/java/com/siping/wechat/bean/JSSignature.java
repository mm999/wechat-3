package com.siping.wechat.bean;

import java.io.Serializable;

public class JSSignature implements Serializable {
    private JSSDKTicket ticket;
    private String url;
    private String noncestr = Math.random() + "";
    private Long timestamp = System.currentTimeMillis();
    private String signature = "";

    public JSSDKTicket getTicket() {
        return ticket;
    }
    public void setTicket(JSSDKTicket ticket) {
        this.ticket = ticket;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getNoncestr() {
        return noncestr;
    }
    public void setNoncestr(String noncestr) {
        this.noncestr = noncestr;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
}
