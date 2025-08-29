package study.gui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frames {
	public static void main(String[] args) {
		
		// JFrame :- a GUI window to add components to
		
		/*
		JFrame frame = new JFrame(); // create a frame
		frame.setTitle("Donut");
		frame.setSize(420, 420); // set x dim & y dim of frame
		frame.setVisible(true); // make frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
		frame.setResizable(false); // prevent frame from being resized.
		frame.getContentPane().setBackground(new Color(0x123456));	// change the background color
		// option "new Color(0x123456)", "Color.Green",new Color(0,255,0)
		
		ImageIcon image = new ImageIcon("C:\\Users\\S.Mukesh\\Pictures\\Donut.png"); // create an ImageIcon
		// image.getImage() -- get the image from the object and setIconImage(image.getImage()) set as Icon logo
		frame.setIconImage(image.getImage());
		*/
		
		MyFrame myframe = new MyFrame();
	}
}
