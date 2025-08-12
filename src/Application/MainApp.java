package Application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.*;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Set<Integer> coursA = new HashSet<>();
        Set<Integer> coursB = new HashSet<>();
        Set<Integer> coursC = new HashSet<>();

        System.out.print("How many students for course A? " );

        int n = sc.nextInt();
        for (int i =1; i<= n; i++){
            System.out.println("Type the Id: ");
            int numbers = sc.nextInt();
            coursA.add(numbers);
        }
        System.out.print("How many students for course B? " );

        n = sc.nextInt();
        for (int i =1; i<= n; i++){
            System.out.println("Type the Id: ");
            int numbers = sc.nextInt();
            coursB.add(numbers);
        }

        System.out.print("How many students for course C? " );

        n = sc.nextInt();
        for (int i =1; i<= n; i++){
            System.out.println("Type the Id: ");
            int numbers = sc.nextInt();
            coursC.add(numbers);
        }

        Set<Integer> total = new HashSet<>(coursA);
        total.addAll(coursB);
        total.addAll(coursC);

        System.out.println("Total Students: " + total.size());




    }
    }