public class VoertuigFactory {
    public Auto verhuurAuto(String merk, double huurprijs, double verzekeringsPrijs, int gewicht, int zitplaatsen, boolean isVerhuurd, Klant klant) {
        Auto auto = new Auto();
        auto.setMerk(merk);
        auto.setHuurprijs(huurprijs);
        auto.setVerzekeringsPrijs(verzekeringsPrijs);
        auto.setGewicht(gewicht);
        auto.setZitplaatsen(zitplaatsen);
        auto.setVerhuurd(isVerhuurd);
        auto.setKlant(klant);
        return auto;
    }

    public VrachtAuto verhuurVrachtAuto(String merk, double huurprijs, double verzekeringsPrijs, int gewicht, int laadvermogen, boolean isVerhuurd, Klant klant) {
        VrachtAuto vrachtAuto = new VrachtAuto();
        vrachtAuto.setMerk(merk);
        vrachtAuto.setHuurprijs(huurprijs);
        vrachtAuto.setVerzekeringsPrijs(verzekeringsPrijs);
        vrachtAuto.setGewicht(gewicht);
        vrachtAuto.setLaadvermogen(laadvermogen);
        vrachtAuto.setVerhuurd(isVerhuurd);
        vrachtAuto.setKlant(klant);
        return vrachtAuto;
    }
}
