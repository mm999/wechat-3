package com.siping.wechat.bean.message.kefu;

import org.json.JSONObject;

public class MusicMessage extends Message {
    private MusicMedia music;

    public MusicMedia getMusic() {
        return music;
    }

    public void setMusic(MusicMedia music) {
        this.music = music;
    }

    public JSONObject generateJsonString() throws Exception {
        JSONObject jsonObject = super.generateJsonString();
        jsonObject.put("music", this.getMusic().generateJsonString());
        return jsonObject;
    }
}
