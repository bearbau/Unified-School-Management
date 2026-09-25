package frontend;

import java.awt.Color;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		// content formatting
		JLabel title = new JLabel();
		title.setText("School Management System");
		title.setHorizontalTextPosition(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.TOP);
		
		// frame
		JFrame frame = new JFrame();
		frame.setTitle("School Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		// favicon
		// ImageIcon image = new ImageIcon(""); just set this later
		// this.setIconImage(image.getImage());
		
		// content insertion
		frame.add(title);
		

	}

}
