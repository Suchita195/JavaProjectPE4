package com.stackroute.javape4;

import org.junit.*;

import static org.junit.Assert.*;

public class PresenceOfNameInStringTest {
    PresenceOfNameInString check;
    @Before
    public void setUp(){
        check=new PresenceOfNameInString();
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
        boolean result=check.presenceOfNameInString("My name is Harry");

        //assert
        assertEquals(true,result);
    }

    @Test
    public void givenInput2ShouldReturnSucessMessage(){
        //arrange

        //act
        boolean result=check.presenceOfNameInString("My name is Henry");

        //assert
        assertEquals(false,result);
    }

    @Test
    public void givenInput3ShouldReturnErrorMessage(){
        //arrange

        //act
        boolean result=check.presenceOfNameInString(null);

        //assert
        assertEquals(false,result);
    }


}