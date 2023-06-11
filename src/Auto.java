class Auto extends Voertuig implements VerhuurPattern {
    private int zitplaatsen;

    public double huurprijs() {
        return 0.0;
    }

    public void setZitplaatsen(int zitplaatsen) {
        zitplaatsen += 4;
    }



    public int getZitplaatsen() {
        return zitplaatsen;
    }

    @Override
    public double berekenHuurprijs() {
        double basisPrijs = 10.0;
        if (isVerhuurd()) {
            if (checkVerzekering()) {
                return basisPrijs + verzekeringsPrijs;
            } else {
                return basisPrijs;
            }
        } else {
            return 0.0;
        }
    }

    @Override
    public void checkVerhuurd(boolean isVerhuurd) {
        if (isVerhuurd) {
            System.out.println("De product is op dit moment verhuurd.");
        } else {
            System.out.println("De product is op dit moment niet verhuurd.");
        }
    }

    @Override
    public Klant getKlant() {
        return null;
    }

    @Override
    public boolean checkVerzekering() {
        if (isVerhuurd()) {
            if (getVerzekeringsPrijs() > 0) {
                System.out.println("De verhuur is verzekerd.");
                return true;
            } else {
                System.out.println("De verhuur is niet verzekerd.");
                return false;
            }
        } else {
            System.out.println("De verhuur is op dit moment niet verhuurd.");
            return false;
        }
    }
}

