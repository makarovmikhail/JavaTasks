import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created by Mikhail on 06.10.2017.
 * Переопределить hasNext next (итератора)
 */
public class Task9 {
    public static Stream<String> zip (Stream<String> first, Stream<String> second){
        Supplier<Stream<String>> sup = ()-> Stream.empty();
        Supplier<Stream<String>> fir = () -> first;
        Supplier<Stream<String>> sec = () -> second;
        int Min = (int) Math.min(first.count(),second.count());
        long i;
        for(i = 0; i < Min; i++){
            Supplier<Stream<String>> finalSup = sup;
            long finalI = i;
            sup = () -> Stream.concat(finalSup.get(),Stream.of(fir.get().skip(finalI).findFirst().get()));
            Supplier<Stream<String>> finalSup1 = sup;
            long finalI1 = i;
            sup = () -> Stream.concat(finalSup1.get(),Stream.of(sec.get().skip(finalI1).findFirst().get()));
        }
        return sup.get();
    }
}
