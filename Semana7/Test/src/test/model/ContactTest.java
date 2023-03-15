package test.model;

import exceptions.EmptyFieldException;
import model.Contact;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContactTest {

    private Contact contact;

    public void setup1(){
        contact = null;
    }

    @Test
    public void testCase1(){
        setup1();
        boolean asserThrow = false;
        try {
           contact = new Contact(null, "", "");

        }catch (EmptyFieldException e){
            asserThrow = true;
        }
        assertTrue(asserThrow);
    }

}
