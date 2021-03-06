package logic;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ashleygrayson on 28/07/2016.
 */
public class LogicPuzzlesTest {

    private LogicPuzzles logicPuzzles;

    @Before
    public void before() {
        logicPuzzles = new LogicPuzzles();
    }

    @Test
    public void testLessThan10Logic() {

        boolean b = logicPuzzles.logicValue(2, 1, 4);

        assertThat(b, equalTo(true));
    }

    @Test
    public void testMoreThan10() {

        boolean b = logicPuzzles.logicValue(5, 4, 3);

        assertThat(b, equalTo(false));
    }

    @Test
    public void testNumbersAreEqual() {

        boolean b = logicPuzzles.numbersAreEqual(3, 3);
        assertThat(b, equalTo(true));
    }

    @Test
    public void testNumbersAreNotEqual() {

        boolean logic = logicPuzzles.numbersAreEqual(10, 5);
        assertThat(logic, equalTo(false));
    }

    @Test
    public void testLengthOfString() {

        int word = logicPuzzles.getStringLength("Hello");
        assertThat(word, equalTo(5));
    }

    @Test
    public void testLongestString() {

        String longestString = logicPuzzles.longestStringLength("Hello", "Hello World");
        assertThat(longestString, equalTo("Hello World"));
    }

    @Test
    public void testSameStringSize() {

        String sameSizeString = logicPuzzles.longestStringLength("Hello!", "Ashley");
        assertThat(sameSizeString, equalTo("Hello!" + "Ashley"));
    }
}
