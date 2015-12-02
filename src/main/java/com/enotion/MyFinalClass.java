package com.enotion;

/*
This is example which shows that when you have final class then you can't stub it using Mockito
*/
public final class MyFinalClass {
    public String method() {
        System.out.println("Can't change my behaviour!");
        return "no changes!";
    }
}
