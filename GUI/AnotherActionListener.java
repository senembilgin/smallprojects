import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnotherActionListener implements ActionListener {
	private int id;
	
	public AnotherActionListener(int id) {
		this.id=id;
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton button=(JButton)e.getSource();
			
			System.out.println("Listener: "+id+" from "+button.getText());
		}
	}

}
