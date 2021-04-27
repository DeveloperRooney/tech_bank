package com.sh.techbank.domain;

public class Member {

    Member() {}

    private String userid;
    private String userpwd;
    private String username;
    private int role;

    public String getUserid() {
        return userid;
    }

    public String getUserpwd() {
        return userpwd;
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
}
