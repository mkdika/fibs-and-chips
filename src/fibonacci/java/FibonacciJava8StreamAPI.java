import java.math.BigInteger;
import java.util.stream.Stream;

/**
 *
 * @author Maikel Chandika (mkdika@gmail.com)
 *
 * to calculate Fibonacci n position with Java 8 Stream API.
 * Support large number of n calculation (Using BigInteger).
 *
 * Usage:
 * - compile: javac FibonacciJava8StreamAPI.java
 * - run: java FibonacciJava8StreamAPI 1000
 *
 */
public class FibonacciJava8StreamAPI {

    public static void main(String[] args) {
        System.out.println(calFibs(Integer.valueOf(args[0])));
    }

    static java.math.BigInteger calFibs(int n) {
        return Stream.iterate(new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
            s -> new BigInteger[]{s[1], s[0].add(s[1])})
                .limit(n)
                .reduce((x, y) -> y).orElse(null)[1];
    }
}
