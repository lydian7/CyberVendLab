package VenderTest;

import Vender.Code;
import Vender.ProductRack;
import org.junit.Before;
import org.junit.Test;
import products.CyberEyez;
import products.Product;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
    public void canGetCode() {
        assertEquals(Code.A1, productRack.getCode());
    }

    @Test
    public void canAddProduct() {
        assertEquals(1, products.size());
    }

    @Test
    public void canGetProduct() {
        assertEquals(product, productRack.getProduct(Code.A1));
    }
}
