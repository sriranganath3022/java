//file  - digital container holds information
//types - text file , binary file
//1 . creating a file
//
//      * file.createnewfile() (method)
//      * fileOutputStream()  (constructor)
//      * files.write()  (method)
//
//syntax
//
//File file = new File(example.txt);

// using constructor

//  FileOutputStream fos = new FileOutputStream("example.txt")

// using method

/*
import java.io.File;
import java.io.IOException;
public class file_handling {
    public static void main(String[] args) throws IOException{
        String filename = "example1.txt";
        File file = new File(filename);
        if(file.createNewFile())
        {
            System.out.println("file created");
        }
        else {
            System.out.println("file exist");
        }
    }
}*/

// using constructor
/*
import java.io.FileOutputStream;
import java.io.IOException;
public class file_handling {
    public static void main(String[] args){
        String filename = "example2.txt";
        try(FileOutputStream fos = new FileOutputStream(filename))
        {
            System.out.println("file created");
        }catch(IOException e)
        {
            System.out.println(e);
        }
        }
    }
  */

// using method to create small files

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class file_handling {
    public static void main(String[] args) {
        String filename = "example3.txt";
        try {
            Files.write(Paths.get(filename), "ranganath".getBytes());
            System.out.println("file created");
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
