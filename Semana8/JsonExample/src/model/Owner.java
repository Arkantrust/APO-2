package model;

public class Owner {
    private String name;
    private Pet pet;
    private String id;

    public Owner(String name, Pet pet, String id) {
        this.name = name;
        this.pet = pet;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }

    public String getId() {
        return id;
    }
}
