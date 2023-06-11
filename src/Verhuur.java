import java.util.ArrayList;
import java.util.List;


interface VerhuurPattern {
    double berekenHuurprijs();

    void checkVerhuurd(boolean isVerhuurd);

    Klant getKlant();

    boolean checkVerzekering();
}

abstract class Verhuur implements VerhuurPattern {
    private String merk;
    protected double huurprijs;
    protected double verzekeringsPrijs;
    protected boolean isVerhuurd;
    protected Klant klant;

    public double getHuurprijs() {
        return huurprijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean isVerhuurd() {
        return isVerhuurd;
    }

    public void setVerhuurd(boolean verhuurd) {
        isVerhuurd = verhuurd;
    }

    public abstract double berekenHuurprijs();

    public Klant getKlant() {
        return klant;
    }

    public boolean checkVerzekering() {
        boolean heeftVerzekering = false;

        if (isVerhuurd()) {
            if (verzekeringsPrijs > 0) {
                heeftVerzekering = true;
                System.out.println("De verhuur is verzekerd.");
            } else {
                heeftVerzekering = false;
                System.out.println("De verhuur is niet verzekerd.");
            }
        } else {
            System.out.println("De verhuur is op dit moment niet verhuurd.");
        }

        return heeftVerzekering;
    }


    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(boolean isVerhuurd) {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setHuurprijs(double huurprijs) {
        this.huurprijs = huurprijs;
    }

    public void setVerzekeringsPrijs(double verzekeringsPrijs) {
        this.verzekeringsPrijs = verzekeringsPrijs;
    }

    public void setKlant(Klant klant) {
    }

    public double getVerzekeringsPrijs() {
        return verzekeringsPrijs;
    }
}
