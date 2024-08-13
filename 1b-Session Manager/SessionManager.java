package SessionManager;

public class SessionManager {
    private static SessionManager instance;
    private boolean isActive;
    private String currentUser;

    private SessionManager() {
        this.isActive = false;
        this.currentUser = null;
    }

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void authenticate(String user) {
        this.currentUser = user;
        this.isActive = true;
    }

    public void endSession() {
        this.currentUser = null;
        this.isActive = false;
    }


    public boolean isSessionActive() {
        return isActive;
    }

 
    public String getCurrentUser() {
        return currentUser;
    }

	
}
