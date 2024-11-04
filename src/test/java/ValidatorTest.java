import org.example.Calculator;
import org.example.Validator;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidatorTest {




    // Using AssertFalse to check that phone number is less than 6 digits = too short
    @Test
    @DisplayName("Test Phone no. length - less than 6")
    public void testisPhoneNumberValid_Short(){
    assertFalse(Validator.isPhoneNumberValid("12345"));
    }

    // Using AssertFalse to check that phone number is more than 10 digits = too long
    @Test
    @DisplayName("Test Phone no. length - more than 10")
    public void testisPhoneNumberValid_Long(){
        assertFalse(Validator.isPhoneNumberValid("12345678910"));
    }

    // Using AssertFalse to check that phone number contains invalid character
    @Test
    @DisplayName("Test Phone no. invalid character")
    public void testisPhoneNumberValid_InvalidCharacter(){
        assertFalse(Validator.isPhoneNumberValid("12345A"));
    }

    // Using AssertTrue to check that email has domain name
    @Test
    @DisplayName("Test Email - valid domain name")
    public void testIsEmailValid_Valid(){
        assertTrue(Validator.isEmailValid("jon@jon.com"));
    }

    // Using AssertFalse to check invalid email with missing domain
    @Test
    @DisplayName("Test Email - invalid domain name")
    public void testIsEmailValid_Invalid(){
        assertFalse(Validator.isEmailValid("jon@jon."));
    }



}
