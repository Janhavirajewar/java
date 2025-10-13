
package model;

public class User {
	public String username;
	public String password;
	public String role;
	public boolean frozen; // for account freeze/unfreeze feature

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.frozen = false;
    }

    // Getters & Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    @Override
    public String toString() {
        return String.format("Username: %s | Role: %s | Status: %s",
                username, role, (frozen ? "Frozen" : "Active"));
    }
}
