package HashTable;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // items will not store in sequentially manner in memory because of hash function
    public static char nonRepeatedCharacter(String str) {
        Map<Character,Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        for(var ch : chars){
            var count = map.getOrDefault(ch, 0); // map.containKey(ch)? map.get(ch) : 0
            map.put(ch,count+1);
        }

        for(var ch : chars){
            if(map.get(ch) == 1) // value == 1
                return ch;
        }
        return Character.MIN_VALUE;
    }

    public static int hash(int key){
        return key % 100;
    }

    public static int hash(String key) {
        int hash = 0;
        for(int ch : key.toCharArray())
            hash += ch; // ch will convert to number because of += augmented character
        return hash % 100;
    }

    static void main(String args[]){
        // Store key-value pair
        // key(like employee id) will be given to hash function
        // hash-function help to fetch the value(like employee object) of the key from the memory location
        // used in spell checkers(quick look up word)
        // Dictionary, Compiler - lookup address, code editor - lookup items
        // insert,lookup,delete - O(1)

        // Interface                  class with implementation
        Map<Integer,String> map = new HashMap<>();

        // insert value
        // value will be store in array
        map.put(1,"Mukesh"); // In index the value will be store
        map.put(2,"Matt");
        map.put(3,"Tom");
        map.put(4,"Ichigo");


        // Hashmap will not accept duplicate
        map.put(4,"Kurisaki"); // overwritten on existing value

        // null will be accepted as a value in hashmap
        map.put(5, null);

        // null has been accepted as key and value
        map.put(null, null);

        // remove key-value using key
        map.remove(null);

        // remove key-value using key-value
        map.remove(5,null);

        System.out.println(map);

        for(var item:map.entrySet()){ // to print key-value set
            System.out.println(item);
        }
        for(var item:map.keySet()){ // to print key set
            System.out.println(item);
        }

        // O(1)
        var a = map.containsKey(1); // return boolean
        System.out.println(a);

        // O(n) - because it need to iterate over all value (hash function)
        // It will rely/depend on hash function
        var b = map.containsValue("Mukesh"); // return boolean
        System.out.println(b);

        // Length
        System.out.println("Length: " + map.size());

        System.out.println(map.get(1)); // get the value based on given key

        var ch = nonRepeatedCharacter("A green Apple");
        System.out.println(ch);

        // If a array have 100 capacity
        // based on that we need to store key-value pair
        map.put(123456, "Selva"); // store large key
        System.out.println(hash(123456));

        System.out.println(hash("String"));

        // Iterating hashmap

        for (Map.Entry<Integer,String> item: map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

        for (Integer item: map.keySet()) {
            System.out.print(item + " ");
            System.out.println(map.get(item)); // get the value of the key
        }

        for (String item: map.values()) {
            System.out.print(item + " ");
            System.out.println(map.get(item)); // get the value of the key
        }

        // pass - hash function - long hash value
        // in dsa data - hash function - index value
        // every object has hashcode
        // has map class use some extra work and map to the index value

        // collisions
        // two key have same index
        // separate chaining - linked list inorder to store in same array index
        // we can't store directly in the cell of array
        // we store it linked  list

        // open addressing
        // i =1,2,3,4,5,6..
        // linear probing = hash(key) + i
        // start hash value and increment 1 by each step
        // inorder to find empty slot to fill the key - value pair
        // probing - search for other empty slot
        // if there is no slot left that will not been store
        // consecutive items are called cluster
        // time consuming

        // Quadractic probing = hash(key) + i^2
        // within boundry = (hash(key) + i^2) % table_size
        // big jump - lead to infinite loop searching for empty space

        // double hashing
        // hash2(key) = prime - (key % prime)
        // (hash1(key) + i * hash2(key)) % table_size

        // hash1(key) = key % table_size
        // hash1(123456) = 123456 % table_size

        // hash2(key) = prime - (key % prime)
        // if table size is 5
        // there will be 0-4 index
        // then 3 will be first prime number from upside down
        // hash2(key) = 3 - (key % 3)

        // index = (hash1 + i*hash2) % size

    }
}
