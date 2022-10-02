package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fib1 {
    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0,0,1,1));
    public static void main(String[] args) {
        fib1(10);
        printMap();
    }

    private static void printMap(){
        for(Map.Entry<Integer, Integer> entry : memo.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }
    }

    private static int fib1(int n) {
        if (!memo.containsKey(n)) {
            memo.put(n, fib1(n - 1) + fib1(n - 2));
        }
        return memo.get(n);
    }
}
