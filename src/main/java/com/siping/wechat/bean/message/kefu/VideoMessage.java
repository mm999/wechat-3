package com.siping.wechat.bean.message.kefu;

import org.json.JSONObject;

public class VideoMessage extends Message {
    private VideoMedia video;

    public VideoMedia getVideo() {
        return video;
    }

    public void setVideo(VideoMedia video) {
        this.video = video;
    }

    public JSONObject generateJsonString() throws Exception {
        JSONObject jsonObject = super.generateJsonString();
        jsonObject.put("video", this.getVideo().generateJsonString());
        return jsonObject;
    }
}
