package Vender;

import products.Product;
import schmeckles.Schmeckle;
import schmeckles.SchmeckleReturn;
import schmeckles.SchmeckleType;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    

    private ArrayList<ProductRack> productRacks;
    private ArrayList<Schmeckle> creditedSchmeckles;
    private SchmeckleReturn schmeckleReturn;
    private ArrayList<Integer> schmeckleValues;
    private int count;
    Schmeckle schmeckle;

    public VendingMachine(ArrayList<ProductRack> productRacks, ArrayList<Schmeckle> creditedSchmeckles, SchmeckleReturn schmeckleReturn) {
        this.productRacks = productRacks;
        this.creditedSchmeckles = creditedSchmeckles;
        this.schmeckleReturn = schmeckleReturn;
        this.schmeckle = new Schmeckle(SchmeckleType.G);
        this.schmeckleValues = schmeckle.getSchmeckle().getAll();
    }


    public void credit(Schmeckle schmeckle) {
        if(checkCreditValidity(schmeckle)){
            this.creditedSchmeckles.add(schmeckle);
            this.count++;
        } else {
            this.schmeckleReturn.addSchmeckle(schmeckle);
        }
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Schmeckle> getCreditedSchmeckles() {
        return creditedSchmeckles;
    }


    public boolean checkCreditValidity(Schmeckle schmeckle) {
        return schmeckleValues.contains(schmeckle.getSchmeckle().getValue());
    }

    public SchmeckleReturn getSchmeckleReturn() {
        return schmeckleReturn;
    }

    public void buyProduct(Code code, Schmeckle schmeckle){
        for(ProductRack rack : productRacks){
            if(code == rack.getCode() && schmeckle.getSchmeckle().getValue() >= rack.getPrice()){
                this.credit(schmeckle);
            }
        }

    }
}
