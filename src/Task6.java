import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Mikhail on 21.10.2017.
 */
public class Task6 {
    public static long countParticularChar(char a) throws IOException {
        return Files.lines(Paths.get("Task5_results")).mapToLong(s ->{
            return s.chars()
                    .filter(c->{
                        return c == a;
                    }).count();
        }).sum();
    }
}
