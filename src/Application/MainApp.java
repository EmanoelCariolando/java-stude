package Application;

import model.BrazilInterestService;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("enter the data: ");
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("months: ");
        int months = sc.nextInt();


        BrazilInterestService in = new BrazilInterestService(2.0);
        double payment = in.payment(amount,months);

        System.out.printf("payament after %d months: ", months );
        System.out.printf(String.format("%.2f",payment));

        sc.close();
    }
    }