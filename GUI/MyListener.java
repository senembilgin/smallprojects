import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		String msg="Yeah, you clicked me!";
		JOptionPane.showMessageDialog(null, msg);
	}
}
