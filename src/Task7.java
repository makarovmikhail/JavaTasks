import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mikhail on 06.10.2017.
 */
public class Task7 {
    static void startPrinting(int numberOfLines) throws IOException {
        List<String> list = Files.lines(Paths.get("Task5_results")).collect(Collectors.toList());
        double avg = list.stream().mapToLong(l->l.length()).average().getAsDouble();
        long n = Files.size(Paths.get("Task5_results"));
        System.out.println((int)Math.floor(n/avg));
        for(int i = 0; i < numberOfLines; i++){
            System.out.println(list.get((int)(Math.random()*n/avg)));
        }
    }
}
