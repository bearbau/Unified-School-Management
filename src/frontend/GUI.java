package frontend;
import javax.swing.*;
import java.awt.Color;

public class GUI extends JFrame{
	GUI(){
		this.setTitle("School Management System");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420,420);
		this.setVisible(true);
		
		// ImageIcon image = new ImageIcon(""); just set this later
		// this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(220, 220, 220));
	}
}
