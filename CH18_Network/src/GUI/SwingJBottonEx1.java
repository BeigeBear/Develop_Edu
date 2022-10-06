package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJBottonEx1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("JBotton을 이용한 버튼 생성");
		
		JButton b = new JButton("버튼 클릭");
		b.setBounds(500, 500, 100, 200);
		
		f.add(b);
		
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
	}

}
