import com.sample.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void mainTest(){
        Main main = new Main();
        main.main().equals("Hello World!");
    }
}
