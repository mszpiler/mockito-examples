package com.enotion;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class TestRealObject {

    @Test
    public void test() {
        RealObject realObjectSpy = spy(RealObject.class);
        RealObject realObjectMock = mock(RealObject.class);

        //this print 'Real Object text'
        System.out.println(realObjectSpy.getText());

        //this print null
        System.out.println(realObjectMock.getText());

        when(realObjectMock.getText()).thenReturn("Mock Object text");
        //this print 'Mock Object text'
        System.out.println(realObjectMock.getText());

        when(realObjectSpy.getText()).thenReturn("Spy Object text");
        //this print 'Spy Object text'
        System.out.println(realObjectSpy.getText());

        when(realObjectMock.getText()).thenReturn("Mock Object text SECOND");
        //this print 'Mock Object text SECOND'
        System.out.println(realObjectMock.getText());

        when(realObjectSpy.getText()).thenReturn("Spy Object text SECOND");
        //this print 'Spy Object text SECOND'
        System.out.println(realObjectSpy.getText());

    }

    @Test
    public void testWithSideEffect() {
        RealObject realObjectSpy = spy(RealObject.class);
        RealObject realObjectMock = mock(RealObject.class);

        //this print 'This is side effect' and 'Real Object with side effect'
        System.out.println(realObjectSpy.getTextWithSideEffect());

        //this print null !!!
        System.out.println(realObjectMock.getTextWithSideEffect());

        when(realObjectSpy.getTextWithSideEffect()).thenReturn("Spy Object with side effect");
        //this print 'This is side effect' and 'Spy Object with side effect'
        System.out.println(realObjectSpy.getTextWithSideEffect());

        when(realObjectMock.getTextWithSideEffect()).thenReturn("Mock Object no side effect");
        //this print 'Mock Object no side effect' !!!
        System.out.println(realObjectMock.getTextWithSideEffect());

        //if you have to stub method on spy without side effect then you have to do like this
        doReturn("Spy Object no side effect").when(realObjectSpy).getTextWithSideEffect();
        System.out.println(realObjectSpy.getTextWithSideEffect());

        //The CLUE:
        //Why is that? Because on spyied object you execute real method, in mocked object body of this method not exists!

    }
}

