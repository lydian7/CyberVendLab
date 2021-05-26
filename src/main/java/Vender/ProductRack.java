package Vender;

import products.Product;

import java.util.ArrayList;

public class ProductRack {

    Code code;
    private int price;
    private ArrayList<Product> products;

    public ProductRack(Code code, int price, ArrayList<Product> products) {
        this.code = code;
        this.price = price;
        this.products = products;
    }

    public Code getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProduct(Code code){
        Product productToRemove = null;
//        for(Product product : products) this didnt work with for each
        for(int i = 0; i < products.size(); i++){
            if(code.getProductName() == products.get(i).getName()){
                productToRemove = products.remove(i);
            }
        }
        return productToRemove;
    }
}
