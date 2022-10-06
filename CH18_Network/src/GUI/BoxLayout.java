package GUI;

import java.awt.Button;

import javax.swing.JFrame;

public class BoxLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("BoxLayout 예제");
		Button buttons[];
		buttons = new Button[5];
		for(int i=0; i<5; i++) {
			buttons[i] = new Button("Button"+ (i + 1));
			f.add(buttons[i]);
		}
		
		f.setLayout(manager);
	}

}
