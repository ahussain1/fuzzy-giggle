import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestWordTest {

    @Test
    public void returnsLongestWordList() {
        final String sentence = "My name is Arif, and I live in Cuba.";
        final List<String> actual = LongestWord.longestWord(sentence);
        final List<String> expectedList = Arrays.asList("name: 4", "Arif: 4", "live: 4", "Cuba: 4");

        Assert.assertEquals(actual, expectedList);
    }

    @Test
    public void listToStringTest() {
        final List<String> list = Arrays.asList("name: 4", "Arif: 4", "live: 4", "Cuba: 4");
        final String expected = "name: 4\n" + "Arif: 4\n" + "live: 4\n" + "Cuba: 4\n";
        final String actual = LongestWord.listToString(list);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void mainTest() {
        String sentence = "My name is Arif, and I live in Cuba.";
        final String expected = "name: 4\n" + "Arif: 4\n" + "live: 4\n" + "Cuba: 4\n";
        final String actual = LongestWord.listToString(LongestWord.longestWord(sentence));

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void passEmptyStringToMain() {

    }

}
