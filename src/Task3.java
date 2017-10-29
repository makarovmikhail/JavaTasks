import java.util.Arrays;
import java.util.List;

/**
 * Created by Mikhail on 04.10.2017.
 * Переделать под коллекции
 */
public class Task3 {
    static  int HexToDecimal(String s){
        String[] digits = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        List<String> digit = Arrays.asList(digits);
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digit.indexOf(String.valueOf(c));
            val = val*16 + d;
        }
        return val;
    }
}
