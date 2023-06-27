package org.example;

import java.util.ArrayList;
import java.util.List;

class ZooEmployeeService implements EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public void hire(Employee emp) {
        employees.add(emp);
    }

    public void fire(Employee emp) {
        employees.remove(emp);
    }
}
