package NewsFeedSystem;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsFeed newsFeed = new NewsFeed();

        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");

        newsFeed.registerObserver(subscriber1);
        newsFeed.registerObserver(subscriber2);

        newsFeed.publishArticle("Breaking News: Observer Pattern in Java!");

        newsFeed.removeObserver(subscriber1);

        newsFeed.publishArticle("Update: Observer Pattern Example Completed!");
    }
}
