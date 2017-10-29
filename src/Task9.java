import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Created by Mikhail on 06.10.2017.
 * Переопределить hasNext next (итератора)
 */
public class Task9 {
    public static <T> Stream<T> zip (Stream<T> first, Stream<T> second){
        Iterator<T> a = first.iterator();
        Iterator<T> b = second.iterator();
        ArrayList<T> res = new ArrayList<T>();
        while(a.hasNext() && b.hasNext()){
            res.add(a.next());
            res.add(b.next());
        }
        return res.stream();
    }
}
