package com.stackroute.javape4;

import org.junit.*;

import static org.junit.Assert.*;

public class SortingOfWordsInParagraphTest {
    SortingOfWordsInParagraph check;

    @Before
    public void setUp() {
        check = new SortingOfWordsInParagraph();
    }

    @After
    public void tearDown() {
        check = null;
    }

    @BeforeClass
    public static void setUpBeforeClass() {

    }

    @AfterClass
    public static void tearDownAfterClass() {

    }

    @Test
    public void givenInput1ShouldReturnSuccessMessage() {
        //arrange


        //act
        String result = check.sortingOfWordsInParagraph("Laughter is the best medicine");

        //assert
        assertEquals("best is Laughter medicine the", result);
    }

    @Test
    public void givenInput2ShouldSucessMessage() {
        //arrange

        //act
        String result = check.sortingOfWordsInParagraph("my name is suchita kanchhal");

        //assert
        assertNotEquals("suchita", result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result = check.sortingOfWordsInParagraph("");

        //assert
        assertEquals("", result);
    }

    @Test
    public void givenInput4ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result = check.sortingOfWordsInParagraph("    ");

        //assert
        assertEquals("", result);
    }

    @Test
    public void givenInput5ShouldReturnSuccessMessage() {
        //arrange

        //act
        String result = check.sortingOfWordsInParagraph("Hello @# bye 45");

        //assert
        assertEquals("45 @# bye Hello", result);
    }

    @Test
    public void givenInput6ShouldSucessMessage() {
        //arrange

        //act
        String result = check.sortingOfWordsInParagraph("hi Hi");

        //assert
        assertEquals("Hi hi", result);
    }

}