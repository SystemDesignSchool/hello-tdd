import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {
    @Test
    void shouldSayHelloWorld() {
        int[] input = new int[]{5, 3, 2 ,11, 4};
        int key = 11;
        int actual = Search.search(input, key);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
