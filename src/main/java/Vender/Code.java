package Vender;

import products.Product;

public enum Code {

    A1("CyberEyez"),
    A2("GorillaArmz"),
    A3("NeuraMass"),
    ;

    private final String productName;

    Code(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
