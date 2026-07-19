package DynamicArray;

public class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity]; // default capacity
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if(size == capacity) { // example: 10 == 10
            grow();
        }
        array[size++] = data;
    }

    public void insert(int index,Object data) {
        if(size == capacity) { // example: 10 == 10
            grow();
        }
        for(int i=size;i>index;i--) { // size = 3 (3 index not been filled)
            array[i] = array[i-1]; // move to right
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for(int i=0; i<size; i++) {
            if(array[i] == data) {
                for(int j = 0;j<(size - i - 1);j++) { // (size - i - 1) to choose the number element to be shifted
                    array[i + j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int) (capacity/3)) {
                    shrink();
                }
                break; // break from main for loop
            }
        }
    }

    public int search(Object data) {
        for(int i=0;i<size;i++) {
            if(array[i] == data)
                return i;
        }
        return -1;
    }

    public void grow() {
        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i<size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public void shrink() {
        int newCapacity = (int) (capacity/2);
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i<size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // If we print this class this toString method will be printed
    @Override
    public String toString() {

        String string = "";

        // each character will be inserted into the string
        for(int i=0; i<capacity; i++) { // change to capacity to print all the element in array
            string += array[i] + ", ";
        }

        return (!string.isEmpty())? "[" + string.substring(0,string.length()-2)+"]":"[]";
    }
}
