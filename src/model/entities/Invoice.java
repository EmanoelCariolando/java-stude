package model.entities;

public class Invoice {
    private double basicPayments;
    private double tax;

    public Invoice(double basicPayments, double tax) {
        this.basicPayments = basicPayments;
        this.tax = tax;
    }

    public double getBasicPayments() {
        return basicPayments;
    }

    public void setBasicPayments(double basicPayments) {
        this.basicPayments = basicPayments;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double totalPayament(){
        return getBasicPayments() + getTax();
    }

}
