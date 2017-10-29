/**
 * Created by Mikhail on 04.10.2017.
 * переделать
 * Euclid’s algorithm
 */
public class Task1 {
    static int gcd(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }
    static int gcd_rem(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd_rem(b,a>b?a-b:b-a);
    }

    static int gcd_floorMod(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b,gcd_floorMod(b,Math.floorMod(a,b))); // I suppose that it's true:)
    }
}
