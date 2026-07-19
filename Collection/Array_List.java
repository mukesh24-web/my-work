package Collection;

import java.io.*;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= 5; i++)
            al.add(i); // add

        System.out.println(al); // print in list

        al.remove(3); // remove

    }
}
