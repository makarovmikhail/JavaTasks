import java.io.IOException;

/**
 * Created by Mikhail on 04.10.2017.
 */
public class Main {
    public static void main(String[] args) {

        /*
        //Task1
        System.out.println(Task1.gcd(-6,-6));
        System.out.println(Task1.gcd_floorMod(-6,-6));
        System.out.println(Task1.gcd_rem(-6,-6));
        All methods has same efficient with negative values
        */

        /*
        //Task2
        Arguments: ["Hello"]
        String s = args[0];
        System.out.println(Task2.rot13(s));
        System.out.println(Task2.rot13(Task2.rot13(s)));
        */

        /*
        //Task3
        System.out.println(Task3.HexToDecimal("A10F"));
        */

        /*
        //Task4
        Scanner sc = new Scanner("hello 2 3 4 5 6");
        System.out.println(Task4.ScannerToStreamWord(sc).findFirst().get());
        */

        /*
        Task5

        try {
            Task5.UnZip();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        try {
            Task5.searching();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
