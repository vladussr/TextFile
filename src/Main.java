import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write("c:\\Прог");
        fw.close();

        Scanner sc = new Scanner(file);
        String path = sc.nextLine();
        System.out.println(path);
        path.replace("\\", "\\\\");
        System.out.println(path.replace("\\", "\\\\"));
        String newFilePath = (path.replace("\\", "\\\\")) + "\\\\t.txt";
        System.out.println(newFilePath);

        File f1 = new File(newFilePath);
        f1.createNewFile();
        FileWriter fw1 = new FileWriter(f1);
        fw1.write("Я сделал это!!!");
        fw1.close();

        

    }
}