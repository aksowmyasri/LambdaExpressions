package com.stackroute.lambda;

import java.util.ArrayList;
import java.util.List;
import static java.util.Comparator.comparing;
//Program to sort the employees by last name , name starting with c
class LambdaDemo  {
    public List<Employee> sortByLastName(List<Employee> list)
    {
        list.sort(comparing(Employee::getLastName));
        return list;

    }
    public List<Employee> PrintEmployeeWhoseLastNameWithC(List<Employee> list) {
        List<Employee> list1 = new ArrayList<>();
        list.forEach(p->
        {
            if(p.getLastName().startsWith("c")||p.getLastName().startsWith("C"))
                list1.add(p);
        }
        );
        return list1;

    }

}
