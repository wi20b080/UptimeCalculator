package at.naghed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;


public class Test2 {

    @Test
    public void test_getIndex() throws IOException {

        //arrange
        UptimeController monitor = new UptimeController();

        //act
        java.nio.file.Path path =  java.nio.file.Paths.get("C:\\Users\\Sam\\Documents\\Maintenance_Monitor\\front\\index.html");
        String newpath = java.nio.file.Files.readString(path);

        //assert
        Assertions.assertEquals(monitor.getIndex(), newpath);

    }




}
