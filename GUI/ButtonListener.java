import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ButtonListener implements ActionListener{
	private JRadioButton radio1;
	private JRadioButton radio2;
	private JRadioButton radio3;
	private JRadioButton radio4;
	private JRadioButton radio5;
	
	public ButtonListener(JRadioButton r1,JRadioButton r2,JRadioButton r3,JRadioButton r4,JRadioButton r5) {
		radio1=r1;
		radio2=r2;
		radio3=r3;
		radio4=r4;
		radio5=r5;
	}
	public void actionPerformed(ActionEvent e) {
		String msg="Status:";
		msg+=radio1.isSelected();
		msg+=","+radio2.isSelected();
		msg+=","+radio3.isSelected();
		msg+=","+radio4.isSelected();
		msg+=","+radio5.isSelected();
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
