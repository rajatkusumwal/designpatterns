package com.data.inn.proxypattern.accessproxy.domain;

public class PersonImpl implements Person{

    String name;
    String gender;
    String interest;
    int geekRating;

    public PersonImpl(String name, String gender, String interest, int geekRating) {
        this.name = name;
        this.gender = gender;
        this.interest = interest;
        this.geekRating = geekRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public int getGeekRating() {
        return geekRating;
    }

    public void setGeekRating(int geekRating) {
        this.geekRating = geekRating;
    }
}
