package com.shivani.springbootbackend.service;

import com.shivani.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public List<Employee> getallEmployee();
    public Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long Id);
    void deleteEmployee(long id);

}
