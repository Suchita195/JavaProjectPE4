package com.stackroute.javape4;

import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceTheCharacterTest {
    ReplaceTheCharacter check;
    @Before
    public void setUp(){
        check=new ReplaceTheCharacter();
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
        String result=check.replaceTheCharacter("Laughter is the best medicine");

        //assert
        assertEquals("Laughter is the best meficine",result);
    }

    @Test
    public void givenInput2ShouldSucessMessage(){
        //arrange

        //act
        String result=check.replaceTheCharacter("daily dry");

        //assert
        assertEquals("faity fry",result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange

        //act
        String result=check.replaceTheCharacter("This is my fourth exercise");

        //assert
        assertEquals("This is my fourth exercise",result);
    }

    @Test
    public void givenInput4ShouldReturnSuccessMessage(){
        //arrange

        //act
        String result=check.replaceTheCharacter(null);

        //assert
        assertEquals("This is invalid",result);
    }


}