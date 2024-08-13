package NewsFeedSystem;

import java.util.ArrayList;
import java.util.List;

class NewsFeed implements Subject {
    private List<Observer> observers;
    private String latestArticle;

    public NewsFeed() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestArticle);
        }
    }

    public void publishArticle(String article) {
        this.latestArticle = article;
        notifyObservers();
    }
}
