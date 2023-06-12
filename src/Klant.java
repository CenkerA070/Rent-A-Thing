class Klant {
    private String naam;
    private String achternaam;



    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setUser(String naam, String achternaam) {
        this.naam = naam;
        this.achternaam = achternaam;
    }
}