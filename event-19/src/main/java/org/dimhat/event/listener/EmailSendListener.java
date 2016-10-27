package org.dimhat.event.listener;

import org.dimhat.event.EventSource;
import org.dimhat.event.MyEventListener;
import org.dimhat.event.event.RegisterEvent;

/**
 * @author : zwj
 * @data : 2016/10/27
 */
public class EmailSendListener extends MyEventListener {

    private final String template="用户名 %s 注册，发送邮件到 %s";

    @Override
    public String getName() {
        return "Email Send Listener";
    }

    @Override
    public void handleEvent(EventSource event) {
        super.handleEvent(event);
        if(event instanceof RegisterEvent){
            RegisterEvent registerEvent = (RegisterEvent) event;
            System.out.println(String.format(template,registerEvent.getLoginName(),registerEvent.getEmail()));
        }
    }
}
