package com.enotion;


import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestMyString {

    @Test
    public void test() {
        MyString mockedString = mock(MyString.class);

        //simple selected method mock
        when(mockedString.myToString()).thenReturn("myToString from mockito");
        System.out.println(mockedString.myToString());

        when(mockedString.toString()).thenReturn("toString from mockito");
        System.out.println(mockedString.toString());

    }

    /**
     * This test always fails
     */
    @Test
    public void testFailed() {
        //you cannot mock final class
        MyFinalClass finalClass = mock(MyFinalClass.class);
        when(finalClass.method()).thenReturn("mocked return");
        finalClass.method();
    }
}
