import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        double value = 50.0;

        x = sc.nextInt();

        switch (x){
            case 1:
            System.out.println("It's Sunday");
            break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Friday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;

                default:
                System.out.println("this day does not exist");
                break;
        }




        sc.close();


    }
}
