import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s1;

        s1 = sc.nextInt();


          if (s1 < 12) {           // if you find this, stop, otherwise go to the next one until you find the real one
             System.out.println("GOOD MORNING");
        } else if ( s1 < 18) {
             System.out.println("GOOD AFTERNOON");
        } else {
             System.out.println("GOOD NIGHT");
        }

        sc.close();


    }
}
