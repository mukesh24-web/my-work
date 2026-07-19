package HashTable;

import java.util.ArrayList;

public class HashTable {
    private final int bucket;
    private final ArrayList<Integer>[] table;

    public HashTable(int bucket) {
        this.bucket = bucket;
        this.table = new ArrayList[bucket];
        for(int i = 0; i<bucket; i++) // 0-7
            table[i] = new ArrayList<>();
    }

    public int hashFunction(int key){
        return (key % bucket);
    }

    public void insertItem(int key) {
        int index = hashFunction(key); // get the hash index of key
        table[index].add(key);
    }

    public void deleteItem(int key) {
        int index = hashFunction(key); // get the hash index of key
        if(!table[index].contains(key))
            return;
        table[index].remove(Integer.valueOf(key));
    }

    public void displayHashTable() {
        for(int i = 0; i<bucket; i++){
            System.out.print(i);
            for(int ch : table[i]){
                System.out.print(" --> " + ch);
            }
            System.out.println();
        }
    }
    static void main(String args[]) {
        HashTable ht = new HashTable(5);

        int[] a = {1,2,3,4,5,5,11};

        for(int x:a)
            ht.insertItem(x);

        ht.deleteItem(3);

        ht.displayHashTable();

    }
}
