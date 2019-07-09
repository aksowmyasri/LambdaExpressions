package com.stackroute.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamDemoTest {
    StreamDemo streamDemo;
    @Before
    public void setUp() throws Exception {
        streamDemo = new StreamDemo();
    }

    @After
    public void tearDown() throws Exception {
        streamDemo = null;
    }
    @Test
    public void givenInputPlacesReturnPlacesFromNepal()
    {
        List<String> list = new ArrayList<>();
        list.add("Nepal, Kathmandu");
        list.add("Nepal, Pokhara");
        list.add("India, Delhi");
        list.add("USA, New York");
        list.add("Africa, Nigeria");
        List<String> actualList = new ArrayList<>();
        actualList=streamDemo.PrintPlacesFromNepal(list);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Kathmandu");
        expectedList.add("Pokhara");
        assertEquals(expectedList,actualList);


    }
    @Test
    public void givenInputPlacesWithoutNepalReturnNUll()
    {
        List<String> list = new ArrayList<>();
        list.add("India, Delhi");
        list.add("USA, New York");
        list.add("Africa, Nigeria");
        List<String> actualList = new ArrayList<>();
        actualList=streamDemo.PrintPlacesFromNepal(list);
        List<String> expectedList = new ArrayList<>();
        assertEquals(expectedList,actualList);


    }
}