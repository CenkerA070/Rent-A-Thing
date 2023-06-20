class Voertuig extends Verhuur{
    private double gewicht;



    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public final void voertuig() {
        System.out.println("dit is een voertuig en mag niet meer geerfd/override worden");
    }

    @Override
    double berekenHuurprijs() {
        if (getGewicht() < 3000) {
            return huurprijs + 500;
        } else {
            return huurprijs + 600;
        }
    }

    @Override
    void getKlant() {
        System.out.println("dit is een klant voor de voertuig");
    }

    @Override
    boolean checkVerzekering() {
        if (getGewicht() < 3000) {
            heeftVerzekering = true;
        } else heeftVerzekering = false;
        return heeftVerzekering;
    }

    @Override
    void checkVerhuurd(boolean isVerhuurd) {
        if (isVerhuurd) {
            System.out.println("de voertuig is verhuurd");
        } else {
            System.out.println("de voertuig is beschikbaar");
        }
    }
}


