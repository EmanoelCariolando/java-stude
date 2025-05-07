import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String original = " abcde FGHIJ ABC abc DEFG  ";

        String copy1 = original.toLowerCase(); // lowercase letters
        String copy2 = original.toUpperCase(); // Capital letters
        String copy3 = original.trim(); // removes spaces from edges
        String copy4 = original.substring(3); // starts from the point where the position of the number placed in () is the same as that of the letter
        String copy5 = original.substring(2,13); // starts from the point where the position of the number placed in () is the same as that of the letter but ends at the position where the other number was placed.
        String copy6 = original.replace('a','x'); // change the letter before the "a," to the one after the ",x"
        String copy7 = original.replace("abc","xyz"); // change the letter before the "abc," to the one after the ",xyz"
         int i = original.indexOf("b"); // returns the position where the letter is
         int j = original.lastIndexOf("b"); // returns the position last where the letter is

        String list = "potato apple banana";
        String[] vector = list.split(" "); // use the space to separate, but if they are separated with , just put the v inside the ()

        System.out.println("Original:"+ "-"+original+"-");
        System.out.println(copy1);
        System.out.println(copy2);
        System.out.println("-"+copy3+"-");
        System.out.println(copy4);
        System.out.println(copy5);
        System.out.println(copy6);
        System.out.println(copy7);
        System.out.println(i);
        System.out.println(j);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);


        sc.close();



    }
}
