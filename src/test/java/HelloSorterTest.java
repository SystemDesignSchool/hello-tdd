import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HelloSorterTest {
    private final Sorter sorter = new Sorter();

    @Test
    void shouldSayHelloWorld() {
        int[] input = new int[]{5, 3, 2 ,1, 4};
        int[] expected = new int[]{1, 2 ,3, 4, 5};
        assertArrayEquals(sorter.sort(input), expected);
    }
}
