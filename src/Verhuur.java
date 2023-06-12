import java.util.ArrayList;
import java.util.List;


// VerhuurPattern (interface)
interface VerhuurPattern {
    double berekenHuurprijs();

    void checkVerhuurd(boolean isVerhuurd);

    Klant getKlant();

    boolean checkVerzekering();
}

// Verhuur (abstract class implementing VerhuurPattern)
public class Verhuur implements VerhuurPattern {
    private String merk;
    private double huurprijs;
    private double verzekeringsPrijs;
    private boolean isVerhuurd;
    private boolean heeftVerzekering = false;
    protected Klant klant;

    protected int lengtehuur;
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public double berekenHuurprijs() {
        if (verzekeringsPrijs > 0) {
            huurprijs += getHuurprijs() + getVerzekeringsPrijs() * lengtehuur;
        } else {
            huurprijs += huurprijs * lengtehuur;
        }

        return huurprijs;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Klant getKlant() {
        return klant;
    }

    public boolean checkVerzekering() {
        if (verzekeringsPrijs > 0) {
            heeftVerzekering = true;
            System.out.println("De verhuur is verzekerd.");
        } else {
            heeftVerzekering = false;
            System.out.println("De verhuur is niet verzekerd.");
        }

        return heeftVerzekering;
    }

    @Override
    public void checkVerhuurd(boolean isVerhuurd) {
        if (isVerhuurd()) {
            isVerhuurd = true;
        } else {
            isVerhuurd = false;
        }
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

    public void setVerhuurd(boolean isVerhuurd) {
        this.isVerhuurd = isVerhuurd;
        notifyObservers();
    }

    public void setVerzekeringsPrijs(double verzekeringsPrijs) {
        this.verzekeringsPrijs = verzekeringsPrijs;
        notifyObservers();
    }

    public void setHuurprijs(double huurprijs) {
        this.huurprijs = huurprijs;
        notifyObservers();
    }

    public double getHuurprijs() {
        return huurprijs;
    }

    public double getVerzekeringsPrijs() {
        return verzekeringsPrijs;
    }

    public int getLengtehuur() {
        return lengtehuur;
    }

    public int setLengtehuur(int lengteHuur) {
        return lengtehuur;
    }


    public void setVerzekering(boolean verzekering) {
        this.heeftVerzekering = verzekering;
    }
}
