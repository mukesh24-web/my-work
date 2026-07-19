package Generics;

public class Main {
    public static class List {
        private int[] items = new int[10];
        private int count;

        public void add(int item) {
            items[count++] = item;
        }

        public int get(int index) {
            return items[index];
        }
    }

    public static class Users implements Comparable<Users> {
        private int points;

        public Users(int points) {
            this.points = points;
        }

        @Override
        public int compareTo(Users other) {
            return points-other.points;
        }

        @Override
        public String toString() {
            return "Points: " + points;
        }
        // To store list users we need string list
        // existing list only accept integer
        // so we again create a list which accept String
        // which lead to redundancy
    }

    // Solution - use with different datatype - primitive as well as reference
    // problem occur while retrieving the element
    public static class AcceptAllDataType {
        private Object[] items = new Object[10];
        private int count;

        public void add(Object item) {
            items[count++] = item;
        }

        public Object get(int index) {
            return items[index];
        }
    }

    // Constraint here I used
    // Number - like Wrapper of primitive datatype
    // Comparable - numbers can be comparable
    public static class GenericList<T /* extends Number & Comparable & Cloneable */> {
        private T[] items = (T[]) new Object[10];
        private int count;

        public void add(T item) {
            items[count++] = item;
        }

        public T get(int index) {
            return items[index];
        }
    }

    // Generic method
    public static <T extends Comparable<T>> T max(T First,T Secound) {
        return First.compareTo(Secound) < 0? Secound:First;
    }

    public static class multipleTypeParameter<K,V> {
        private K key;
        private V value;

        public multipleTypeParameter(K key,V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String args[]) {
        List list01 = new List();
        list01.add(10);

        AcceptAllDataType list02 = new AcceptAllDataType();
        // easy to store data
        list02.add(10); // Integer.valueOf(10) stored like this.
        list02.add("String");
        // hard to retrieve data
        int a1 = (int) list02.get(0); // we need to cast it with correct datatype

        GenericList<Integer> list03 = new GenericList<>();
        list03.add(1);
        int a2 = list03.get(0); // safe

        GenericList<Users> list04 = new GenericList<>();
        list04.add(new Users(10));
        Users user = list04.get(0); // safe

        // comparable is a generic interface
        Users user1 = new Users(10);
        Users user2 = new Users(20);
        String s = (user1.compareTo(user2) < 0) ? "Users 2 is larger" : "User 1 is larger";
        System.out.println(s);
        if (user1.compareTo(user2) == 0) {
            System.out.println("Equal");
        }


    }
}
