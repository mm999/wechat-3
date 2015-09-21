package com.siping.wechat.bean.message.kefu;

import org.json.JSONObject;

public class ImageMessage extends Message {
    private Media image;

    public Media getImage() {
        return image;
    }

    public void setImage(Media image) {
        this.image = image;
    }

    public JSONObject generateJsonString() throws Exception {
        JSONObject jsonObject = super.generateJsonString();
        jsonObject.put("image", this.getImage().generateJsonString());
        return jsonObject;
    }
}
