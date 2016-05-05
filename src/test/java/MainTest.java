import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MainTest {

    @Test
    public void testPrintHelloWorld() throws Exception {
        Main main = new Main();
        assertTrue(main.printHelloWorld().equals("Hello World"));
    }

    @Test
    public void testMock(){
        Main underTest = new Main();
        Dummy dummy = Mockito.mock(Dummy.class);

        String helloWorld = underTest.printHelloWorld();
        Mockito.when(dummy.dummy()).thenReturn("b");
        assertEquals((helloWorld + dummy.dummy()), ("Hello Worldb"));

    }


}