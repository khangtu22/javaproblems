package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fib2 {
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1,1));
    private static int fib(int n){
        if (!memo.containsKey(n)){
            memo.put(n, fib(n-1) + fib(n-2));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        fib(10);
        System.out.println(memo);
    }

}
