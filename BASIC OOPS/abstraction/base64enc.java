import java.util.Arrays;
import java.util.Base64;

public class base64enc {
    public static void main(String[] args) {
        String s = "Adnan is a good boy";
        String encodeans = Base64.getEncoder().withoutPadding().encodeToString(s.getBytes());
        byte[] decodeans = Base64.getDecoder().decode(encodeans);
        System.out.println(Arrays.toString(s.getBytes()));
        String dec = new String(decodeans);
        System.out.println(encodeans);
        System.out.println(dec);
    }

}