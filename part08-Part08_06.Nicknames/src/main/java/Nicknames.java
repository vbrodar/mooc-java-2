
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("1", "matt");
        nicknames.put("2", "mix");
        nicknames.put("3", "artie");

        System.out.println(nicknames.get("1"));
    }

}
