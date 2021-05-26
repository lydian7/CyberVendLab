package VenderTest;

import Vender.Code;
import Vender.ProductRack;
import Vender.VendingMachine;
import org.junit.Before;
import org.junit.Test;
import products.CyberEyez;
import products.GorillaArmz;
import products.NeuraMass;
import products.Product;
import schmeckles.Schmeckle;
import schmeckles.SchmeckleReturn;
import schmeckles.SchmeckleType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

        ProductRack productRack;
        ProductRack productRack1;
        ProductRack productRack2;
        ArrayList<Product> cyberEyezList;
        ArrayList<Product> gorillaArmzList;
        ArrayList<Product> neuraMassList;
        ArrayList<ProductRack> racks;
        CyberEyez cyberEyez;
        GorillaArmz gorillaArmz;
        NeuraMass neuraMass;
        Schmeckle schmeckle;
        Schmeckle schmeckle1;
        Schmeckle schmeckle2;
        Schmeckle schmeckle3;
        ArrayList<Schmeckle> schmeckles;
        ArrayList<Schmeckle> credit;
        SchmeckleReturn schmeckleReturn;
        VendingMachine vendingMachine;


    @Before
    public void setUp() {
        cyberEyez = new CyberEyez("CyberEyez", 200);
        cyberEyezList = new ArrayList<>();
        cyberEyezList.add(cyberEyez);
        productRack = new ProductRack(Code.A1, cyberEyez.getPrice(), cyberEyezList);

        gorillaArmz = new GorillaArmz("GorillaArmz", 1000);
        gorillaArmzList = new ArrayList<>();
        gorillaArmzList.add(gorillaArmz);
        productRack1 = new ProductRack(Code.A2, gorillaArmz.getPrice(), gorillaArmzList);

        neuraMass = new NeuraMass("NeuraMass", 1500);
        neuraMassList = new ArrayList<>();
        neuraMassList.add(neuraMass);
        productRack2 = new ProductRack(Code.A3, neuraMass.getPrice(), neuraMassList);

        schmeckle = new Schmeckle(SchmeckleType.MONKEY);
        schmeckle1 = new Schmeckle(SchmeckleType.TWOTON);
        schmeckle2 = new Schmeckle(SchmeckleType.FIDY);
        schmeckle3 = new Schmeckle(SchmeckleType.G);
        schmeckles = new ArrayList<>();
//        schmeckles.add(schmeckle);
//        schmeckles.add(schmeckle1);
//        schmeckles.add(schmeckle2);
//        schmeckles.add(schmeckle3);

        schmeckleReturn = new SchmeckleReturn(schmeckles);

        credit = new ArrayList<>();

        vendingMachine = new VendingMachine(racks, credit , schmeckleReturn);
    }

    @Test
    public void canCredit() {
        vendingMachine.credit(schmeckle2);
        assertEquals(1, vendingMachine.getCreditedSchmeckles().size());
    }

    @Test
    public void checkValidity() {
        Schmeckle schmeckle = new Schmeckle(SchmeckleType.ONE);
        assertEquals(false, vendingMachine.checkCreditValidity(schmeckle));
    }

    @Test
    public void checkScmeckleReturns() {
        Schmeckle schmeckle = new Schmeckle(SchmeckleType.ONE);
        vendingMachine.credit(schmeckle);
        assertEquals(1, vendingMachine.getSchmeckleReturn().getSchmeckles().size());
    }

    @Test
    public void canBuyProduct() {
        vendingMachine.credit(schmeckle1);
        assertEquals(cyberEyez, vendingMachine.buyProduct(Code.A1, vendingMachine.getTotalCredit()));
    }
}
