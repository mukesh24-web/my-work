package com.Google;

import java.util.Objects;

public class OOP {
    static void main(String args[]){
        // Programming paradigms
        // Procedural, Event - driven, Functional, Object-oriented,
        // logic, aspect - oriented
        // SmallTalk use Single paradigm
        // python,ruby,java,javaScript uses multi Paradigm
        // OOP - Object are data unit contain data called (state) data
        // methods (behaviour) operation on data are called behaviour
        // these methods modify the data
        // Object - data,Behaviour (together)
        // Functional - data,Behaviour (separate)
        // based on problem choose programming paradigms

        // OOP
        // reduce complexity
        // easier maintenance
        // code reuse
        // faster development

        // principle of OOP:
        // Encapsulation
        // Abstraction

        // Class - A blueprint for creating objects
        // Object - An instance of a class
        // we can create different objects, and they are independent
        // object have fields (State) and Methods (behaviour)
        // TextBox textBox = new TextBox(); // new instance
        /*
        var textBox1 = new TextBox(); // java compiler determine the type of this variable
        // if String variable is not initialize then it output will be null
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        // object are independent
        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
        */

        // Memory allocation
        // heap - store object
        // stack - store primitives and short-lived variables & also the reference variable to heap location
        /*
        var textBox1 = new TextBox();
        // java runtime : first it will evaluate the right side of the variable
        // 1) create a new textBox object on heap
        // 2) the variable store in stack and address is store in it
        // variable refer the object on heap
        var textBox2 = textBox1;
        // two variable refer the same object (one object)
        // if I modify mean's the changes reflect on other object
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
        */

        // Procedural programming (Procedural Paradigm)
        // calling method and passing value to them.
        /*
        int baseSalary = 50_000;
        int extraHors = 10;
        int hourlyRate = 20;
        int wage = calculateWage(baseSalary,extraHors,hourlyRate);
        System.out.println(wage);
        */

        // Encapsulation - Bundle The data and methods (that operate on the data) in to a single unit
        /*

        // If declaring a variable's inside main method it will be local
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        employee.getHourlyRate();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        */

        // Abstraction - reduce complexity by hiding unnecessary details
        // coupling - The level of dependency between classes
        // one class change mean that affect the other class
        // reduce coupling
        /*
        var browser = new Browser();
        browser.navigate("hello");
        */

        // constructor
        /*
        var employee = new Employee(50_000,20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        */

        // instance members - belongs to objects
        // static members - belongs to class / independent of object
        // System.out.println(Employee.numberOfEmployees);

        // Inheritance
        /*
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());

        var q = new Object();
        var box1 = new TextBox();
        var box2 = box1; // pointing to same object
        // object address goes to hash function and get hash value
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        System.out.println(box1.equals(box2)); // true - because both the variables refer to same object
        // compare with hash value
        // compare with content value
        System.out.println(box1.toString()); // return the string representation of object : package@hashcode
        */

        // var text = new TextBox();
        // parent will run first

        // Access modifier
        // new UIControl(true).isEnabled();
        // private field can't be access outside the class
        // private field can't be inherited
        // for protected field, we can able to access within the package
        // outside the package it will be private
        // if we extend child (present in different package) with another class
        // still we can able to access the protected field
        // default: private outside the project
        // public inside the project

        // Overriding method
        /*
        var textBox = new TextBox();
        textBox.setText("Hello Lisa");
        // System.out.println(textBox.toString());
        // default toString method return address & hashValue in hexadecimal
        // NO need to call toString method
        // print method call it automatically
        System.out.println(textBox);
        */

        // Upcasting - casting an object to one of its super types
        // Downcasting - casting an object to one of its sub types

        // var control = new UIControl(true);
        // var textBox = new TextBox();
        // show(textBox); // textbox is a control
        // this object automatically cast to parent
        // textbox is control
        // control is not textbox

        /*
        SuperClass a = new SubClass();  // upcasting
        SubClass b = (SubClass) a;      // downcasting ✔ works
        */
        /*
        SuperClass a = new SuperClass();  // object is NOT SubClass
        SubClass b = (SubClass) a;        // ❌ Runtime error
        */
        /*
        SuperClass a = new SubClass();
        a.superMethod();   // allowed
        a.subMethod();     // ❌ NOT allowed (compile-time error)
        */
        /*
        SubClass a = new SubClass();
        a.superMethod();  // allowed
        a.subMethod();    // allowed
        */
        /*
        // Comparing object
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);
        System.out.println(point1);
        System.out.println(point2);
        // System.out.println(point1 == point2); // both the point are reference type
        // System.out.println(point1.equals(point2)); // compare the object based on reference
        // System.out.println(Objects.equals(point1, point2));
        System.out.println(point1.equals(point2));

        // default hashcode - generate a hash code based on address
        // custom hashcode - generate a hash code based on value present inside object
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        */

        // Polymorphism
        //                      Object
        /*
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for(var control : controls) {
            control.render();
        }
        */

        // Abstract class and methods
        // ex: uicontrol class is abstract
        // only be extend to define the method

        var cal = new TaxCalculator2025(100_000);




    }

    /*
    //                      Object
    public static void show(UIControl control) {
        // control. // only see the members of Control class
        // Explicit casting inorder get the member of textbox class
        if(control instanceof TextBox){
            var textBox = (TextBox)control; // down casting - inorder to access the child class
            textBox.setText("Hello Lisa");
        }
        System.out.println(control); // print object go to default toString method
    }
    */

    /*
    // remove this and add it in a class to access by different class
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary + (extraHours * hourlyRate);
    }
    */
}
