import org.junit.jupiter.api.Test;
import lesson2.Authorization;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuthentication {
   @Test
   public void testIncorrect() {
       boolean result = Authorization.signIn("nghh", "21312");
       assertEquals(false, result);
   }
   @Test
    public void testCorrect() {
       boolean result = Authorization.signIn("pupil", "pupil");
       assertEquals(true, result);
   }
}
