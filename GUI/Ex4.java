import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame=new JFrame("CS102 App");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
frame.setLayout(new BorderLayout());

JPanel panel=new JPanel();
panel.setLayout(new GridLayout(6,1));
frame.add(panel);

JCheckBox c1=new JCheckBox("Box 1");
JCheckBox c2=new JCheckBox("Box 2");
JCheckBox c3=new JCheckBox("Box 3");
JCheckBox c4=new JCheckBox("Box 4");
JCheckBox c5=new JCheckBox("Box 5");

ButtonGroup group1=new ButtonGroup();
group1.add(c1);
group1.add(c2);
group1.add(c3);
group1.add(c4);
group1.add(c5);

panel.add(c1);
panel.add(c2);
panel.add(c3);
panel.add(c4);
panel.add(c5);

JButton button=new JButton("Report");
panel.add(button);
button.addActionListener(new ButtonListener1(c1,c2,c3,c4,c5));

frame.setVisible(true);
	}

}
