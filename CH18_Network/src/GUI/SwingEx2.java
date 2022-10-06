package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame {

	JFrame f;
	
	SwingEx2(){
		JFrame f = new JFrame();
		
		JButton b = new JButton("내 계좌에 오만원 입금");
		b.setBounds(20, 20, 600, 100);
		
		f.add(b);
		
		f.setSize(650, 200);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new SwingEx2();
	}

}
