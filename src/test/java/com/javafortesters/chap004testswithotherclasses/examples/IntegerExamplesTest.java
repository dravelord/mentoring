package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;
import	static	org.junit.Assert.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
       /* Integer	four = new	Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());

        Integer	five = new	Integer(5);
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer	six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());

        int eleven = 11;
        System.out.println(Integer.toHexString(eleven));

        int ten = 10;
        System.out.println(Integer.toHexString(ten));
*/
        int three = 3;
        System.out.println(Integer.toHexString(three));

        int twentyOne = 21;
        System.out.println(Integer.toHexString(twentyOne));

        int eleven = 11;
        String elevenHex = Integer.toHexString(eleven);
        assertEquals("Eleven is not equal to b", "b", elevenHex);

        int ten = 10;
        assertEquals("Ten is not equal to a", "a", Integer.toHexString(ten));

        assertEquals("Max int equals to it", 2147483647, Integer.MAX_VALUE);
        assertEquals("Min int equals to it", -2147483648, Integer.MIN_VALUE);
    }
}
