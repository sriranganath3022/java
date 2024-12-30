import java.io.File;

public class file_delete
{
    public static void
     main(String[] args) {
        File file = new File("example1.txt");
        if(file.exists())
        {
            if (file.delete())
            {
                System.out.println("File Deleted Successfully");
            }
            else
            {
                System.out.println("File failed to delete");
            }
        }
    }
}
