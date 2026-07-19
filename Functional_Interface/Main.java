package Functional_Interface;

@FunctionalInterface // which only have one method
interface A {
    // void show(int i);
    // void run(); // doesn't allow another method
    int add(int a,int b);
}

/*
class B implements A {
    @Override
    public void show() {
        System.out.println("Showing the data01");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        // A obj = new B();
        // lambda expression only work with functional interface
        // A obj = (i) -> System.out.println("Showing the " + i);
        // obj.show(5);

        A obj = (i,j) -> i+j;
        System.out.println(obj.add(5,5));
    }
}