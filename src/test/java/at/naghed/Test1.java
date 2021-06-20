package at.naghed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    public void test_createInput(){


        //arrange
        UptimeController monitor = new UptimeController();

        //act
        String message = "-";

        //assert
        Assertions.assertEquals(monitor.createInput(message), message);


    }

}