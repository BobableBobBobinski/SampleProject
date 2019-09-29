import lesson2.Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestArray {
    @Test
    public void TestCorrect() {
        int[] mas = {1, 2, 3};
        float result = Array.average(mas);
        assertEquals(0, Double.compare(2.0, result)); //doublecompare gives 0
    }
}
