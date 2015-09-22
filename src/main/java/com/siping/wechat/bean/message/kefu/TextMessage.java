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

    public JSONObject generateJsonObject() throws Exception {
        JSONObject jsonObject = super.generateJsonObject();
        jsonObject.put("text", getText().generateJsonObject());
        return jsonObject;
    }

}
