package ua.intita.qa.homework13.task_a;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User user;

    @Before
    public void init() {
        user = new User();
    }

    @Test
    public void setRightFirstNameTest() throws IllegalNameException {
        user.setFirstName("Bob");
        TestCase.assertEquals(user.getFirstName(), "Bob");
    }

    @Test(expected = IllegalNameException.class)
    public void setWrongFirstNameWithoutUppercaseTest() throws IllegalNameException {
        user.setFirstName("bob");
    }

    @Test(expected = IllegalNameException.class)
    public void setWrongFirstNameWithNumbersTest() throws IllegalNameException {
        user.setFirstName("Bob42");
    }

    @Test(expected = IllegalNameException.class)
    public void setWrongFirstNameWithSpecialSymbolTest() throws IllegalNameException {
        user.setFirstName("Bob@&");
    }

    @Test
    public void setRightAgeTest() throws IllegalAgeException {
        user.setAge(25);
        TestCase.assertEquals(user.getAge(), 25);
    }

    @Test(expected = IllegalAgeException.class)
    public void setAgeNegativeThanIllegalAgeExceptionTest() throws IllegalAgeException {
        user.setAge(-5);
        TestCase.assertEquals(user.getAge(), 25);
    }

    @Test(expected = IllegalAgeException.class)
    public void setWrongAgeThanIllegalAgeExceptionTest() throws IllegalAgeException {
        user.setAge(160);
        TestCase.assertEquals(user.getAge(), 25);
    }

    @Test
    public void setRightEmailTest() throws IllegalEmailException {
        user.setEmail("l.d@gmail.com");
        TestCase.assertEquals(user.getEmail(), "l.d@gmail.com");
    }

    @Test(expected = IllegalEmailException.class)
    public void setEmailWithSpecialSymbolBeforeTest() throws IllegalEmailException {
        user.setEmail("#l.d@gmail.com");
    }

    @Test(expected = IllegalEmailException.class)
    public void setEmailWithSpecialSymbolAfterTest() throws IllegalEmailException {
        user.setEmail("#l.d@gmail%.com");
    }

    @Test
    public void setRightPasswordTest() throws IllegalPasswordException {
        user.setPassword("klAdf78uiop");
        TestCase.assertEquals(user.getPassword(), "klAdf78uiop");
    }

    @Test(expected = IllegalPasswordException.class)
    public void setPasswordLessThanTenCharactersTest() throws IllegalPasswordException {
        user.setPassword("klAdf78");
    }

}