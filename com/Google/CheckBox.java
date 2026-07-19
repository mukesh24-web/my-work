package com.Google;

public final class CheckBox extends UIControl {
    @Override
    public void render(){
        System.out.println("Render CheckBox");
    }
}

// Final class
// public class MyCheckBox extends CheckBox{}
// we can't extend because checkbox is final class
// ex: String is immutable
// can't be extended
// String is a final class

// Final method
// we can't override that method
// subclass can't change or modify the state / behaviour