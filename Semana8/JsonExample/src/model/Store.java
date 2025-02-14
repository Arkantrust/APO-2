package model;

import java.util.ArrayList;

public class Store {
    private ArrayList<Owner> owners;
    private String name;

    public Store(ArrayList<Owner> owners, String name) {
        this.owners = owners;
        this.name = name;
    }

    public ArrayList<Owner> getOwners() {
        return owners;
    }

    public String getName() {
        return name;
    }
}
