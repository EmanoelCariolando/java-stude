import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mask = 0b00100000;

        if((n & mask) != 0){
           System.out.print("the 6 bit is true");
        } else {
            System.out.print("the 6 bit is false");
        }







        sc.close();



    }
}
