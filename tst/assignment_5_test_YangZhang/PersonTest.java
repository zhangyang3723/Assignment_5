package assignment_5_test_YangZhang;

import org.junit.Assert;
import org.junit.Test;

import assignment_5_YangZhang.Person;

public class PersonTest {

    @Test
    public void test() {
        Person a = new Person("Allen", "Page");
        Person b = new Person("Allen","Lee");
        Assert.assertTrue(a.equals(b));
        Assert.assertEquals(0, a.compareTo(b));
    }

}
