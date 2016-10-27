package org.dimhat.event;

import org.dimhat.event.event.LoginEvent;
import org.dimhat.event.event.LogoutEvent;
import org.dimhat.event.event.RegisterEvent;
import org.dimhat.event.listener.EmailSendListener;
import org.dimhat.event.listener.OnlineUserCountListener;

/**
 * @author : zwj
 * @data : 2016/10/27
 */
public class Main {

    public static void main(String[] args) {
        //发布者
        RegisterEvent registerEvent= new RegisterEvent();
        LoginEvent loginEvent= new LoginEvent();
        LogoutEvent logoutEvent = new LogoutEvent();
        //订阅者
        MyEventListener emailSendListener = new EmailSendListener();
        MyEventListener onlineUserCountListener = new OnlineUserCountListener();
        //初始化订阅发布关系
        emailSendListener.listen(registerEvent);
        onlineUserCountListener.listen(loginEvent);
        onlineUserCountListener.listen(logoutEvent);

        //使用
        registerEvent.setEmail("dimhat@qq.com");
        registerEvent.setLoginName("dimhat");
        registerEvent.notifyListeners();

        loginEvent.setNickName("dimhat");
        loginEvent.notifyListeners();

        loginEvent.setNickName("admin");
        loginEvent.notifyListeners();

        logoutEvent.setNickName("admin");
        logoutEvent.notifyListeners();
    }
}
