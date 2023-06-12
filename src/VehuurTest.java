import org.junit.Assert;
import org.junit.Test;
public class VehuurTest {

    @Test
    public void testFactoryAuto() {

        // hier testen wij het maken van een factory auto
        VoertuigFactory factory = new VoertuigFactory();

        Auto auto = factory.verhuurAuto();

        Assert.assertEquals("Toyota", auto.getMerk());
        Assert.assertEquals(50.0, auto.getHuurprijs(), 0.01);
        Assert.assertEquals(10.0, auto.getVerzekeringsPrijs(), 0.01);
        Assert.assertEquals(1500.0, auto.getGewicht(), 0.01);
        Assert.assertEquals(4, auto.getZitplaatsen());
        Assert.assertFalse(auto.isVerhuurd());
        Assert.assertNull(auto.getKlant());
    }

    @Test
    public void testFactoryVrachtAuto() {

        VoertuigFactory factory = new VoertuigFactory();

        VrachtAuto vrachtAuto = factory.verhuurVrachtAuto();

        Assert.assertEquals("Scania", vrachtAuto.getMerk());
        Assert.assertEquals(100.0, vrachtAuto.getHuurprijs(), 0.01);
        Assert.assertEquals(20.0, vrachtAuto.getVerzekeringsPrijs(), 0.01);
        Assert.assertEquals(5000.0, vrachtAuto.getGewicht(), 0.01);
        Assert.assertEquals(10000, vrachtAuto.getLaadvermogen());
        Assert.assertFalse(vrachtAuto.isVerhuurd());
        Assert.assertNull(vrachtAuto.getKlant());
    }

}
