package Application;

import enums.entities.Colors;
import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Retangle;

import java.text.ParseException;


public class MainApp {
    public static void main(String[] args) throws ParseException {
       AbstractShape n1 = new Retangle(Colors.BLACK,2.0,1.0);
       AbstractShape c1 = new Circle(Colors.WHITE, 2.0);

        System.out.println(n1.area());
        System.out.println(c1.area());
     }
    }