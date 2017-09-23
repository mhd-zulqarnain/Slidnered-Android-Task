package com.example.zulqarnain.vivzrecycler;

/**
 * Created by Zul Qarnain on 7/31/2017.
 */

public class Students {
    String name;
    String Subject;

    public Students(String name, String subject) {
        this.name = name;
        Subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
