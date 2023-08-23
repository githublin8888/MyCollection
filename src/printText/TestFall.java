package printText;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestFall {

    //1. 4 tests to test no input; expected 0 row/character/word, the longest word result should be empty
    @Test
    public void testRow() {
        TextCounting test = new TextCounting();
        test.calculateNr("stop");
        int expected = 0;
        int actual = test.getNbrOfRows();
        assertEquals(expected, actual);
    }
    @Test
    public void testCharacter() {
        TextCounting test = new TextCounting();
        test.calculateNr("stop");
        int expected = 0;
        int actual = test.getNbrOfcharacters();
        assertEquals(expected, actual);

    }
    @Test
    public void testWord() {
        TextCounting test = new TextCounting();
        test.calculateNr("stop");
        int expected = 0;
        int actual = test.getNbrOfWords();
        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWord() {
        TextCounting test = new TextCounting();
        test.calculateNr("stop");
        String expected = "";
        String actual = test.getLongestWord();
        assertEquals(expected, actual);

    }
    //2. to test number of rows (test1: a normal typing; test2: press the Space bar)

    @Test
    public void testRow1() {
        TextCounting test = new TextCounting();
        test.calculateNr("hi");
        int expected = 1;
        int actual = test.getNbrOfRows();
        assertEquals(expected, actual);

    }
    @Test
    public void testRow2() {
        TextCounting test = new TextCounting();
        test.calculateNr("");
        int expected = 1;
        int actual = test.getNbrOfRows();
        assertEquals(expected, actual);
    }

    /* 3. to test number of characters
    test1: a normal typing;
    test2: press the Space bar;
    test3: type in a special character*/
    @Test
    public void testCharacter1() {
        TextCounting test = new TextCounting();
        test.calculateNr("how are you");
        test.calculateNr("how are you");
        int expected = 18;
        int actual = test.getNbrOfcharacters();
        assertEquals(expected, actual);

    }
    @Test
    public void testCharacter2() {
        TextCounting test = new TextCounting();
        test.calculateNr("");
        int expected = 0;
        int actual = test.getNbrOfcharacters();
        assertEquals(expected, actual);

    }
    @Test
    public void testCharacter3() {
        TextCounting test = new TextCounting();
        test.calculateNr("?");
        int expected = 1;
        int actual = test.getNbrOfcharacters();
        assertEquals(expected, actual);

    }
    // 4. to test number of words (test 1.press the Space bar;test 2. a normal typing)
    @Test
    public void testWord1() {
        TextCounting test = new TextCounting();
        test.calculateNr("");
        int expected = 0;
        int actual = test.getNbrOfWords();
        assertEquals(expected, actual);

    }
    @Test
    public void testWord2() {
        TextCounting test = new TextCounting();
        test.calculateNr("hi");
        test.calculateNr("hi");

        int expected = 2;
        int actual = test.getNbrOfWords();
        assertEquals(expected, actual);
    }

    /* 5. to test number of the longest words
     test 1. a normal typing;
     test 2. text contains more than one word that is longest
     test 3. press the Space bar*/
    @Test
    public void testLongestWord1() {
        TextCounting test = new TextCounting();
        test.calculateNr("hello");
        test.calculateNr("hi");
        test.calculateNr("How do you do");
        String expected = "hello";
        String actual = test.getLongestWord();
        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWord2() {
        TextCounting test = new TextCounting();
        test.calculateNr("how are you");
        test.calculateNr("hi");
        String expected = "you, how, are";
        String actual = test.getLongestWord();
        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWord3() {
        TextCounting test = new TextCounting();
        test.calculateNr("");
        String expected = "";
        String actual = test.getLongestWord();
        assertEquals(expected, actual);

    }

}