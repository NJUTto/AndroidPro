package com.ds.avare.test;

import com.ds.avare.utils.Midnum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MidnumTest {
    private Midnum example;
    int num[] = {23,4,45,16,7,103,47,59};
    int num1[] = {23,4,45,16,7};
    int num2[] = {2,9,43,18,98,10000};
    int num3[] = {2,9,43,18,98,104,36};
    @Before
    public void setup() throws Exception {
        example = new Midnum() ;
    }
    @Test
    public void median() throws Exception {
        assertEquals(23,example.median(num) );
    }
    @Test
    public void median1() throws Exception {
        assertEquals(23,example.median(num1) );
    }
    @Test
    public void median2() throws Exception {
        assertEquals(18,example.median(num2) );
    }
    @Test
    public void median3() throws Exception {
        assertEquals(18,example.median(num3) );
    }
}