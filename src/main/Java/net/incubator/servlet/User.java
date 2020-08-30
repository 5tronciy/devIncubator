package net.incubator.servlet;

/**
 * Created by Stronciy on 30.08.2020.
 */
public class User {
    private int userid;
    private String name;
    private String sureName;

    public int getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public User(int userid, String name, String sureName) {
        this.userid = userid;
        this.name = name;
        this.sureName = sureName;
    }
}
