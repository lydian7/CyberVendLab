package Vender;

import products.Product;
import schmeckles.SchmeckleType;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    

    private HashMap<String, ArrayList<Product>> products;
    private HashMap<SchmeckleType, ArrayList<SchmeckleType> > schmeckleVault;

    public VendingMachine(HashMap<String, ArrayList<Product>> products, HashMap<SchmeckleType, ArrayList<SchmeckleType>> schmeckleVault) {
        this.products = products;
        this.schmeckleVault = schmeckleVault;
    }


    public HashMap<String, ArrayList<Product>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<String, ArrayList<Product>> products) {
        this.products = products;
    }

    public HashMap<SchmeckleType, ArrayList<SchmeckleType>> getSchmeckleVault() {
        return schmeckleVault;
    }



//set credit function
    public void addToSchmeckleVault(SchmeckleType schmeckles) {
        ArrayList<SchmeckleType> temp = schmeckleVault.get(schmeckles);

        temp.add(schmeckles);

        this.schmeckleVault.put(schmeckles, temp);
    }

    public void removeFromSchmeckleVault(SchmeckleType schmeckles){
        ArrayList<SchmeckleType> tempRemove = schmeckleVault.get(schmeckles);

        tempRemove.remove(schmeckles);

        this.schmeckleVault.put(schmeckles, tempRemove);
    }
}
