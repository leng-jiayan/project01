package com.itheima.springboot.domain;

import java.util.Date;

public class User {
    private  Integer id;
    private String usernamer;
    private String password;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usernamer='" + usernamer + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsernamer(String usernamer) {
        this.usernamer = usernamer;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public String getUsernamer() {
        return usernamer;
    }

    public String getPassword() {
        return password;
    }

    public Date getBirthday() {
        return birthday;
    }
}
