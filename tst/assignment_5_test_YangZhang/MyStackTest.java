package assignment_5_test_YangZhang;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import assignment_5_YangZhang.MyStack;

public class MyStackTest {
    private MyStack stack;
    
    @Before
    public void setUp() throws Exception {
        stack = new MyStack();
    }

    @Test
    public void test() throws Exception {
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int a = stack.pop();
        Assert.assertEquals(5, a);
        a = stack.top();
        Assert.assertEquals(4, a);
        a = stack.pop();
        Assert.assertEquals(4, a);       
    }
    
    @Test(expected = Exception.class)
    public void testPopEmptyStack() throws Exception {
        stack.push(3);
        stack.pop();
        stack.pop();
    }

}
