package com.siping.wechat.bean.message.kefu;

import org.json.JSONObject;

public class VoiceMessage extends Message {
    private Media voice;

    public Media getVoice() {
        return voice;
    }

    public void setVoice(Media voice) {
        this.voice = voice;
    }

    public JSONObject generateJsonString() throws Exception {
        JSONObject jsonObject = super.generateJsonString();
        jsonObject.put("voice", this.getVoice().generateJsonString());
        return jsonObject;
    }
}
