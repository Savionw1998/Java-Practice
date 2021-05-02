import java.util.Set;
import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Crazy 8", "nerigngionerognoerngierngoegn");
        userMap.put("Sammy T", "65565165651956168465616465195");
        userMap.put("Big Willy", "***************************");
        userMap.put("Pi", "3.14159265355323");
        String x = userMap.get("Pi");
        System.out.println(x);
    }
}