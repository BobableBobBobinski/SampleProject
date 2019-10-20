import lesson4.littleApp.FileHelper;
import lesson4.littleApp.User;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;

public class TestWriter {
    @Test
    public void testWrite(){
        Map<String, User> map = new HashMap<>();
        map.put("Ami", new User("AmeSora", "Rain", "AmikoOdzaki"));
        FileHelper.saveTo("C:\\Users\\pupil\\Desktop\\MPolina\\src\\main\\resources\\file.txt", map);
    }
    public void testRead(){
        Map<String, User> map =
        FileHelper.readFrom("src\\main\\resources\\users");
    }
}
