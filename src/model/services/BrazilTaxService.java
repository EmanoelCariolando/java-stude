package model.services;

public class BrazilTaxService {
    public double tax;
    public BrazilTaxService() {
    }
    public BrazilTaxService(double tax) {
        this.tax = tax;
    }

    public double getTax(double basicPayment) {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double serviceTax(double amount){
      if (amount <= 100.00){
          return amount * 0.2;
      }
      else {
          return amount * 0.15;
      }
    }
}
