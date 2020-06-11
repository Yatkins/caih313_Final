package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailAddressTest {

    //These are worth 2 points each
    //TODO test that null email address is not valid
    @Test
    public void testValidateEmailAddressNull() {
        boolean valid = EmailAddress.validate(null);
        assertFalse(valid);
    }

    //TODO test that a normal email address is valid
    @Test
    public void testValidateEmailAddressRegular() {
        boolean valid = EmailAddress.validate("john@yahoo.com");
        assertTrue(valid);
        boolean validate = EmailAddress.validate("john@yahoo.edu");
        assertTrue(validate);
    }

    //TODO test that missing '@' in address is not valid
    @Test
    public void testValidateEmailAddressNoAt() {
        boolean valid = EmailAddress.validate("johnyahoo.com");
        assertFalse(valid);
    }

    //TODO test that wrong ending of email address is not valid
    @Test
    public void testValidateEmailAddressWrongEnd() {
        boolean valid = EmailAddress.validate("john@yahoo");
        assertFalse(valid);
    }
}