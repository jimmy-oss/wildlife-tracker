package dao;

import java.util.List;

public interface AnimalDao<Animal> {

    //LIST
    List<Animal> getAll();

    void add();

    //CREATE
    void add(Animal animal);

    //READ
    Animal findById(int id);

    //UPDATE
    void update(int id, String species);

    //DELETE
    void deleteById(int id);
    void clearAllAnimals();
}