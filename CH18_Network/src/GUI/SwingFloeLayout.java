package GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingFloeLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("FlowLayout 예제");
		JButton b1 = new JButton("100달러");
		JButton b2 = new JButton("200달러");
		JButton b3 = new JButton("300달러");
		JButton b4 = new JButton("400달러");
		JButton b5 = new JButton("500달러");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.setSize(500, 100);
		f.setVisible(true);
	}

}
