package test.model;

import exceptions.DuplicatedNumberException;
import exceptions.EmptyFieldException;
import model.Contact;
import model.LinkedList;
import model.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactListTest {

    private LinkedList<Contact, String> contactList;

    public void setup1(){
        contactList = new LinkedList<>();
    }

    public void setup2(){
        contactList = new LinkedList<>();

        try{
            Contact c1 = new Contact("Nayeli",    "50", "Nayeli.email@gmail.com"  );
            Contact c2 = new Contact("Sergio",    "40", "Sergio.email@gmail.com" );
            Contact c3 = new Contact("Isabella",  "60", "Isabella.email@gmail.com");
            Contact c4 = new Contact("Yeison",    "45", "Yeison.email@gmail.com"  );
            Contact c5 = new Contact("Valentina", "55", "Valentina.email@gmail.com");
            Contact c6 = new Contact("Danna",     "30", "Danna.email@gmail.com"   );
            Contact c7 = new Contact("Sebastian", "70", "Sebastian.email@gmail.com");

            contactList.addLast(new Node<Contact, String>(c1, c1.getPhone()));
            contactList.addLast(new Node<Contact, String>(c2, c2.getPhone()));
            contactList.addLast(new Node<Contact, String>(c3, c3.getPhone()));
            contactList.addLast(new Node<Contact, String>(c4, c4.getPhone()));
            contactList.addLast(new Node<Contact, String>(c5, c5.getPhone()));
            contactList.addLast(new Node<Contact, String>(c6, c6.getPhone()));
            contactList.addLast(new Node<Contact, String>(c7, c7.getPhone()));

        }catch (EmptyFieldException e){
            // do nothing
        }
    }

    @Test
    public void testCase1(){
        setup1();
        boolean isDuplicated = false;
        try{

            Contact c1 = new Contact("contact1", "00", "contact1@correo.com");
            Contact c2 = new Contact("contact1", "00", "contact1@correo.com");

            Node<Contact, String> node1 = new Node<>(c1, c1.getPhone());
            Node<Contact, String> node2 = new Node<>(c2, c2.getPhone());

            contactList.addLast(node1);
            contactList.addLast(node2);
        }catch (EmptyFieldException e){
            // do nothing
        }catch (DuplicatedNumberException e){
           isDuplicated = true;
        }
        assertTrue(isDuplicated);
    }

    @Test
    public void testcase2(){
        setup2();
        try{
            Contact c0 = new Contact("contact7", "75", "Sebastian.email@gmail.com");
            Node<Contact, String> n0 = new Node<Contact, String>(c0, c0.getPhone());
            contactList.addLast(n0);
            assertEquals(n0, contactList.search("75"));
        }catch(EmptyFieldException e){

        }

    }

}
