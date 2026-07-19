package HashTable;

import java.util.LinkedList;

public class HashMap {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    
    // You created an ARRAY of size 5, where each element can store a LinkedList<Entry>
    private LinkedList<Entry>[] entries = new LinkedList[5]; // 0-4

//    public void h(){
//        System.out.println(entries[1]);
//    }

    // Inside the array, at a particular index,
    // we are traversing through a LinkedList stored at that index.
    public void put(int key, String value){
        var index = hash(key); // get hash value

        if(entries[index] == null) // if the slot is empty mean create a linkedlist
             entries[index] = new LinkedList<>();

        LinkedList<Entry> bucket = entries[index];
        for(var entry : bucket) { // if key already exist mean overwrite the value
             if (entry.key == key) {
                 entry.value = value;
                 return;
             }
         }
        // new key mean add the entry at last of linked list
        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        var index = hash(key); // get hash value
        var bucket = entries[index];
        if(bucket != null) {
            for (var entry : bucket) {
                if(entry.key == key) // If key is present then return value
                    return entry.value;
            }
        }
        return null;
    }



    public void remove(int key) {
        var index = hash(key);
        var bucket = entries[index];

        if(bucket == null)
            throw new IllegalStateException("Null");
        for(var entry:bucket) { // index 0 traversing linked list using for each loop
            if(entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException("Not found");
    }

    // find index within boundary
    private int hash(int key) {
        return key % entries.length;
    }
    static void main(String[] args) {
        HashMap table = new HashMap();
        System.out.println(table.hash(1235332531));
        // table.h();
        table.put(10,"A");
        table.put(11,"B");
        table.put(12,"C");
        System.out.println(table.get(11));
    }
}
