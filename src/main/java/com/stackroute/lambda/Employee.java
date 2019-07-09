package com.stackroute.lambda;
//Pojo class of Employee
public class Employee
{
    String EmployeeName;
    int EmployeeAge;
    String LastName;

    public Employee(String employeeName, String lastName,int employeeAge) {
        EmployeeName = employeeName;
        EmployeeAge = employeeAge;
        LastName = lastName;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeAge() {
        return EmployeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        EmployeeAge = employeeAge;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeAge=" + EmployeeAge +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
