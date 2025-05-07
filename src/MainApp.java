import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char v;

        do{
            System.out.println("Enter the temperature in Celsius:");
            double c = sc.nextDouble();

            double f = 9 * c / 5 + 32;
            System.out.printf("fahrenheit equivalent :%.2f%n", f);

            System.out.print("Do you want to repeat?(y/n)");
             v = sc.next().charAt(0);

        } while ( v != 'n');




        sc.close();



    }
}
