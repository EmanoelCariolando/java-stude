package Application;

import entities.Client;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Client c1 = new Client("Mary","Mamao@gmail.com");
        Client c2 = new Client("Mary","Mamao@gmail.com");

        System.out.println(c1.equals(c2));

        if (c1.equals(c2)){
            System.out.println("Já Existe");
        }
        else {
            System.out.println("vtmncccc");
        }
    }
    }