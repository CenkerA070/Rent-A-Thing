public class Klant {
    private String naam;
    private String achternaam;

    public Klant(String naam, String achternaam) {
        this.naam = naam;
        this.achternaam = achternaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }
}