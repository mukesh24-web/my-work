package Sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    // Map: k -> v
    // sets: k (only keys)
    // unique
    // Interface

    // continuous
    public static char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for(var ch : str.toCharArray()){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }

    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        for (var number : numbers)
            set.add(number);
        System.out.println(set);
        System.out.println(set.remove(6));
        System.out.println(set.contains(1));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

        var ch = findFirstRepeatedChar("green Apple");
        System.out.println(ch);

    }
}
