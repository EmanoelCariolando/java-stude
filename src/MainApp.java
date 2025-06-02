
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int n = sc.nextInt();
            System.out.println(vect[n]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        catch (InputMismatchException a){
            System.out.println("Invalid input");
        }

        System.out.println("End of program");
    }

}
