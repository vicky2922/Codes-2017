import javax.swing.*;
public class SpringDemo extends JFrame {
	public SpringDemo() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Name");
		JTextField tf = new JTextField(20);
		
		SpringLayout layout = new SpringLayout();
		setLayout(layout);

		add(label);
		add(tf);
		layout.putConstraint(SpringLayout.WEST, label, 30, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH,label,10,SpringLayout.NORTH,getContentPane());
		
		layout.putConstraint(SpringLayout.WEST, tf, 30, SpringLayout.EAST, label);
		layout.putConstraint(SpringLayout.NORTH, tf, 10, SpringLayout.NORTH, getContentPane());
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SpringDemo();
			}
		});
	}
}
