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

    }

    @Override
    public double berekenHuurprijs() {
        return 0;
    }

    @Override
    public Klant getKlant() {
        return null;
    }
}