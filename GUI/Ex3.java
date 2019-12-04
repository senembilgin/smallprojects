import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex3 {
public static void main(String[]args) {
	JFrame frame=new JFrame("Options");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400,400);
	frame.setLayout(new BorderLayout());
	
	JPanel panel=new JPanel();
	panel.setLayout(new GridLayout(6,1));
	frame.add(panel);
	
	JRadioButton radio1=new JRadioButton("button 1");
	JRadioButton radio2=new JRadioButton("button 2");
	JRadioButton radio3=new JRadioButton("button 3");
	JRadioButton radio4=new JRadioButton("button 4");
	JRadioButton radio5=new JRadioButton("button 5");
	
	ButtonGroup group1=new ButtonGroup();
	group1.add(radio1);
	group1.add(radio2);
	ButtonGroup group2=new ButtonGroup();
	group2.add(radio3);
	group2.add(radio4);
	group2.add(radio5);
	
	panel.add(radio1);
	panel.add(radio2);
	panel.add(radio3);
	panel.add(radio4);
	panel.add(radio5);
	
	JButton button=new JButton("Report");
	panel.add(button);
	
	button.addActionListener(new ButtonListener(radio1, radio2, radio3, radio4, radio5));
	
	frame.setVisible(true);
	
	
	
	
	
}}
