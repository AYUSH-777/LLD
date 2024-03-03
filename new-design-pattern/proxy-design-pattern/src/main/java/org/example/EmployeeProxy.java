package org.example;

public class EmployeeProxy implements EmployeeDao{

    private EmployeeDao employeeDao;

    public EmployeeProxy()
    {
        this.employeeDao = new EmployeeImp();
    }

    @Override
    public void createEmployee(String client) {
        if(client.equals("Admin"))
        {
            employeeDao.createEmployee(client);
        }
        else
        {
            System.out.println("Exception while creation of record");
        }
    }
}
