package ui;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Reader {
    public static void main(String[] args) {
        File file = new File("/home/i2t/Git/Icesi/APO-2/Semana8/Serializacion/src/people.temp");

        try{
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int readBytes = 0;
            byte[] buffer = new byte[128];

            while ( (readBytes = fis.read(buffer)) != -1 ){
                // escribir la información en el arreglo de bytes
                baos.write(buffer, 0, readBytes);
            }
            fis.close();
            baos.close();

            String text = baos.toString(StandardCharsets.UTF_8);
            System.out.println(text);

        }catch (FileNotFoundException e){

        }catch (IOException e){

        }
    }
}
