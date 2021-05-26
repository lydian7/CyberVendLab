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
    private int totalCredit;
    Schmeckle schmeckle;

    public VendingMachine(ArrayList<ProductRack> productRacks, ArrayList<Schmeckle> creditedSchmeckles, SchmeckleReturn schmeckleReturn) {
        this.productRacks = productRacks;
        this.creditedSchmeckles = creditedSchmeckles;
        this.schmeckleReturn = schmeckleReturn;
        this.schmeckle = new Schmeckle(SchmeckleType.G);
        this.count = 0;
        this.totalCredit = 0;
        this.schmeckleValues = schmeckle.getSchmeckle().getAll();
    }


    public void credit(Schmeckle schmeckle) {
        if(checkCreditValidity(schmeckle)){
            this.creditedSchmeckles.add(schmeckle);
            this.count++;
            this.totalCredit += schmeckle.getSchmeckle().getValue();
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

    public Product buyProduct(Code code, int totalCredit){

        Product product = null;
        for(ProductRack rack : productRacks){
            if(code == rack.getCode() && totalCredit >= rack.getPrice()){
                product = rack.getProduct(code);
            }
        }
    return product;
    }

    public int getTotalCredit() {
        return totalCredit;
    }
}
