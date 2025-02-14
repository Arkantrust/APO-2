package ui;

import com.google.gson.Gson;
import model.Owner;

import java.io.*;

public class Reader {

    public static void main(String[] args) {
        Gson gson = new Gson();

        File projectDir = new File(System.getProperty("user.dir"));
        File dataDirectory = new File(projectDir.getName()+"/data");
        File result = new File(projectDir.getName()+"/data/result.json");

        try {
            FileInputStream fis = new FileInputStream(result);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line;
            String json = "";
            while ( (line = reader.readLine()) != null){
                json += line;
            }

            System.out.println(json);

            Owner[] owners = gson.fromJson(json, Owner[].class);

            for (Owner o: owners) {
                System.out.println(o.getId());
            }


        }catch (FileNotFoundException e){
           e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
