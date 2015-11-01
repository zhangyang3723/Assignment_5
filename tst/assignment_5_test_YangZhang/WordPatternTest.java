package assignment_5_test_YangZhang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_5_YangZhang.WordPattern;

public class WordPatternTest {
    private WordPattern test;

    @Before
    public void init() {
        test = new WordPattern();
    }

    @Test
    public void test() {
        Assert.assertTrue(test.wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(test.wordPattern("abba", "dog cat cat fish"));
        Assert.assertTrue(test.wordPattern("fgf", "dog cat dog"));
    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        Assert.assertTrue(test.wordPattern(null, null));
    }

    @Test
    public void testEmptyString() {
        Assert.assertFalse(test.wordPattern("", ""));
    }

}
