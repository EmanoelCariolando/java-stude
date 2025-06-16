package model.entities;

public class SolidPrinter extends Device implements Printer{

    public SolidPrinter(String serialNumber) {
        super(serialNumber);
    }
    @Override
    public void processDoc(String doc){
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc){
        System.out.println("Print: " + doc);
    }
}
