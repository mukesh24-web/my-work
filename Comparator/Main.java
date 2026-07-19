package Comparator;

import java.util.*;

class Student implements Comparable<Student> { // give power to class to sort
    int age;
    String name;

    public Student(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name +"]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age < that.age) { // current student with other student
            return 1;
        } else {
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Interface - anonymous class
        // Based on string length it will sort
        Comparator<String> com01 = new Comparator<String>() {
            public int compare(String i, String j) {
                if(i.length()<j.length()) {
                    return 1; // 1 for swap
                } else {
                    return -1;
                }
            }
        };

        // sort base on last element in a number
        Comparator<Integer> com02 = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if(i%10<j%10) {
                    return 1; // 1 for swap
                } else {
                    return -1;
                }
            }
        };

        Comparator<Student> com03 = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if(i.age<j.age) {
                    return 1; // 1 for swap
                } else {
                    return -1;
                }
            }
        };

        Comparator<Student> com04 = (i,j) -> {
                if(i.age<j.age) {
                    return 1; // 1 for swap
                } else {
                    return -1;
                }
        };

        Comparator<Student> com05 = (i,j) -> (i.age<j.age)? 1:-1;

        List<String> list01 = new ArrayList<>();
        list01.add("abc");
        list01.add("abcd");
        list01.add("abcef");
        list01.add("abcdda");
        list01.add("abcdfgc");
        Collections.sort(list01,com01);
        System.out.println(list01);

        List<Integer> list02 = new ArrayList<>();
        list02.add(46);
        list02.add(52);
        list02.add(78);
        list02.add(19);
        Collections.sort(list02,com02);
        System.out.println(list02);

        List<Student> list03 = new ArrayList<>();
        list03.add(new Student(21,"Mike"));
        list03.add(new Student(12,"Steve"));
        list03.add(new Student(18,"Thor"));
        list03.add(new Student(22,"Hulk"));
        // Collections.sort(list03,com03);
        Collections.sort(list03); // auto sort
        // System.out.println(list01);
        for(Student data:list03) System.out.println(data);
    }
}
