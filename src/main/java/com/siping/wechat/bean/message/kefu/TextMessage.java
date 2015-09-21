package com.siping.wechat.bean.message.kefu;

import org.json.JSONObject;

public class TextMessage extends Message {
    private Text text;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public JSONObject generateJsonString() throws Exception {
        JSONObject jsonObject = super.generateJsonString();
        jsonObject.put("text", getText().generateJsonString());
        return jsonObject;
    }

}
