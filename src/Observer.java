import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update();
}

class Listener implements Observer {
    public void update() {

    }
}

class Programma implements Observer {
    public void update() {

    }
}

class Observable {
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
}
