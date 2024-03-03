package org.example;

public class EmployeeImp implements EmployeeDao{

    public EmployeeImp()
    {

    }

    @Override
    public void createEmployee(String client) {
        System.out.println("Employee created by : "+client);
    }
}
