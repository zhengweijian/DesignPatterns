package org.dimhat.demo19.event;


import org.dimhat.demo19.EventSource;

/**
 * 注册事件
 * @author : zwj
 * @data : 2016/10/27
 */
public class RegisterEvent extends EventSource {

    public RegisterEvent() {
        super("Register Event");
    }

    private String loginName;

    private String email;

    private String password;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
