/**
 * Created by Mikhail on 04.10.2017.
 * Euclid’s algorithm
 */
public class Task1 {
    static int gcd(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
    static int gcd_floorMod(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd_floorMod(b,Math.floorMod(a,b));
    }
    static int gcd_rem(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b,gcd_rem(b,Math.abs(a%b))); // I suppose that it's true:)
    }
}
