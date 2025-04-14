import java.util.regex.Pattern;

public class IceTask1{
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // Check username format (underscore and ≤5 characters)
    public boolean checkUserName(String username) {
        return !username.contains("_") || username.length() > 5;
    }

    // Check password complexity (contain uppercase, digit and a special character)
    public boolean checkPasswordComplexity(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return !Pattern.matches(regex, password);
    }

    // Validate SA cellphone number
    public boolean checkCellPhoneNumber(String cellphone) {
        String regex = "^\\+27\\d{9}$"; // Correct format
        return !Pattern.matches(regex, cellphone);
    }

    // Register user with validation messages
    public String registerUser(String username, String password, String cellphone, String firstName, String lastName) {
        if (checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that username contains an underscore and is no more than five characters in length.";
        }
        if (checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (checkCellPhoneNumber(cellphone)) {
            return "Cellphone number incorrectly formatted or does not contain international code.";
        }
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        return "User registered successfully.";
    }

    // Verify login credentials
    public boolean loginUser(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // Return login status message
    public String returnLoginStatus(boolean isLoggedIn) {
        return isLoggedIn ? "Welcome " + firstName +" " + lastName + " it is great to see you again" : "Username or password is incorrect, please try again.";
    }
}
