import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Mikhail on 05.10.2017.
 * Переделать без перехода в лист
 */
public class Task4 {
    public static Stream<Integer> scannerToStreamInt(Scanner scanner){
        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                while(scanner.hasNext() && !scanner.hasNextInt())
                    scanner.next();
                return scanner.hasNext();
            }

            @Override
            public Integer next() {
                while(scanner.hasNext() && !scanner.hasNextInt())
                    scanner.next();
                return scanner.nextInt();
            }
        };

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                iterator, Spliterator.ORDERED | Spliterator.NONNULL), false);
    }
    public static Stream<Double> scannerToStreamDouble(Scanner scanner){
        Iterator<Double> iterator = new Iterator<Double>() {
            @Override
            public boolean hasNext() {
                while(scanner.hasNext() && !scanner.hasNextDouble())
                    scanner.next();
                return scanner.hasNext();
            }

            @Override
            public Double next() {
                while(scanner.hasNext() && !scanner.hasNextDouble())
                    scanner.next();
                return scanner.nextDouble();
            }
        };

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                iterator, Spliterator.ORDERED | Spliterator.NONNULL), false);
    }
    public static Stream<String> scannerToStreamString(Scanner scanner){
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                scanner, Spliterator.ORDERED | Spliterator.NONNULL), false);
    }
    public static Stream<String> scannerToStreamLines(Scanner scanner){
        Iterator<String> iterator = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return scanner.hasNextLine();
            }

            @Override
            public String next() {
                return scanner.nextLine();
            }
        };

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                iterator, Spliterator.ORDERED | Spliterator.NONNULL), false);
    }

}
