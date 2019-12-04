import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Ex2 {
	public static void main(String[]args) {
		JFrame frame=new JFrame("CS102 App");
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton button1=new JButton("OK");
		JButton button2=new JButton("CANCEL");
		frame.add(button1);
		frame.add(button2);
		
	AnotherActionListener listener1=new AnotherActionListener(1);
	AnotherActionListener listener2=new AnotherActionListener(2);
	AnotherActionListener listener3=new AnotherActionListener(3);
	
	button1.addActionListener(listener1);
	button2.addActionListener(listener2);
	button1.addActionListener(listener3);
		
		frame.setVisible(true);
	}
}
