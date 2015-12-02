package com.enotion;

public class RealObject {
    public String getText() {
        return "Real Object text";
    }

    public String getTextWithSideEffect() {
        System.out.println("This is side effect!");
        return "Real Object with side effect";
    }
}
