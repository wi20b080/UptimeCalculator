package at.naghed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test4 {

    @Test
    public void test_getStatus(){
        //arrange
        UptimeController monitor = new UptimeController();
        String message = "-";
        monitor.status(monitor.getStatus());
        //act
        String testvar = monitor.getStatus().getEntity().toString();
        //assert
        Assertions.assertEquals(message, testvar);
    }
}
