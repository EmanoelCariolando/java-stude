import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {

        String name = "Maria";
        int age = 25;
        double wage  = 10.500;

        System.out.printf("%s is %d years old and earns $ %.2f dollars %n" ,name,age,wage );

        Locale.setDefault(Locale.US);

        // %s = String/Text , %d = Numbers/whole numbers ,
        // %f = floating point numbers: %.2f and , %n = line break




    }
}
