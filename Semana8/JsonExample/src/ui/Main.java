package ui;

import com.google.gson.Gson;
import model.Owner;
import model.Pet;
import model.Store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // JSON
        // https://mvnrepository.com/
        // https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1
        // C:\\Users\\user\\Documents -> Ruta absoluta
        // Documents -> Ruta relativa

        Gson gson = new Gson();

        File projectDir = new File(System.getProperty("user.dir"));
        File dataDirectory = new File(projectDir.getName()+"/data");
        File result = new File(projectDir.getName()+"/data/result.json");

        if(!dataDirectory.exists()){
            dataDirectory.mkdirs();
            System.out.println(dataDirectory.exists());
        }


        System.out.println(projectDir.getName());
        String[] listD = projectDir.list();
        for (String name: listD) {
            System.out.println(name);
        }

        Pet p1 = new Pet("p1", 10);
        Pet p2 = new Pet("p2", 20);
        Pet p3 = new Pet("p3", 30);
        Pet p4 = new Pet("p4", 40);
        Pet p5 = new Pet("p5", 50);
        Pet p6 = new Pet("p6", 60);

        Owner o1 = new Owner("O1", p1, "IDO1");
        Owner o2 = new Owner("O2", p2, "IDO2");
        Owner o3 = new Owner("O3", p3, "IDO3");
        Owner o4 = new Owner("O4", p4, "IDO4");
        Owner o5 = new Owner("O5", p5, "IDO5");
        Owner o6 = new Owner("O6", p6, "IDO6");

        ArrayList<Owner> owners = new ArrayList<>();
        owners.add(o1);
        owners.add(o2);
        owners.add(o3);
        owners.add(o4);
        owners.add(o5);
        owners.add(o6);

        String json = gson.toJson(owners);
        System.out.println(json);

        Store store = new Store(owners, "Nombre Tienda");
        String json2 = gson.toJson(store);

        try {
            FileOutputStream fos = new FileOutputStream(result);
            fos.write(json2.getBytes(StandardCharsets.UTF_8));
            fos.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}