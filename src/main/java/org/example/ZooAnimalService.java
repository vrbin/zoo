package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
public class ZooAnimalService implements AnimalService{
    Map<Animal, List<Employee>> animals = new HashMap<>();
    @Override
    public void adopt(Animal animal, List<Employee> caredBy) {
        if (caredBy.size() == 0) {
            System.out.println("O zvire " + animal.name + " se musi nekdo starat!");
        } else {
            animals.put(animal, caredBy);
            System.out.println("Prijali jsme zvire " + animal.name);
        }
    }
    @Override
    public void abandon(Animal animal) {
        if (animals.containsKey(animal)) {
            animals.remove(animal);
            System.out.println("Zbavili jsme se neboheho zvirete " + animal.name);
        } else {
            System.out.println("Zvire " + animal.name + " v nasi ZOO nemame.");
        }
    }
    public void ourAnimals() {
        for (Map.Entry<Animal, List<Employee>> ani : animals.entrySet()) {
            System.out.println("O zvire " + ani.getKey().name + " se stara:");
            for (int i=0; i<ani.getValue().size(); i++) {
                System.out.println(" - " + ani.getValue().get(i).firstName + " " + ani.getValue().get(i).lastName);
            }
        }
    }
}
