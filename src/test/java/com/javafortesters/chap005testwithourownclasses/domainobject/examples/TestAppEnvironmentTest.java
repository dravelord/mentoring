package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobjec.TestAppEnv;
import org.junit.Test;
import	static	org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returnes Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }



    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Return domain", "192.123.0.3", TestAppEnv.DOMAIN);

        assertEquals("Return domain", "67", TestAppEnv.PORT);
}
    }

