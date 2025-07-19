package Application;

import model.PrintService;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        PrintService<String> ps = new PrintService<>();

        System.out.print("how many values?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
           String values = sc.next();
           ps.addValue(values);

        }

        ps.print();
        System.out.println("First:" + ps.first());



        sc.close();
    }
    }