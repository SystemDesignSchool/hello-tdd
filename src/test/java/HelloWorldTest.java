import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    void shouldSayHelloWorld() {
        String actual = new HelloWorld().SayIt();
        String expected = "Hello World!";
        assertEquals(expected, actual);
    }
}
