package com.kalinin.sprig_mvs.service;

import com.kalinin.sprig_mvs.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee ();
    void saveEmployee (Employee employee);
    Employee getEmployee (int id);
    void deleteEmployee (int id);

}
