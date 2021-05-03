package com.sh.techbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private String userid;

    @Column
    private String userpwd;

    @Column
    private String username;

    @Column
    private int role;

    public Member() {}

    public Member(String userid, String userpwd, String username, int role) {
        this.userid = userid;
        this.userpwd = userpwd;
        this.username = username;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userid='" + userid + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", username='" + username + '\'' +
                ", role=" + role +
                '}';
    }


    public String getUserid() {
        return userid;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public String getUsername() {
        return username;
    }

    public int getRole() {
        return role;
    }
}
