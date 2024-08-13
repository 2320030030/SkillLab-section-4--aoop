package Observer;

import java.util.ArrayList;
import java.util.List;

class AuctionItem implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    private String itemName;

    public AuctionItem(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
