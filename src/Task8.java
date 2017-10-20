import java.util.stream.Stream;

/**
 * Created by Mikhail on 06.10.2017.
 */
public class Task8 {
    public static Stream<Long> generator(long a, long c, long m, long seed){
        Stream<Long> streamFromIterate = Stream.iterate(seed, n -> ( n * a + c) % m);
        return streamFromIterate;
    }
}
