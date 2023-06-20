class Boormachine extends Verhuur  {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    public void checkVerhuurd(boolean isVerhuurd) {
        if (isVerhuurd) {
            System.out.println("de boormachine is verhuurd");
        } else {
            System.out.println("de boormachine is beschikbaar");
        }
    }

    @Override
    public double berekenHuurprijs() {
        if (getType().equals("hout")) {
           return huurprijs + 100 * lengtehuur;
         } else if (getType().equals("metaal")) {
           return huurprijs + 200 * lengtehuur;
        }
        return huurprijs;
    }

    @Override
    void getKlant() {
        System.out.println("dit is een klant voor de boormachine");
    }

    @Override
    boolean checkVerzekering() {
        if (getType().equals("hout")) {
            return heeftVerzekering = true;
        } else if (getType().equals("metaal")) {
            return heeftVerzekering = false;
        }
        return heeftVerzekering;
    }
}