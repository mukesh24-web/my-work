package com.Google;

public class TextBox extends UIControl{
    private String text = ""; // Field

//    public TextBox() {
//        super(true); // refer to parent class
//        // this. // we can't be able to access private field from outside class
//        // System.out.println("TextBox");
//    }

    @Override
    public void render(){
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    // initialize inorder to avoid null pointer exception
    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }
}
