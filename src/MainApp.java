
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
           System.out.println("Error opening File: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }

    }

}
