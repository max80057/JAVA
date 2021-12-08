import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest {

    private static Optional<String> getNickName(String name) {
        Map<String, String> nickNames = new HashMap<>(); // 假裝的鍵值資料庫
        nickNames.put("Justin", "caterpillar");
        nickNames.put("Monica", "momor");
        nickNames.put("Irene", "hamimi");

        String nickName = nickNames.get(name);

        return Optional.ofNullable(nickName);
    }

    public static void main(String[] args) {
        Optional<String> nickNameOptionalTest = getNickName("Duke");
        System.out.println(nickNameOptionalTest.orElse("Openhome Reader"));

        nickNameOptionalTest = getNickName("Justin");
        System.out.println(nickNameOptionalTest.orElse("Openhome Reader"));

    }
}
