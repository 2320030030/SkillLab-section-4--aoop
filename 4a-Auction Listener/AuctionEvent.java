package AuctionListener;

import java.util.ArrayList;
import java.util.List;

public class AuctionEvent implements AuctionSubject {
    private final List<AuctionListener> listeners;
    private final String itemName;


    public AuctionEvent(String itemName) {
        this.itemName = itemName;
        this.listeners = new ArrayList<>();
    }

    @Override
    public void addListener(AuctionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(AuctionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners(String eventCategory, String details) {
        for (AuctionListener listener : listeners) {
            listener.onEvent(eventCategory, details);
        }
    }

    public void startAuction() {
        notifyListeners("Auction Started", "Bidding has commenced for " + itemName);
    }

    public void endAuction() {
        notifyListeners("Auction Ended", "Bidding has concluded for " + itemName);
    }

    public void itemAvailable() {
        notifyListeners("Item Available", itemName + " is available for bidding.");
    }
}
