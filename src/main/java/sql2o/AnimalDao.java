package sql2o;

import java.util.List;

public interface AnimalDao {

    //LIST
    <Animal> List<Animal> getAll();

    //CREATE
    default void add() {
        add();
    }

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