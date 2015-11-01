package assignment_5_test_YangZhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_5_YangZhang.InvalidInputException;
import assignment_5_YangZhang.ValidString;

public class ValidStringTest {
    private ValidString test;

    @Before
    public void init() {
        test = new ValidString();
    }

    @Test(expected = InvalidInputException.class)
    public void testInvalidInputException() throws InvalidInputException {
        Assert.assertFalse(test.isValid("[{()}]()[()](a"));
        Assert.assertFalse(test.isValid(""));
    }

    @Test
    public void testValidString() throws InvalidInputException {
        Assert.assertTrue(test.isValid("[{()}]()[()]"));
        Assert.assertTrue(test.isValid("(){}[]"));
    }
    
    @Test
    public void testInvalidString() throws InvalidInputException {
        Assert.assertFalse(test.isValid("}[{()}]()[()]"));
        Assert.assertFalse(test.isValid("(){}[]("));
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() throws InvalidInputException {
        Assert.assertFalse(test.isValid(null));
    }
}
