package com.example.services.impl;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * created by TestMe integration test on MMXVI
 */
public class InnerStaticOfInnerStaticClassTest {

    Foo.InnerStaticClass.InnerStaticOfInnerStaticClass innerStaticOfInnerStaticClass = new Foo.InnerStaticClass.InnerStaticOfInnerStaticClass();

    @Test
    public void testMethodOfInnerOfInnerClass() throws Exception {
        innerStaticOfInnerStaticClass.methodOfInnerOfInnerClass();
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme