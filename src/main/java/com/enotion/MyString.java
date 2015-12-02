package com.enotion;

/**
 * As you can see here if you don't have final class then you can stub toString method in Mockito. For String class it is impossible.
 */
public class MyString {
    public String myToString() {
        return "myToString from MyString";
    }

    public String toString() {
        return "toString from MyString";
    }
}
