package chatapp_registrationlogin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChatTest {

    private chat chatInstance = new chat();

    @Test
    void testCheckUsername_Valid() {
        assertTrue(chatInstance.checkeusername("validuser123"));
    }

    @Test
    void testCheckUsername_InvalidLength() {
        assertFalse(chatInstance.checkeusername("short"));
    }

    @Test
    void testCheckUsername_InvalidCharacters() {
        assertFalse(chatInstance.checkeusername("user@name"));
    }

    @Test
    void testCheckUsername_Null() {
        assertFalse(chatInstance.checkeusername(null));
    }

    @Test
    void testCheckPassword_Valid() {
        assertTrue(chatInstance.checkpassword("ValidPass123"));
    }

    @Test
    void testCheckPassword_InvalidLength() {
        assertFalse(chatInstance.checkpassword("short"));
    }

    @Test
    void testCheckPassword_NoUppercase() {
        assertFalse(chatInstance.checkpassword("validpass123"));
    }

    @Test
    void testCheckPassword_NoLowercase() {
        assertFalse(chatInstance.checkpassword("VALIDPASS123"));
    }

    @Test
    void testCheckPassword_NoDigit() {
        assertFalse(chatInstance.checkpassword("ValidPass"));
    }

    @Test
    void testCheckPassword_Null() {
        assertFalse(chatInstance.checkpassword(null));
    }

    @Test
    void testCheckCellphone_Valid() {
        assertTrue(chatInstance.checkcellphone("1234567890"));
    }

    @Test
    void testCheckCellphone_InvalidLength() {
        assertFalse(chatInstance.checkcellphone("123456789"));
    }

    @Test
    void testCheckCellphone_InvalidCharacters() {
        assertFalse(chatInstance.checkcellphone("123456789a"));
    }

    @Test
    void testCheckCellphone_Null() {
        assertFalse(chatInstance.checkcellphone(null));
    }

    @Test
    void testCheckFirstname_Valid() {
        assertTrue(chatInstance.checkfirstname("John"));
    }

    @Test
    void testCheckFirstname_InvalidCharacters() {
        assertFalse(chatInstance.checkfirstname("John123"));
    }

    @Test
    void testCheckFirstname_Empty() {
        assertFalse(chatInstance.checkfirstname(""));
    }

    @Test
    void testCheckFirstname_Null() {
        assertFalse(chatInstance.checkfirstname(null));
    }

    @Test
    void testCheckLastname_Valid() {
        assertTrue(chatInstance.checklastname("Doe"));
    }

    @Test
    void testCheckLastname_InvalidCharacters() {
        assertFalse(chatInstance.checklastname("Doe123"));
    }

    @Test
    void testCheckLastname_Empty() {
        assertFalse(chatInstance.checklastname(""));
    }

    @Test
    void testCheckLastname_Null() {
        assertFalse(chatInstance.checklastname(null));
    }
}