package LinkedList;

import java.util.NoSuchElementException;

public class SinglyLinkedList {

    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node first; // Head
    private Node last; // Tail

    SinglyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        // first check the 0 index
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1; // != mean true, == mean false.
    }

    public Node removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException("Null");
        if(first == last){
            first = last = null;
            return first;
        }
        var temp = first;
        first = first.next;
        temp.next = null;
        return temp;
    }

    public Node removeLast() {

        var temp = getPrevious(last);
        last = temp;
        temp = temp.next;
        last.next = null;
        return temp;
    }

    private Node Check(){
        if(isEmpty()) {
            throw new NoSuchElementException("Null");
        }
        if(first == last) {
            first = last = null;
        }
        return first;
    }

    private Node getPrevious(Node node) {
        var temp = first;
        while(temp.next != last) {
            temp = temp.next;
        }
        return temp;
    }

    /*
    public boolean contains(int item) {
        var current = first;
        while(current!=null){
            if(current.value == item) return true;
            current = current.next;
        }
        return false;
    }
    */

    private boolean isEmpty() {
        return first == null;
    }

    public void print() {
        var current = first;
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}

