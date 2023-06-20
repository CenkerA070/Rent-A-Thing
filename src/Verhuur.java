import java.util.ArrayList;
import java.util.List;


abstract class VerhuurPattern {
   abstract double berekenHuurprijs();

   abstract void checkVerhuurd(boolean isVerhuurd);

   abstract void getKlant();
   abstract boolean checkVerzekering();

   public final void procesVerhuur(boolean isVerhuurd) {
       berekenHuurprijs();

       checkVerhuurd(isVerhuurd);

       getKlant();

       checkVerzekering();
   }
}

// Verhuur (abstract class implementing VerhuurPattern)
abstract class Verhuur extends VerhuurPattern   {
    protected String merk;
    protected double huurprijs;
    protected double verzekeringsPrijs;
    protected boolean isVerhuurd;
    protected boolean heeftVerzekering;
    protected KlantInterface klant;

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




    public void setKlant(KlantInterface klant) {
        this.klant = klant;
    }


    @Override
    abstract double berekenHuurprijs();
    @Override
    abstract void getKlant();

    @Override
    abstract boolean checkVerzekering();

    @Override
    abstract void checkVerhuurd(boolean isVerhuurd);

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
