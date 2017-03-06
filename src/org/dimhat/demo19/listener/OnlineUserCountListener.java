package org.dimhat.demo19.listener;


import org.dimhat.demo19.EventSource;
import org.dimhat.demo19.MyEventListener;
import org.dimhat.demo19.event.LoginEvent;
import org.dimhat.demo19.event.LogoutEvent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : zwj
 * @data : 2016/10/27
 */
public class OnlineUserCountListener extends MyEventListener {

    private AtomicInteger onlineUserCount = new AtomicInteger(0);

    private final String template = "用户 %s %s，当前在线用户数：%d";

    @Override
    public String getName() {
        return "Online User Count Listener";
    }

    @Override
    public void handleEvent(EventSource event) {
        super.handleEvent(event);
        if(event instanceof LoginEvent){
            int i = onlineUserCount.addAndGet(1);
            System.out.println(String.format(template, ((LoginEvent) event).getNickName(),"登录",i));
        }
        else if(event instanceof LogoutEvent){
            int i = onlineUserCount.decrementAndGet();
            System.out.println(String.format(template, ((LogoutEvent) event).getNickName(),"退出",i));
        }
    }
}
