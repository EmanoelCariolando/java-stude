package Application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import model.entities.CarRental;
import model.entities.Veihicle;
import model.services.RentalService;
import model.services.BrazilTaxService;

public class MainApp {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter the rental details: ");
        System.out.print("Enter a model of car: ");
        String model = sc.nextLine();
        System.out.print("Enter the initial Date (dd/MM/yyyy HH:mm): ");
        LocalDateTime initialDate = LocalDateTime.parse(sc.nextLine(),dtf);
        System.out.print("Enter the end Date (dd/MM/yyyy HH:mm): ");
        LocalDateTime endDate = LocalDateTime.parse(sc.nextLine(),dtf);

        CarRental cRental = new CarRental(new Veihicle(model),initialDate,endDate);

        System.out.print("Entre com o preço por hora: " );
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por Dia: " );
        double pricePerDay = sc.nextDouble();

        RentalService rs = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService());

        rs.procesService(cRental);

        System.out.println("Fatura: ");
        System.out.println("Pagamento Basico: " + cRental.getInvoice().getBasicPayments());
        System.out.println("Imposto: " + cRental.getInvoice().getTax());
        System.out.println("totalPayment: " + cRental.getInvoice().totalPayament());
     }
    }