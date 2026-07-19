package DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        // System.out.println(dynamicArray.capacity);
        // System.out.println(dynamicArray.array); // print the reference

        // System.out.println(dynamicArray); // initially empty string


        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);
        dynamicArray.add(50);
        dynamicArray.add(50);

        dynamicArray.delete(50);
        dynamicArray.delete(50);
        dynamicArray.delete(50);
        // dynamicArray.delete(40);


        /*
        dynamicArray.insert(0,"hi");
        dynamicArray.delete("hi");
        int index = dynamicArray.search(10);
        System.out.println(index);
        */

        System.out.println(dynamicArray);

        System.out.println("Size: " + dynamicArray.size); // user-defined variable
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty()); // user-defined method
    }
}
