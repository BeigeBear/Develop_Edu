package GUI;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingCardLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("CardLayout 예제");
		
		CardLayout card = new CardLayout(40, 30);
		f.setLayout(card);
		
		JButton b1, b2, b3;
		b1 = new JButton("손흥민");
		b2 = new JButton("케인");
		b3 = new JButton("레길론");
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.next(f.getContentPane());
			}
		};
		
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(650, 200);
		f.setVisible(true);
	}

}
