package com.SpringBootPlayground.SpringApp3HelloWorldSpring;

public class Address {

    private String ad1;
    private String ad2;
    public Address(String ad1,String ad2) {
        this.ad1 = ad1;
        this.ad2 = ad2;
    }

    public Address() {
    }

    public String getAd1() {
        return ad1;
    }

    public void setAd1(String ad1) {
        this.ad1 = ad1;
    }

    public String getAd2() {
        return ad2;
    }

    public void setAd2(String ad2) {
        this.ad2 = ad2;
    }

    @Override
    public String toString() {
        return "Address{" +
                "ad1='" + ad1 + '\'' +
                ", ad2='" + ad2 + '\'' +
                '}';
    }
}
