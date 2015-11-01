package assignment_5_test_YangZhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_5_YangZhang.InvalidInputException;
import assignment_5_YangZhang.SingleNumber;

public class SingleNumberTest {
    private SingleNumber test;
    
    @Before
    public void init() {
        test = new SingleNumber();
    }

    @Test
    public void test() {
        int[] a = {2, 3, 4, 2, 3, 4, 5, 6, 6};
        Assert.assertEquals(5, test.singleNum(a));
        int[] b = {2, 3, 4, 2, 3, 4, 5, 6, 6, 5, 7};
        Assert.assertEquals(7, test.singleNum(b));
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullPointerException() throws InvalidInputException {
        Assert.assertEquals(5, test.singleNum(null));
    }

}
