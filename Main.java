import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CSVOps write=new CSVOps();
        write.Write();
        write.ReadCSV();
    }

}

class CSVOps{
    void Write()
    {

StringBuilder strs=new StringBuilder();
//strs.append("num1").append(",").append("num2").append("\n");
strs.append("3").append(",").append("4").append("\n");

try{
FileWriter fw=new FileWriter("test.csv",true);
fw.write(strs.toString());
fw.close();

}

catch (IOException e)
{
    e.printStackTrace();
}

    }

    void ReadCSV()
    {
        File rf=new File("test.csv");
        try
        {
            Scanner reader=new Scanner(rf);
            while (reader.hasNext())
            {
                System.out.println(reader.nextLine());
            }
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}