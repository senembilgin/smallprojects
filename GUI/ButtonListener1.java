import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class ButtonListener1 implements ActionListener {
	private JCheckBox c1;
	private JCheckBox c2;
	private JCheckBox c3;
	private JCheckBox c4;
	private JCheckBox c5;
	
public ButtonListener1(JCheckBox c1,JCheckBox c2,JCheckBox c3,JCheckBox c4,JCheckBox c5) {
	this.c1=c1;
	this.c2=c2;
	this.c3=c3;
	this.c4=c4;
	this.c5=c5;
}
public void actionPerformed(ActionEvent e) {
	String msg="Status:";
	msg+=c1.isSelected();
	msg+=","+c2.isSelected();
	msg+=","+c2.isSelected();
	msg+=","+c3.isSelected();
	msg+=","+c4.isSelected();
	msg+=","+c5.isSelected();
	
	JOptionPane.showMessageDialog(null, msg);
}
	
	
}
