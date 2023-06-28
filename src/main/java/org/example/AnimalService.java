package org.example;
import java.util.List;
public interface AnimalService {
    void adopt(Animal animal, List<Employee> caredBy);
    void abandon(Animal animal);
    void ourAnimals();
}
