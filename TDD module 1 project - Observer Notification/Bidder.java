package Observer;

class Bidder implements Observer {
    private String name;
    private String lastNotification;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String state) {
        lastNotification = name + " received update: " + state;
        System.out.println(lastNotification);
    }

    public String getLastNotification() {
        return lastNotification;
    }
}

