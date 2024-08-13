package Observer;

interface Observer {
    void update(String state);
}

interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}

