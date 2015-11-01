package assignment_5_test_YangZhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_5_YangZhang.MyMap;

public class MyMapTest {
    private MyMap<Integer, Integer> map;
    
    @Before
    public void setUp() throws Exception {
        map = new MyMap<Integer, Integer>();
    }

    @Test
    public void test() {
        map.put(4, 3);
        map.put(25, 121);
        map.put(2, 11);
        map.put(9, 45);
        int a = map.get(9);
        Assert.assertEquals(45, a);
        a = map.get(25);
        Assert.assertEquals(121, a);
        Assert.assertTrue(map.remove(2));
        Assert.assertFalse(map.remove(3));
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        Assert.assertEquals(null, map.get(null));
    }

}
