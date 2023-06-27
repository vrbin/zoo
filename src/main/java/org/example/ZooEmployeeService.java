package org.example;

import java.util.ArrayList;
import java.util.List;

class ZooEmployeeService implements EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public void hire(Employee emp) {
        employees.add(emp);
        System.out.println("Zamestnali jsme " + emp.firstName + " " + emp.lastName);
    }

    public void fire(Employee emp) {
        if (employees.contains(emp)) {
            employees.remove(emp);
            System.out.println("Nove prilezitosti na trhu prace ted hleda " + emp.firstName + " " + emp.lastName);
        } else {
            System.out.println("Asi chyba - " + emp.firstName + " " + emp.lastName + " u nas nepracuje.");
        }

    }

    public void empRates () {
        System.out.println(" ");
        System.out.println("Kolik se u nas bere:");
        System.out.println("--------------------");
        for (int i=0; i<employees.size(); i++) {
            System.out.println(employees.get(i).firstName + " " + employees.get(i).lastName + " ma hodinovku " + employees.get(i).hourRate + " Kc");
        }
    }
}
