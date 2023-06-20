
interface KlantInterface {
    void setNaam(String naam);

    String naam();

    String getAchternaam();

    void setAchternaam(String achternaam);
}

class Klant implements KlantInterface {
    private String naam;
    private String achternaam;



    @Override
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String naam() {
        return naam;
    }

    @Override
    public String getAchternaam() {
        return achternaam;
    }

    @Override
    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }


}
