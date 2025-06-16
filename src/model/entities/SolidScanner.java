package model.entities;

public class SolidScanner extends Device implements Scanner{

    public SolidScanner(String serialNumber) {
        super(serialNumber);
     }

    @Override
    public void processDoc(String doc) {
      System.out.println("Scanning doc: " + doc);
    }

    @Override
    public String scan(){
        return "Scanned Content...";
    }
}


