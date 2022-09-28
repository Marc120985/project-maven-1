import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void substrateTest(){
     //Given

     int imput = 10;

     //When

     int actual = Main.subtrate(imput);


     //Then
     assertEquals(5, actual);
 }

    @Test
    public void biggerThenTest(){
        //Given

        int imput = 120;

        //When

        boolean actual = Main.biggerThen(imput);


        //Then
        assertTrue(actual, "The value is lower then 100");

    }

    @Test
    public void biggerThenTest2(){
        //Given

        int imput = 80;

        //When

        boolean actual = Main.biggerThen(imput);


        //Then
        assertFalse(actual, "The value is bigger then 100");

    }

    @Test
    public void faku(){
        //Given
        int multi= 7;

        //When

        int actual = Main.facurechner(multi);

        //Then

        assertEquals(5040, actual);
    }

    @Test
    public void fakuWhlie(){
        //Given
        int multi= 7;

        //When

        int actual = Main.facurechnerWithWhile(multi);

        //Then

        assertEquals(5040, actual);
    }

}
