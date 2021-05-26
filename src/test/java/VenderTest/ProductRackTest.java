package VenderTest;

import Vender.Code;
import Vender.ProductRack;
import org.junit.Before;
import org.junit.Test;
import products.CyberEyez;
import products.Product;

import java.util.ArrayList;

public class ProductRackTest {
    
    ProductRack productRack;
    Product product;
    ArrayList<Product> products;

    @Before
    public void setUp(){
        product = new CyberEyez("CyberEyez", 200);
        products = new ArrayList<>();
        products.add(product);
        productRack = new ProductRack(Code.A1, product.getPrice(), products);
    }

    @Test
    public void canGet() {
    }
}
