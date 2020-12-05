package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
	    JButton button = new JButton();
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Wohoo!");
		int rand = new Random().nextInt(5);
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "cool!");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "Nice Job!");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "Ur Amazing!");
		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "U are good at this!");
		}else {
			JOptionPane.showMessageDialog(null, "Thx Bro!");
		}
	}
}
