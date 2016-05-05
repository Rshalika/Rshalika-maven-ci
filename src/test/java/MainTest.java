import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MainTest {

    @Test
    public void testPrintHelloWorld() throws Exception {
        Main main = new Main();
        assertTrue(main.printHelloWorld().equals("Hello World"));
    }


}