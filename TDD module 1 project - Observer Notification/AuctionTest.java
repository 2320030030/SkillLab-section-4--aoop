package Observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class AuctionTest {

    private AuctionItem auctionItem;
    private Bidder bidder1;
    private Bidder bidder2;

    @BeforeEach
    void setUp() {
        auctionItem = new AuctionItem("Antique Vase");
        bidder1 = new Bidder("Bidder 1");
        bidder2 = new Bidder("Bidder 2");
    }

    @Test
    void testObserversReceiveNotification() {
        auctionItem.registerObserver(bidder1);
        auctionItem.registerObserver(bidder2);

        auctionItem.setState("Bidding started");

        assertEquals("Bidder 1 received update: Bidding started", bidder1.getLastNotification());
        assertEquals("Bidder 2 received update: Bidding started", bidder2.getLastNotification());
    }

    @Test
    void testObserverDoesNotReceiveNotificationAfterUnsubscribing() {
        auctionItem.registerObserver(bidder1);
        auctionItem.unregisterObserver(bidder1);

        auctionItem.setState("Bidding started");

        assertNull(bidder1.getLastNotification());
    }

    @Test
    void testMultipleStateChangesNotifyObservers() {
        auctionItem.registerObserver(bidder1);

        auctionItem.setState("Bidding started");
        assertEquals("Bidder 1 received update: Bidding started", bidder1.getLastNotification());

        auctionItem.setState("Bidding ended");
        assertEquals("Bidder 1 received update: Bidding ended", bidder1.getLastNotification());
    }
}
