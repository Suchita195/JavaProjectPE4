package com.stackroute.javape4;

import org.junit.*;

import static org.junit.Assert.*;

public class OccurenceOfCharacterWithoutLoopTest {

    OccurenceOfCharacterWithoutLoop check;
    @Before
    public void setUp(){
        check=new OccurenceOfCharacterWithoutLoop();
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
        int result=check.occurenceOfCharacterWithoutLoop("My name is suchita kanchhal",'a');

        //assert
        assertEquals(4,result);
    }

    @Test
    public void givenInput2ShouldSucessMessage(){
        //arrange

        //act
        int result=check.occurenceOfCharacterWithoutLoop("Java is a programming language",'z');

        //assert
        assertEquals(0,result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange

        //act
        int result=check.occurenceOfCharacterWithoutLoop("This is my fourth exercise in java",' ');

        //assert
        assertEquals(6,result);
    }


}