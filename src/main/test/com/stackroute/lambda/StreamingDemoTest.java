package com.stackroute.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamingDemoTest {
    StreamingDemo streamingDemo;
    @Before
    public void setUp() throws Exception {
        streamingDemo = new StreamingDemo();
    }

    @After
    public void tearDown() throws Exception {
        streamingDemo = null;
    }
    @Test
    public void givenInputListOfNamesReturnNamesStartWithA()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        List<String> actualList = new ArrayList<>();
        actualList=streamingDemo.printAllTheNamesStartingWithA(memberNames);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Amitabh");
        expectedList.add("Aman");
        expectedList.add("Ahana");
        assertEquals(expectedList,actualList);

    }
    @Test
    public void givenInputListOfNamesReturnUpperCaseNames()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        List<String> actualList = new ArrayList<>();
        actualList=streamingDemo.printAllTheNamesInUpperCase(memberNames);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("AMITABH");
        expectedList.add("SHEKHAR");
        expectedList.add("AMAN");
        expectedList.add("AHANA");
        expectedList.add("SHAHRUKH");
        expectedList.add("SALMAN");
        expectedList.add("YANA");
        expectedList.add("LOKESH");
        assertEquals(expectedList,actualList);

    }
    @Test
    public void givenInputListOfNamesReturnNamesInUpperCaseEndsWiths() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokes");
        List<String> actualList = new ArrayList<>();
        actualList = streamingDemo.printAllTheNamesInUpperCaseWhoseNameEndsWithS(memberNames);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("LOKES");
        assertEquals(expectedList, actualList);
    }
    @Test
    public void givenInputListOfNamesReturnCountOfNamesEndingWithh() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        int actual = streamingDemo.countAllTheNamesEndsWithh(memberNames);
        assertEquals(3, actual);
    }
    @Test
    public void givenInputListOfNamesReturnNamesStartWiths()
    {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        List<String> actualList = new ArrayList<>();
        actualList=streamingDemo.printAllTheNamesStartingWithS(memberNames);
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Shekhar");
        expectedList.add("Shahrukh");
        expectedList.add("Salman");
        assertEquals(expectedList,actualList);

    }
    @Test
    public void givenInputListOfNumbersReturnEvenNumbers()
    {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        List<Integer> actualList = new ArrayList<>();
        actualList = streamingDemo.printAllEvenNumbersInTheList(integerList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        assertEquals(expectedList,actualList);
    }


    }