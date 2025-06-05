
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File file = new File("c:\\temp\\in.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e){
          System.out.println("Error: " + e.getMessage());
        }



    }

}
