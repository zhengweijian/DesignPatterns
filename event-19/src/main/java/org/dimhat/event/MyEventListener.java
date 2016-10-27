package org.dimhat.event;

import java.util.EventListener;

/**
 * 监听器父类，订阅者
 * @author : zwj
 * @data : 2016/10/27
 */
public abstract class MyEventListener implements EventListener {

    public abstract String getName();

    public void handleEvent(EventSource event){
        System.out.println(this.getName()+" begin handle "+event.getName());
    }

    public void listen(EventSource event){
        event.addListener(this);
    }
}
