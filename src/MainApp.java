
import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder.getName());
        }
        System.out.println("FILES:");
        File[] filers = path.listFiles(File::isFile);

        for(File file : filers){
            System.out.println(file.getName());
        }
        boolean success = new File(strPath + "\\sub").mkdir();
        System.out.println("Directory: "  + " created =" + success);
        sc.close();
    }

}
