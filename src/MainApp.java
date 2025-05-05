import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time;

        time = sc.nextInt();


          if (time < 12) {           // if you find this, stop, otherwise go to the next one until you find the real one
             System.out.println("GOOD MORNING");
        } else if ( time < 18) {
             System.out.println("GOOD AFTERNOON");
        } else {
             if (time < 24) {
                 System.out.println("GOOD NIGHT");
             }
             else {
                 System.out.println("THIS IS NOT A HOUR");
             }
        }

        sc.close();


    }
}
