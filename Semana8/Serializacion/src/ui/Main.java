package ui;

import java.io.*;
import java.util.ArrayList;

import model.Person;
public class Main {
    public static void main(String[] args) {
        /*
        * Ubuntu (linux) -> /usr/bin/jvm
        * MacOs (Unix) -> /user/home/Documents
        * */

        // fuente de información
        String path = "/home/i2t/Git/Icesi/APO-2/Semana8/Serializacion/src";
        String path2 = "./";
        File directory = new File(path);

        System.out.println(" ¿El directorio existe ? -> " + directory.exists());
        String[] names = directory.list();

        for (String name: names) {
            System.out.println(name);
        }

        // Fuente de información
        File file = new File("/home/i2t/Git/Icesi/APO-2/Semana8/Serializacion/src/filetest.txt");
        File filePeople = new File("/home/i2t/Git/Icesi/APO-2/Semana8/Serializacion/src/people.temp");
        System.out.println(" ¿El archivo existe ? -> " + file.exists());

        try{
            // empaquetador de la información
            FileInputStream fis = new FileInputStream(filePeople);

            // lector de la información
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line;

            ArrayList<Person> people = new ArrayList<>();
            System.out.println("tamaño inicial: " + people.size());

            while( (line = reader.readLine()) != null){
                System.out.println(line);
                String[] parts = line.split(" ");
                Person p = new Person(parts[0], Integer.parseInt(parts[1]));
                people.add(p);

            }
            System.out.println("tamaño final: " + people.size());
            System.out.println("Segunda persona: " + people.get(1).getName());
            fis.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}