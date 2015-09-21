package com.siping.wechat.bean.message.kefu;

import org.json.JSONObject;

public class CardMessage extends Message {
    private WxCard wxcard;

    public WxCard getWxcard() {
        return wxcard;
    }

    public void setWxcard(WxCard wxcard) {
        this.wxcard = wxcard;
    }

    public JSONObject generateJsonString() throws Exception {
        JSONObject jsonObject = super.generateJsonString();
        jsonObject.put("wxcard", this.getWxcard().generateJsonString());
        return jsonObject;
    }
}
