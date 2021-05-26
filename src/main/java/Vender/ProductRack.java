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
        for(Product product : products){
            if(code.getProductName() == product.getName()){
                int index = products.indexOf(product);
                productToRemove = products.remove(index);
            }
        }
        return productToRemove;
    }
}
