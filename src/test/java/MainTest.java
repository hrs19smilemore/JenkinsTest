import app.Application;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainTest {
    @Test
    public void testPrintHelloWorld(){
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        Application.printHelloWorld(printStream);
        String outString = outputStream.toString();
        Assert.assertEquals("Hello world!", outString);
    }

}
