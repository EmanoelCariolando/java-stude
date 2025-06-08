
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Products> list = new ArrayList<>();

        System.out.println("Enter File Path: ");
        String direct = sc.nextLine();

        File newFile = new File(direct);

        String sourceFolderStr = newFile.getParent();

        boolean creatOut = new File(sourceFolderStr + "\\out").mkdir();

        String targetFile = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader( new FileReader(direct))) {

            String line = br.readLine();

            while (line != null){
                String[] fileA = line.split(",");
                String name = fileA[0];
                double price = Double.parseDouble(fileA[1]);
                int quantity = Integer.parseInt(fileA[2]);

                list.add(new Products(name,price,quantity));

                line = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){

                for (Products searcher : list){
                   bw.write(searcher.getName() + "," + String.format("%.2f",searcher.getTotalPrice()));
                   bw.newLine();
                }
                System.out.println(targetFile + " CREATED!");

            }
            catch (IOException e){
                System.out.println("Error to writer: " + e.getMessage());
            }
        } catch (IOException e){
            System.out.println("Error to Reader: " + e.getMessage());
        }


    }
    }