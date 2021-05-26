package Vender;

import products.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    

    private HashMap<String, ArrayList<Product>> products;
    private HashMap<Schmeckles, ArrayList<Schmeckles> > schmeckleVault;

    public VendingMachine(HashMap<String, ArrayList<Product>> products, HashMap<Schmeckles, ArrayList<Schmeckles>> schmeckleVault) {
        this.products = products;
        this.schmeckleVault = schmeckleVault;
    }


    public HashMap<String, ArrayList<Product>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, ArrayList<Product>> products) {
        this.products = products;
    }

    public HashMap<Schmeckles, ArrayList<Schmeckles>> getSchmeckleVault() {
        return schmeckleVault;
    }



//set credit function
    public void addToSchmeckleVault(Schmeckles schmeckles) {
        ArrayList<Schmeckles> temp = schmeckleVault.get(schmeckles);

        temp.add(schmeckles);

        this.schmeckleVault.put(schmeckles, temp);
    }
}
