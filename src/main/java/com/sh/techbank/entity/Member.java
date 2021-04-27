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

}
