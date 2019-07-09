package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LambdaDemoTest {
    LambdaDemo lambdaDemo;
    @org.junit.Before
    public void setUp() throws Exception {
        lambdaDemo = new LambdaDemo();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        lambdaDemo = null;
    }


    @org.junit.Test
    public void givenInputEmployeeDetailsReturnListSortByLastName() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("sowmya","sri",21));
        list.add(new Employee("lavanya","pentela",21));
        list.add(new Employee("prathyusha","bellam",22));
        list.add(new Employee("pallavi","ega",23));
        list.add(new Employee("raju","chara",21));
        List<Employee> actualList = new ArrayList<>();
        actualList = lambdaDemo.sortByLastName(list);
        List<Employee> expectedList = new ArrayList<>();
        expectedList.add(new Employee("prathyusha","bellam",22));
        expectedList.add(new Employee("raju","chara",21));
        expectedList.add(new Employee("pallavi","ega",23));
        expectedList.add(new Employee("lavanya","pentela",21));
        expectedList.add(new Employee("sowmya","sri",21));
        assertEquals(expectedList.toString(),actualList.toString());
    }

    @org.junit.Test
    public void givenInputEmployeeDetailsListSortByLastName() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("sowmya","sri",21));
        list.add(new Employee("lavanya","pentela",21));
        list.add(new Employee("prathyusha","bellam",22));
        list.add(new Employee("pallavi","ega",23));
        list.add(new Employee("raju","chara",21));
        List<Employee> actualList = new ArrayList<>();
        actualList = lambdaDemo.PrintEmployeeWhoseLastNameWithC(list);
        List<Employee> expectedList = new ArrayList<>();
        expectedList.add(new Employee("raju","chara",21));
        assertEquals(expectedList.toString(),actualList.toString());
    }
}