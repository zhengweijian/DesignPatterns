package org.dimhat.event.event;

import org.dimhat.event.EventSource;

/**
 * 退出事件
 * @author : zwj
 * @data : 2016/10/27
 */
public class LogoutEvent extends EventSource{

    private Long userId;

    private String nickName;

    public LogoutEvent() {
        super("Logout Event");
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
