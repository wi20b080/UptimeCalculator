package at.naghed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.ws.rs.GET;

public class UptimeControllerTest {

    @Test
    public void  test_calculateUptime_shouldBeCalculatedCorrectly(){

        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String actualValue = controller.calculateUptime(99.95);

        //Assert
        Assertions.assertEquals(String.format("%.2f", 43178.40), actualValue);
    }

}