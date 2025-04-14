import javax.swing.JOptionPane;

public class JOP{
    public static void main(String[] args) {
        IceTask1 user = new IceTask1();
        //loops the prompt until user input for username is valid
        String username;
        do {
            username = JOptionPane.showInputDialog("Enter username (must include _ and be ≤ 5 characters):");
            if (user.checkUserName(username)) {
                JOptionPane.showMessageDialog(null, "Invalid username. It must contain an underscore and be no more than 5 characters.");
            }
        } while (user.checkUserName(username));

        //loops the prompt until user input for password is valid
        String password;
        do {
            password = JOptionPane.showInputDialog("Enter password (must contain uppercase, digit, special character, and at least 8 characters):");
            if (user.checkPasswordComplexity(password)) {
                JOptionPane.showMessageDialog(null, "Invalid password. It must have a capital letter, a number, and a special character.");
            }
        } while (user.checkPasswordComplexity(password));

        //loops the prompt until user input for cellphone number is valid
        String cellphone;
        do {
            cellphone = JOptionPane.showInputDialog("Enter cellphone number (format: +27831234567):");
            if (user.checkCellPhoneNumber(cellphone)) {
                JOptionPane.showMessageDialog(null, "Invalid cellphone number. It must start with +27 and be followed by 9 digits.");
            }
        } while (user.checkCellPhoneNumber(cellphone));

        //prompts user to input their first and last name
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        //validates user input, stores the returned message and displays the result of users input
        String result = user.registerUser(username, password, cellphone, firstName, lastName);
        JOptionPane.showMessageDialog(null, result);

        //if the user was registered successfully it will then prompt them to login using the username and password they entered previously
        if (result.equals("User registered successfully.")) {
            String loginUsername = JOptionPane.showInputDialog("Login: Enter username:");
            String loginPassword = JOptionPane.showInputDialog("Login: Enter password:");

        //stores the result, takes the boolean result and returns a message and displays the result for the user
            boolean isLoggedIn = user.loginUser(loginUsername, loginPassword);
            JOptionPane.showMessageDialog(null, user.returnLoginStatus(isLoggedIn));
        }
    }
}
