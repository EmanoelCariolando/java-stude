package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainApp {
    public static void main(String[] args) throws ParseException {

        List<String> list = new ArrayList<>();
        String path = "C:\\out\\Re.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String lines = br.readLine();
            while (lines != null){
               list.add(lines);
               lines = br.readLine();
            }
            Collections.sort(list);
            for(String s :list){
                System.out.println(s);
            }

        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }