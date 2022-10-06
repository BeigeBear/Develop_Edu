package GUI;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingJTextFieldEx1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Swing JTextField 예제");
		
		JTextField t1, t2;
		
		t1 = new JTextField("Swing Component를 사용합니다.");
		t1.setBounds(20, 10, 200, 30);
		
		t2 = new JTextField("장비를 정지합니다.");
		t2.setBounds(20, 50, 200, 30);
		
		f.add(t1);
		f.add(t2);
		
		f.setSize(500, 200);
		f.setLayout(null);
		f.setVisible(true);

	}

}
