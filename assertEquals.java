import org.junit.Test;
import static org.junit.Assert.*;

public class assertEquals {

    @Test
    public void testUsernameCorrectlyFormatted() {
        IceTask1 user = new IceTask1();
        assertTrue(user.checkUserName("kyl_1")); // Correctly formatted username
    }

    @Test
    public void testUsernameIncorrectlyFormattedSymbols() {
        IceTask1 user = new IceTask1();
        assertFalse(user.checkUserName("kyle!!!!!!!")); // Invalid length and no underscore
    }

    @Test
    public void testUsernameMissingUnderscore() {
        IceTask1 user = new IceTask1();
        assertFalse(user.checkUserName("kyle1")); // Valid length but no underscore
    }

    @Test
    public void testPasswordMeetsComplexity() {
        IceTask1 user = new IceTask1();
        assertTrue(user.checkPasswordComplexity("Ch&&sec@ke99!")); //Correctly formatted password
    }

    @Test
    public void testPasswordFailsComplexity() {
        IceTask1 user = new IceTask1();
        assertFalse(user.checkPasswordComplexity("password")); // No caps, special char, or number
    }

    @Test
    public void testValidCellPhoneNumber() {
        IceTask1 user = new IceTask1();
        assertTrue(user.checkCellPhoneNumber("+27838968976")); // Valid Cellphone number
    }

    @Test
    public void testInvalidCellPhoneNumber() {
        IceTask1 user = new IceTask1();
        assertFalse(user.checkCellPhoneNumber("08966553")); // No country code
    }

    @Test
    public void testLoginSuccessful() {
        IceTask1 user = new IceTask1();
        user.registerUser("kyl_1", "Password1!", "+27831234567", "Kyle", "Smith");
        boolean loginResult = user.loginUser("kyl_1", "Password1!");
        assertTrue(loginResult);
    }

    @Test
    public void testLoginFailed() {
        IceTask1 user = new IceTask1();
        boolean loginResult = user.loginUser("wrongUser", "wrongPass");
        assertFalse(loginResult);
    }

    @Test
    public void testReturnLoginSuccessMessage() {
        IceTask1 user = new IceTask1();
        user.registerUser("kyl_1", "Password1!", "+27831234567", "Kyle", "Smith"); // Simulates user with valid login credentials
        user.loginUser("kyl_1", "Password1!"); // Attempts to log in using user credentials
        String expectedMessage = "Welcome Kyle Smith, it is great to see you again"; // Displays the expected message to be displayed after successful log in
        assertEquals(expectedMessage, user.returnLoginStatus(true));
    }

    @Test
    public void testReturnLoginFailedMessage() {
        IceTask1 user = new IceTask1();
        String expectedMessage = "Username or password is incorrect, please try again."; // Displays the expected message to be displayed after unsuccessful log in
        assertEquals(expectedMessage, user.returnLoginStatus(false));
    }
}
