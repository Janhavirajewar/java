
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.User;

public class UserDAO {

    public ArrayList<User> users = new ArrayList<>();

    public UserDAO() {
        // default admin
        users.add(new User("admin", "admin@123", "Admin"));
    }

    // Validate login
    public User validateLogin(String username, String password, String role)
    {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username)
                    && u.getPassword().equals(password)
                    && u.getRole().equalsIgnoreCase(role)) {
                return u;
            }
        }
        return null;
    }	

    // Register new user
    public boolean registerUser(String username, String password, String role) {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return false; // already exists
            }
        }
        users.add(new User(username, password, role));
        return true;
    }

    // Forgot password
    public boolean resetPassword(String username, Scanner sc) {
        for (User u : users) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                System.out.print("Enter new password: ");
                String newPass = sc.nextLine();
                u.setPassword(newPass);
                return true;
            }
        }
        return false;
    }

    // View all users (Admin feature)
    public void displayUsers() {
        System.out.println("\n===== Registered Users =====");
        for (User u : users) {
            System.out.println(u);
        }
    }
}
