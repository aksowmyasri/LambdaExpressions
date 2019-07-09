package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Program to print places in the list containing nepal
public class StreamDemo {
    public List<String> PrintPlacesFromNepal(List<String> list)
    {
        List<String> list1 = new ArrayList<>();
        list.forEach(p ->
        {
            String[] str={};
            if(p.contains("Nepal")) {
                str = p.split("Nepal, ");
                list1.add(str[1]);
            }
        });
        return list1;

    }
}
