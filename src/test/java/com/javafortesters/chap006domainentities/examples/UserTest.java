package com.javafortesters.chap006domainentities.examples;

import domainentities.User;
import org.junit.Test;
import	static	org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void canConstuctANewUser(){
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword(){
        User user = new User();
        assertEquals("Default username expected", "username", user.getUsername());
        assertEquals("Default password expected", "password", user.getPassword());
    }
    @Test
    public void canConstructWithUsernameAndPassword(){
        User user = new User( "admin", "Pa55w0Rd");
        assertEquals("Default username expected", "admin", user.getUsername());
        assertEquals("Default password expected", "Pa55w0Rd", user.getPassword());
    }
    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("p@55wor6");
        assertEquals("password is not set", "p@55wor6", user.getPassword());
        System.out.println(user.getPassword());
    }
/*
    User	auser	=	new	User();
    auser.username	=	"bob";
    assertEquals("not	default	username",	"bob",	auser.username);
    */
}
