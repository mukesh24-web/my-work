package Stack;

import java.util.Stack;

// LIFO
// implement using Arrays / Linked Lists
// All operation run in O(1)

public class Main {
    public static String reverseString(String str) {
        if(str==null){
            throw new IllegalArgumentException("Null");
        }
        Stack<Character> s = new Stack<>();
        for(char ch:str.toCharArray()){
            s.push(ch);
        }
        // System.out.println(s.peek());
        // System.out.println(s.pop());

        // String reversed = "";
        StringBuffer reversed = new StringBuffer(); // high amount modification to the string you need to use StringBuffer
        while(!s.empty()) {
            reversed.append(s.pop()); // last in first out
        }
        return reversed.toString();
    }

    public static boolean BalancedExpression(String str){
        Stack<Character> s = new Stack<>();
        boolean b = true;
        if(str== null)
            throw new IllegalArgumentException("Null");
        if(str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == '>' || str.charAt(0) == ']') {
            b = false;
            return b;
        }
        for(int i = 0;i<str.length();i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '<') {
                s.push(str.charAt(i));
            } else if ((str.charAt(i) == '}' && s.peek() == '{')
                    || (str.charAt(i) == ']' && s.peek() == '[')
                    || (str.charAt(i) == ')' && s.peek() == '(')
                    || (str.charAt(i) == '>' && s.peek() == '<')) {
                char ant = s.pop();
                if ((ant == '{' &&  str.charAt(i) == '}') || (ant == '[' &&  str.charAt(i) == ']') || (ant == '(' &&  str.charAt(i) == ')') || (ant == '<' &&  str.charAt(i) == '>')) {
                    b = true;
                }
            }
        }

        // System.out.println(s);

        if(!(s.empty())){
            b=false;
        }

        return b;

    }

    static void main(String[] args){
//        String str = "Hello";
//        reverseString(str);
        String a = "(){}}";
        boolean b = BalancedExpression(a);
        System.out.println(b);

        /*
        Stack01 st = new Stack01();
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.min());
        System.out.println(st.peek());
        System.out.println(st);
        */

    }
}
