package AuctionListener;


public interface AuctionSubject {
 void addListener(AuctionListener listener);
 void removeListener(AuctionListener listener);
 void notifyListeners(String eventCategory, String details);
}

