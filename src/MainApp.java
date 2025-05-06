import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int minutes;
        double value = 50.0;

        minutes = sc.nextInt();

        if(minutes > 100){
         value -= (minutes - 100) * 2;
            System.out.printf("amount to pay: %.2f%n",value);
        }
        else {
            System.out.printf("amount to pay: %.2f%n",value);
        }


        sc.close();


    }
}
