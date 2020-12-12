package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness implements ActionListener {
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
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}
	void showDucks() {
	      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 }


	void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	void showFluffyUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }


@Override
public void actionPerformed(ActionEvent arg0) {
	showDucks();
}
}