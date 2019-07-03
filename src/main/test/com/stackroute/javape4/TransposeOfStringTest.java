package com.stackroute.javape4;

import org.junit.*;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    TransposeOfString check;
    @Before
    public void setUp(){
        check=new TransposeOfString();
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
        String result=check.transposeOfString("Laughter is the best medicine");

        //assert
        assertEquals("Input String :Laughter is the best medicine\n" +
                "Output String:rethguaL si eht tseb enicidem",result);
    }

    @Test
    public void givenInput2ShouldSucessMessage(){
        //arrange

        //act
        String result=check.transposeOfString("      ");

        //assert
        assertEquals("Input String :      \n" +
                "Output String:",result);
    }

    @Test
    public void givenInput3ShouldReturnSuccessMessage(){
        //arrange

        //act
        String result=check.transposeOfString("this is my fourth exercise");

        //assert
        assertEquals("Input String :this is my fourth exercise\n" +
                "Output String:siht si ym htruof esicrexe",result);
    }

    @Test
    public void givenInput4ShouldReturnErrorMessage(){
        //arrange

        //act
        String result=check.transposeOfString(null);

        //assert
        assertEquals("This is invalid",result);
    }

    @Test
    public void givenInput5ShouldReturnSuccessMessage(){
        //arrange

        //act
        String result=check.transposeOfString("");

        //assert
        assertEquals("Input String :\n" +
                "Output String:",result);
    }


}