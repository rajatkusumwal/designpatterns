package com.data.inn.proxypattern.accessproxy.domain;

public interface Person {

    String getName();
    String getGender();
    String getInterest();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterest(String interest);
    void setGeekRating(int geekRating);
}
