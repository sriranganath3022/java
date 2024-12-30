/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class file_reading
{
    public static void main(String[] args)
    {
        String filename = "example1.txt";
        try (FileReader reader = new FileReader(filename))
        {
            int character;
            while ((character = reader.read()) != -1)
                System.out.println((char) character);
        } catch (IOException e)
        {
            System.out.println(e);
        }

    }
}*/

// using constructor
/*
import.java.io.FileInputStream;
import

import java.nio.file.Files;.java.io.IOException;
public class ReadFileExample2
{
    public static void main(String[] args)
    {
        String fileName = "example1.txt";
        try(FileOutputStream fis = new FileInputStream(filename))
        {
            int byteValue;
            while((byteValue = fis,read())!=-1)
            {
                System.out.println((char)byteValue);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}*/

// using read all lines
/*
import.java.io.FileInputStream;
import.java.io.IOException;
public class ReadFileExample2 {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        try {
            List<String> Lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
          catch(IOException e)
            {
                System.out.println(e);
            }

        }
    }
}*/
