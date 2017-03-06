package org.dimhat.demo19.event;


import org.dimhat.demo19.EventSource;

/**
 * 登录事件
 * @author : zwj
 * @data : 2016/10/27
 */
public class LoginEvent extends EventSource {

    public LoginEvent() {
        super("Login Event");
    }

    private Long userId;

    private String nickName;

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
