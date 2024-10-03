import java.util.ArrayList;

public class PasswordManager {
    public static PasswordManager instance; // Singleton instance
    public ArrayList<String> passwords;

    public PasswordManager() {
        this.passwords = new ArrayList<>();
        passwords.add("Pass");
    }

    // Static method to get the single instance of PasswordManager
    public static PasswordManager getInstance() {
        if (instance == null) {
            instance = new PasswordManager();
        }
        return instance;
    }

    public String getPassword() {
        if (!passwords.isEmpty()) {
            return passwords.get(0);
        }
        return null;
    }

    public void changePassword(String newPassword) {
        if (!passwords.isEmpty()) {
            passwords.set(0, newPassword);
        } else {
            passwords.add(newPassword);
        }
    }
}
