package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Program to print the names starting with A, print all the names in uppercase, names ending with h, names starting with s and all even numbers in the list
public class StreamingDemo {
    public List<String> printAllTheNamesStartingWithA(List<String> list)
    {
        List<String> list1 = list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
        return list1;
    }
    public List<String> printAllTheNamesInUpperCase(List<String> list) {
        list.replaceAll(String::toUpperCase);
        return list;
    }
    public List<String> printAllTheNamesInUpperCaseWhoseNameEndsWithS(List<String> list) {
        list.replaceAll(String::toUpperCase);
        List<String> list1 = list.stream()
                .filter(s -> s.endsWith("S"))
                .collect(Collectors.toList());
        return list1;
    }
    public int countAllTheNamesEndsWithh(List<String> list)
    {
        List<String> list1 = list.stream()
                .filter(s -> s.endsWith("h"))
                .collect(Collectors.toList());
        return list1.size();
    }
    public List<String> printAllTheNamesStartingWithS(List<String> list)
    {
        List<String> list1 = list.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        return list1;
    }
    public List<Integer> printAllEvenNumbersInTheList(List<Integer> list)
    {
        List<Integer> list1 = new ArrayList<>();
        list.forEach(p->
        {
            if(p%2==0)
                list1.add(p);

        });
        return list1;
    }

}
