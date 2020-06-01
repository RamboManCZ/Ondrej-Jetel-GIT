package accountgenerator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AccountGeneratorFrame implements ActionListener {
	JFrame frame = new JFrame();
	JButton btn = new JButton("Show details");
	JTextField nametxt = new JTextField();
	JLabel namelabel = new JLabel();
	JLabel usernamelabel = new JLabel();
	JLabel emaillabel = new JLabel();
	JLabel passwordlabel = new JLabel();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();

	public AccountGeneratorFrame() {
		frame.setSize(300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		panel.add(nametxt);
		panel.add(namelabel);
		panel.add(usernamelabel);
		panel.add(emaillabel);
		panel.add(passwordlabel);
		panel.setLayout(new GridLayout(5, 1));
		panel2.add(btn);
		btn.addActionListener(this);
		frame.add(panel);
		frame.add(panel2);
		frame.setLayout(new GridLayout(2, 1));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Employee emp = new Employee(nametxt.getText());
			AccountGenerator ag = new AccountGenerator(emp);
			namelabel.setText("Name: "+emp.getName());
			usernamelabel.setText("Username: "+emp.getUsername());
			emaillabel.setText("E-Mail: "+emp.getEmail());
			passwordlabel.setText("Password: "+emp.getPassword());
			ag.serializeData(emp);

		} catch (Exception nameException) {
			System.err.println("chyba");
		}
	}

	public void x() throws nullException {

	}

	public static void main(String[] args) {
		new AccountGeneratorFrame();
	}

}