import java.util.ArrayList;

public class VoertuigFactory {
    public Auto verhuurAuto() {
        Auto auto = new Auto();
        auto.setMerk("Toyota");
        auto.setHuurprijs(50.0);
        auto.setVerzekeringsPrijs(10.0);
        auto.setGewicht(1500);
        auto.setZitplaatsen(4);
        return auto;
    }

    public ArrayList<Auto> produceAutos(){
        ArrayList<Auto> autos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            autos.add(verhuurAuto());
        }
        return autos;
    }

    public VrachtAuto verhuurVrachtAuto() {
        VrachtAuto vrachtAuto = new VrachtAuto();
        vrachtAuto.setMerk("Scania");
        vrachtAuto.setHuurprijs(100.0);
        vrachtAuto.setVerzekeringsPrijs(20.0);
        vrachtAuto.setGewicht(5000);
        vrachtAuto.setLaadvermogen(10000);
        return vrachtAuto;
    }

    public ArrayList<VrachtAuto> produceVrachtAuto() {
        ArrayList<VrachtAuto> vrachtAutos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vrachtAutos.add(verhuurVrachtAuto());
        }
        return vrachtAutos;
    }
}