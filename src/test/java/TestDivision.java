import lesson2.Division;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestDivision {
    @Test
    public static void testFloat() {
        int result = Division.Divising(15, 7);
        assertEquals(3, result);
    } @Test
    public static void testCorrect() {
        int result = Division.Divising(20, 5);
        assertEquals(4, result);
    } @Test
    public void testZero() {
        int result = Division.Divising(13,0);
        assertEquals(1, result);
    }

}
