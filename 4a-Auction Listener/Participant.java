package AuctionListener;


public class Participant implements AuctionListener {
 private final String participantName;

 public Participant(String participantName) {
     this.participantName = participantName;
 }

 @Override
 public void onEvent(String eventCategory, String details) {
     System.out.println("Participant " + participantName + " received update: [" + eventCategory + "] " + details);
 }

 public String getName() {
     return participantName;
 }
}
