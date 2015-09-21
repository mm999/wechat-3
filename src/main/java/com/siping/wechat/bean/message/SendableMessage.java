package com.siping.wechat.bean.message;

import org.json.JSONObject;


public interface SendableMessage {

    public JSONObject generateJsonString() throws Exception;

}
