package VehicleCreation;


class AuthService {
 private static AuthService uniqueInstance;
 private String loggedInUser;

 private AuthService() {
 }

 public static synchronized AuthService getInstance() {
     if (uniqueInstance == null) {
         uniqueInstance = new AuthService();
     }
     return uniqueInstance;
 }

 public void signIn(String user) {
     this.loggedInUser = user;
     System.out.println("User " + user + " has successfully signed in.");
 }

 public void signOut() {
     System.out.println("User " + loggedInUser + " has successfully signed out.");
     this.loggedInUser = null;
 }

 public String getLoggedInUser() {
     return loggedInUser;
 }
}
