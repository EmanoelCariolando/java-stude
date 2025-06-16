package model.entities;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Processing Combo: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Priting: " + doc);
    }

    @Override
    public String scan() {
        return "scanning combo: ";
    }
}
