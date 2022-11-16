package Observer;

import java.util.ArrayList;
import java.util.List;

public class DeliverData implements Subject{

    private List<Observer> observers;
    private String location;

    public DeliverData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(location);
        }
    }

    public void locationChanged(){
        this.location = getLocation();
        notifyObserver();
    }

    private String getLocation() {
        return "Yplace";
    }
}
