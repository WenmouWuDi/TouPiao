package com.cssl.vo;

/**
 * Created by 我的电脑 on 2018/12/15.
 */
public class UserVo {
    private int uid1;
    private String username;
    private String password;
    private String isAdmin;
    private String isOnline;

    public int getUid1() {
        return uid1;
    }

    public void setUid1(int uid1) {
        this.uid1 = uid1;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }
}
