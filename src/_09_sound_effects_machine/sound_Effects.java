package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class sound_Effects implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
	    JButton button = new JButton();
	    JButton button1 = new JButton();
	    panel.add(button);
	    panel.add(button1);
	    frame.add(panel);
	    frame.pack();
	    button.addActionListener(this);
	    button1.addActionListener(this);
	}
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		String soundEffect = "sawing-wood-daniel_simon.wav";
		playSound(soundEffect);
	}
}
