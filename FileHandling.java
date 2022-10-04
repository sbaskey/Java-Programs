import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void FileHandling(String[] args) {
//        System.out.println("Hello world!");

        try {
            File file = new File("Hello.txt");
            if (file.createNewFile()) {
                System.out.println("File successfully created" + file.getName());
            } else {
                System.out.println("File already exist");
            }
        }

            catch(IOException e)
            {
                System.out.println("An error occured");
                e.printStackTrace();
            }


//        Readfile f1=new Readfile();
//        f1.Read();

        WriteFile f2=new WriteFile();
        f2.Write();

//        ReadFromFile rf=new ReadFromFile();
//        rf.Read();
    }

}

//class Readfile{
//    public void Read()
//    {
//            File file=new File("Hello.txt");
//            if(file.exists())
//            {
//                System.out.println(file.getName());
//                System.out.println(file.length());
//                System.out.println(file.canRead());
//                System.out.println(file.canWrite());
//
//            }
//            else {
//                System.out.println("File does not exist");
//            }
//
//
//    }
//}

class WriteFile{
    void Write()
    {
        try {
            FileWriter fw=new FileWriter("Hello.txt",true);
            fw.write("Some content added");
            fw.close();


        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}


class ReadFromFile{
    void Read()
    {
        try {
            File rf=new File("f2.txt");
            Scanner reader=new Scanner(rf);
            while (reader.hasNext())
            {
                System.out.println(reader.nextLine());
            }
            reader.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File could not be found");
            e.printStackTrace();
        }
    }
}

