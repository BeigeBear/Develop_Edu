package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBorderLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("BorderLayout 예제");
		JButton b1 = new JButton("100달러");
		JButton b2 = new JButton("200달러");
		JButton b3 = new JButton("300달러");
		JButton b4 = new JButton("400달러");
		JButton b5 = new JButton("500달러");
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}

}
