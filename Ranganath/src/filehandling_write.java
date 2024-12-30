// write in file ) (method)
/*
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class filehandling_write {
    public static void main(String[] args) {
        {
            String filename = "example2.txt";
            File file = new File(filename);
            try{
                if(file.createNewFile()){
                    System.out.println("file created");
                }
                else {
                    System.out.println("file exist");
                }
                FileWriter writer = new FileWriter(file);
                writer.write("welcome to jumanji");
                writer.write("welcome to jumanji \n");
                writer.write("welcome to jumanji\n");
                writer.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
    }}

// Write in file (constructor)

import java.io.FileOutputStream;
import java.io.IOException;
public class filehandling_write {
    public static void main(String[] args){
        String filename = "example2.txt";
        String content = "Welcome to tutorial";
        try(FileOutputStream fos = new FileOutputStream(filename)){
        byte[] bytes = content.getBytes();
        fos.write(bytes);
        System.out.println("content written");
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
*/


// write in file (method)
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class filehandling_write {
    public static void main(String[] args) {
        String filename = "example2.txt";
        String content = "Welcome to tutorial";
        try {
            Files.write(Paths.get(filename), content.getBytes());
            System.out.println("file written");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

