package com.stackroute.javape4;

import org.junit.*;

import static org.junit.Assert.*;

public class MultipleOccurenceOfGivenWordTest {
    MultipleOccurenceOfGivenWord check;
    @Before
    public void setUp(){
        check=new MultipleOccurenceOfGivenWord();
    }
    @After
    public void tearDown()
    {
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){

    }
    @AfterClass
    public static void tearDownAfterClass()
    {

    }
    @Test
    public void givenInput1ShouldReturnSuccessMessage(){
        //arrange


        //act
        String result=check.multipleOccurenceOfGivenWord("My name is suchita kanchhal","ch");

        //assert
        assertEquals("Found At 13-14\n" +
                "Found At 22-23",result);
    }

    @Test
    public void givenInput2ShouldSucessMessage(){
        //arrange

        //act
        String result=check.multipleOccurenceOfGivenWord("She sells seashells by the seashore","se");

        //assert
        assertEquals("Found At 4-5\n" +
                "Found At 10-11\n" +
                "Found At 27-28",result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange

        //act
        String result=check.multipleOccurenceOfGivenWord("  ","a");

        //assert
        assertEquals("",result);
    }

    @Test
    public void givenInput4ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.multipleOccurenceOfGivenWord(null,"a");

        //assert
        assertEquals("This is invalid",result);
    }

}