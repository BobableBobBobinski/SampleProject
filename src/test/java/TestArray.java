import lesson2.Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestArray {
    @Test
    public void TestIncorrect() {
        int[] mas = {1, 2, 3};
        float result = Array.average(mas);
        assertEquals(2, Double.compare(2.0, result));
    }
}
