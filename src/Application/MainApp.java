package Application;

import entities.Client;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Niga");

        System.out.println(set.contains("Notebook"));

        for (String i: set){
            System.out.println(i);
        }

    }
    }