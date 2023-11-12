package com.kalinin.sprig_mvs.DAO;

import com.kalinin.sprig_mvs.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee ();
    void saveEmployee (Employee employee);
    Employee getEmployee(int id);
    void  deleteEmployee (int id);
}
