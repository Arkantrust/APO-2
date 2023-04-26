package com.example.filereader.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    // patron de diseño singleton (o anti patron ...)

    // instalcia única de la clase
    private static FileManager instance;

    // constructor privado de la clase
    private FileManager(){ }

    // método paar obtener la instancia del objeto
    public static FileManager getInstance(){
        if(instance == null){
            instance = new FileManager();
        }
        return instance;
    }

    public String readFile(String fileName){
        String content  = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ( (line = br.readLine()) != null ){
                content += line + "\n";
            }
            br.close();
        }catch (IOException ex){
           ex.getMessage();
           ex.printStackTrace();
        }
        return content;
    }


}
