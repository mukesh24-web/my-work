package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Stack01 {
    private int count = 0;
    private int[] arr = new int[10];
    int length = arr.length;

    public boolean isFull() {
        return count == arr.length;
    }

    public int min() {
        int mini = arr[0];
        for(int i=1; i<count; i++) {
            if(arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    public void push(int item){
        if(count == length)
            throw new StackOverflowError();
        arr[count++] = item;
    }

    public int pop() {
        if(count == 0)
            throw new IllegalStateException();
        return arr[--count];
    }

    public int peek() {
        if(count == 0){
            throw new IllegalStateException();
        }
        return arr[count-1];
    }

    public boolean isEmpty(){
        return count==0;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(arr,0,count);
        return Arrays.toString(content);
    }
//    public int[] resize() {
//        int[] newArr = new int[0];
//        if(count == arr.length){
//            newArr = new int[length*2];
//            for(int val=0; val<length; val++){
//                newArr[val] = arr[val];
//            }
//        }
//
//        return newArr;
//    }

    public static void main(String args[]) {

        // redo/undo
        // forward/backward
        // backtracking
        // call function (call stack)

        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft")); // O(n)
        System.out.println(stack);
    }
}
