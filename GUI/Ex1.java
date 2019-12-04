import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JFrame frame=new JFrame("CS102 App");
frame.setSize(400,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel panel=new JPanel();
frame.add(panel);

JButton button=new JButton("Click me!");
panel.add(button);

button.addActionListener(new MyListener());

frame.setVisible(true);
	}

}
