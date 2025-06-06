
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        String[] lines = new String[] {"one", "two", "three", "for", "five"};
        String file = "c:\\temp\\out.txt";


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){ // "true" is used to not recreate the file
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
          e.printStackTrace();
        }



    }

}
