package at.naghed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3 {

    @Test
    public void test_outputInput() {

        //arrange
        UptimeController monitor = new UptimeController();

        //act
        String message = "-";

        //assert
        Assertions.assertEquals(monitor.createInput(message), message);


    }
}
