import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;


        while(x != 0){
            x = sc.nextInt();
            soma += x;

        }
        System.out.println(soma);

        sc.close();



    }
}
