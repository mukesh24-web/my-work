package study.gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//           sub-class		 parent-class
public class MyFrame extends JFrame{
	MyFrame() {
		this.setTitle("Donut");
		this.setSize(420, 420); // set x dim & y dim of frame
		this.setVisible(true); // make frame visible
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
		this.setResizable(false); // prevent frame from being resized.
		this.getContentPane().setBackground(new Color(0x123456));	// change the background color
		// option "new Color(0x123456)", "Color.Green",new Color(0,255,0)
		
		ImageIcon image = new ImageIcon("C:\\Users\\S.Mukesh\\Pictures\\Donut.png"); // create an ImageIcon
		// image.getImage() -- get the image from the object and setIconImage(image.getImage()) set as Icon logo
		this.setIconImage(image.getImage());
	}
} 
