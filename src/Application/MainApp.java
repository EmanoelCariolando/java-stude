package Application;



import model.entities.ComboDevice;

import java.text.ParseException;


public class MainApp {
    public static void main(String[] args) throws ParseException {

        ComboDevice c = new ComboDevice("2010");
        System.out.println(c.scan() + "Bag");
        c.processDoc("Bodys");
        c.print("Things");
     }
    }