import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        double promotion = (value < 20.0) ? value - 0.5 : value - 1.5;
        System.out.println(promotion);


        sc.close();


    }
}
