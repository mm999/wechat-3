package com.siping.wechat.util.gongzhong;

import org.json.JSONObject;

import com.siping.wechat.WeChatConstant;
import com.siping.wechat.bean.JSSDKTicket;
import com.siping.wechat.bean.WeChatAccount;
import com.siping.wechat.util.WeChatUtil;

public class JSSDKInterface {
    /**
     * 刷新调用jssdk的ticket
     * @param appid
     * @param appSecret
     * @return
     */
    public static JSSDKTicket getJSTicket(WeChatAccount wechatAccount) throws Exception {
        String url = WeChatConstant.GET_JSAPI_TICKET;
        String requestUrl = url.replace("ACCESS_TOKEN", wechatAccount.getAccessToken().getToken());
        JSONObject jsonObject = WeChatUtil.sendHttpRequestAndParseResultToJsonobject(requestUrl, "GET", null);
        if(jsonObject.getInt(WeChatConstant.JSON_ERRCODE_KEY) != 0){
            throw new Exception(jsonObject.getString(WeChatConstant.JSON_ERRMSG_KEY));
        }

        JSSDKTicket ticket = null;
        try {
            ticket = new JSSDKTicket();
            ticket.setTicket(jsonObject.getString("ticket"));
            ticket.setExpiresIn(jsonObject.getInt("expires_in"));
        } catch (Exception e) {
            throw e;
        }

        return ticket;
    }
}
