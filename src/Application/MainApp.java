package Application;
import entities.Circle;
import entities.Retangle;
import entities.Shape;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Retangle(2.0,3.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(1.0));

        System.out.println("total area: " + totalArea(myShapes));
    }
    public static double totalArea(List<? extends Shape> l){
        double sum = 0.0;
        for (Shape item: l){
          sum+= item.area();
        }
        return sum;
    }
    }