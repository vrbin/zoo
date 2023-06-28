package org.example;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Pepa", "Novák", "nopep@seznam.cz", "603456789", 200 );
        Employee e2 = new Employee("Tonda", "Sádlo", "sadtony@centrum.cz", "nemá", 190);
        Employee e3 = new Employee("Jarka", "Steklá", "jarisek@email.cz", "777654987", 210);

        EmployeeService nasiLide = new ZooEmployeeService();
        nasiLide.hire(e3);
        nasiLide.hire(e1);
        nasiLide.hire(e2);
        nasiLide.empRates();

        System.out.println(" ");

        Animal a1 = new Animal(AnimalSpecies.MAMMAL, "slon Dušan", 3917);
        Animal a2 = new Animal(AnimalSpecies.BIRD, "datel Dutohlav", 0.417);
        Animal a3 = new Animal(AnimalSpecies.REPTILE, "had Nagini", 77);

        List<Employee> a1osetruje = new ArrayList<>();
        a1osetruje.add(e2);
        a1osetruje.add(e1);

        AnimalService zverinec = new ZooAnimalService();
        zverinec.adopt(a1, a1osetruje);

        List<Employee> a2osetruje = new ArrayList<>();
        a2osetruje.add(e3);
        zverinec.adopt(a2, a2osetruje);

        List<Employee> a3osetruje = new ArrayList<>();
        a3osetruje.add(e2);
        zverinec.adopt(a3, a3osetruje);
        zverinec.abandon(a3);
        zverinec.ourAnimals();
    }
}