package com.ds.avare.test;

import com.ds.avare.utils.Helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest1 {
    private Helper example;
    @Before
    public void setup() throws Exception {
        example = new Helper();
    }
    @Test
    public void isSameGPSLocation() throws Exception {
        assertEquals(true,example.isSameGPSLocation(118.5,32.6,118.5,32.6));
    }
    @Test
    public void isSameGPSLocation1() throws Exception {
        assertEquals(true,example.isSameGPSLocation(128.5,32.6,118.5,32.6));
    }
    @Test
    public void isSameGPSLocation2() throws Exception {
        assertEquals(true, example.isSameGPSLocation(118.6, 32.6, 118.5, 32.6));
    }
    @Test
    public void isSameGPSLocation3() throws Exception {
        assertEquals(true, example.isSameGPSLocation(118.52, 32.6, 118.5, 32.6));
    }
    /*@Test
    public void isSameGPSLocation() throws Exception {
        assertEquals(true,Helper.isSameGPSLocation(118.5,32.6,118.5,32.6));
    }*/
}