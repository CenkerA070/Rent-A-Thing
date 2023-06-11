class Voertuig extends Verhuur{
    private double gewicht;

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    @Override
    public double berekenHuurprijs() {
        double basisPrijs = 50.0; // Basisprijs voor een voertuig

        if (isVerhuurd()) {
            if (checkVerzekering()) {
                return basisPrijs + verzekeringsPrijs;
            } else {
                return basisPrijs;
            }
        } else {
            return 0.0; // Voertuig is niet verhuurd, dus de huurprijs is 0
        }
    }

    @Override
    public void checkVerhuurd(boolean isVerhuurd) {

    }


}


