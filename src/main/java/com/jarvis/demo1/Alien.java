package com.jarvis.demo1;

import org.springframework.stereotype.Component;

@Component
public class Alien {
    private String aid;
    private String aname;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String show(){
        return "hello on webpage!!!";
    }
}
