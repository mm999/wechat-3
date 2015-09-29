package com.siping.wechat.util.gongzhong;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.siping.wechat.bean.JSSDKTicket;
import com.siping.wechat.bean.WeChatAccount;

public class JSSDKInterfaceTest {
    private static WeChatAccount weChatAccount = new WeChatAccount();

    @Before
    public void createWeChatAccountTest() throws Exception {
        weChatAccount.setAppid("wx90f846fb078ece3c");
        weChatAccount.setAppsecret("eb550804df5ccf87a0d683ae7623066f ");
        weChatAccount.setToken("sipingsoft");
        BasicInterface.getAccessToken(weChatAccount);
    }

    @Test
    public void getJSTicketTest() throws Exception {
        JSSDKTicket jsTicket = JSSDKInterface.getJSTicket(weChatAccount);
        Assert.assertNotNull(jsTicket);
    }
}
