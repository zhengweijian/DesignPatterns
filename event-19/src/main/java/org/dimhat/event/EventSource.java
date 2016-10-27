package org.dimhat.event;

import java.util.HashSet;
import java.util.Set;

/**
 * 事件源，发布者
 *
 * @author : zwj
 * @data : 2016/10/27
 */
public abstract class EventSource {

    private String name;

    private Set<MyEventListener> listeners;

    public EventSource(String name) {
        this.name = name;
        listeners = new HashSet<>();
    }

    public void addListener(MyEventListener listener){
        listeners.add(listener);
    }

    public void notifyListeners(){
        for (MyEventListener listener : listeners) {
            listener.handleEvent(this);
        }
    }

    public String getName() {
        return name;
    }
}
