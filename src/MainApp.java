import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("TYPE 3 NUMBERS");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int higher = findMAx(n1,n2,n3);
        showAll(higher);


        sc.close();
    }
    public static int findMAx(int x, int y, int z){
        if (x > y && x > z){
         return x;
        }
          else if (y > z) {
            return y;
          }
          else {
           return z;
          }
    }
    public static void showAll(int value){
      System.out.print(value);
    }

}
