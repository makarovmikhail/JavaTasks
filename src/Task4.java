import java.util.ArrayList;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Mikhail on 05.10.2017.
 */
public class Task4 {
    static Stream<String> ScannerToStreamWord(Scanner scanner) {
        Spliterator<String> splt = Spliterators.spliterator(scanner, Long.MAX_VALUE, Spliterator.ORDERED | Spliterator.NONNULL);
        return StreamSupport.stream(splt, false).onClose(scanner::close);
    }
    static Stream<String> ScannerToStreamString(Scanner scanner) {
        ArrayList<String> a = new ArrayList();
        while(scanner.hasNextLine()){
            a.add(scanner.nextLine());
        }
        return a.stream();
    }
    static Stream<Integer> ScannerToStreamInteger(Scanner scanner) {
        ArrayList<Integer> a = new ArrayList();
        while(scanner.hasNextInt()){
            a.add(scanner.nextInt());
        }
        return a.stream();
    }
    static Stream<Double> ScannerToStreamDouble(Scanner scanner) {
        ArrayList<Double> a = new ArrayList();
        while(scanner.hasNextDouble()){
            a.add(scanner.nextDouble());
        }
        return a.stream();
    }
}
