package Vender;

import products.Product;
import schmeckles.Schmeckle;
import schmeckles.SchmeckleReturn;
import schmeckles.SchmeckleType;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    

    private ArrayList<ProductRack> productRacks;
    private ArrayList<Schmeckle> creditedScmheckles;
    private SchmeckleReturn schmeckleReturn;

    public VendingMachine(ArrayList<ProductRack> productRacks, ArrayList<Schmeckle> creditedScmheckles, SchmeckleReturn schmeckleReturn) {
        this.productRacks = productRacks;
        this.creditedScmheckles = creditedScmheckles;
        this.schmeckleReturn = schmeckleReturn;
    }


}
