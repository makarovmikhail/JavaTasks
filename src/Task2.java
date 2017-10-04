/**
 * Created by Mikhail on 04.10.2017.
 */
public class Task2 {

    static String rot13(String s) {
        String rot = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else if (c >= 'A' && c <= 'M') c += 13;
            else if (c >= 'n' && c <= 'z') c -= 13;
            else if (c >= 'N' && c <= 'Z') c -= 13;
            rot+=c;
        }
        return rot;
    }

}
