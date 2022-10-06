package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingJLebelEx1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JLabel l;
		
		l = new JLabel("이미지 출력",
				new ImageIcon("C:/Temp/Java.jpg"), SwingConstants.RIGHT);
		l.setBounds(400, 1000, 150, 64);
		
		f.add(l);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
