package Vender;

import products.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    

    private HashMap<String, ArrayList<Product>> products;
    private HashMap<Integer, ArrayList<Schmeckles>> schmeckleVault;

    public VendingMachine(HashMap<String, ArrayList<Product>> products, HashMap<Integer, ArrayList<Schmeckles>> schmeckleVault) {
        this.products = products;
        this.schmeckleVault = schmeckleVault;
    }


    public HashMap<String, ArrayList<Product>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, ArrayList<Product>> products) {
        this.products = products;
    }

    public HashMap<Integer, ArrayList<Schmeckles>> getSchmeckleVault() {
        return schmeckleVault;
    }


//set credit function
    public void setSchmeckleVault(HashMap<Integer, ArrayList<Schmeckles>> schmeckleVault) {
        this.schmeckleVault = schmeckleVault;
    }
}
