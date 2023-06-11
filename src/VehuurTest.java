import org.junit.Assert;
import org.junit.Test;
public class VehuurTest {

    @Test
    public void testVerhuurAuto() {
        VoertuigFactory factory = new VoertuigFactory();
        Klant klant = new Klant("John", "Doe");

        Auto auto = factory.verhuurAuto("Mercedes", 100.0, 20.0, 1500, 4, false, klant);
        auto.setVerzekeringsPrijs(50.0);
        auto.setHuurprijs(50.0);

        Assert.assertEquals("Mercedes", auto.getMerk());
        Assert.assertEquals(50.0, auto.getHuurprijs(), 0.01);
        Assert.assertEquals(50.0, auto.getVerzekeringsPrijs(), 0.01);
        Assert.assertEquals(100.0, auto.berekenHuurprijs(), 0.001);
        Assert.assertEquals(1500, auto.getGewicht());
        Assert.assertEquals(4, auto.getZitplaatsen());
        Assert.assertFalse(auto.isVerhuurd());
        Assert.assertEquals(klant, auto.getKlant());

        auto.setVerhuurd(true);
        auto.checkVerhuurd(true);

        Assert.assertTrue(auto.isVerhuurd());

        auto.checkVerhuurd(false);

        Assert.assertFalse(auto.isVerhuurd());

        auto.setVerzekeringsPrijs(30.0);
        auto.checkVerzekering();

        Assert.assertEquals(30.0, auto.getVerzekeringsPrijs(), 0.01);

        auto.setVerzekeringsPrijs(0.0);
        auto.checkVerzekering();

        Assert.assertEquals(0.0, auto.getVerzekeringsPrijs(), 0.01);
    }

}
