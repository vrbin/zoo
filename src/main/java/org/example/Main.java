package org.example;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Pepa", "Novák", "nopep@seznam.cz", "603456789", 200 );
        Employee e2 = new Employee("Tonda", "Sádlo", "sadtony@centrum.cz", "nemá", 190);
        Employee e3 = new Employee("Jarka", "Steklá", "jarisek@email.cz", "777654987", 210);

        ZooEmployeeService nasiLide = new ZooEmployeeService();
        nasiLide.hire(e3);
        nasiLide.hire(e1);
        nasiLide.fire(e2);
        nasiLide.empRates();
    }
}