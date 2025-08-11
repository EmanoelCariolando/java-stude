package Application;

import entities.LogEntry;

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

        System.out.print("type yout path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> listSet = new HashSet<>();

            String line = br.readLine();

            while (line != null){

                String[] fields = line.split(" ");
                String name = fields[0];
                Date moment = Date.from(Instant.parse((fields[1])));

                listSet.add(new LogEntry(name, moment));

                line = br.readLine();
            }

            System.out.println("Amount:" + listSet.size());



        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }