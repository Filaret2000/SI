package lab1;
//Crainiciuc Filaret-Niculai
//Gr 3142A
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	private Arithmetic arithmetic = new Arithmetic();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 478, 536);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("7");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(53, 205, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("8");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(142, 205, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("9");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_2.setBounds(231, 205, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("4");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_3.setBounds(53, 271, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("5");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_4.setBounds(142, 271, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("6");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_5.setBounds(231, 271, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("1");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_6.setBounds(53, 337, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("2");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_7.setBounds(142, 337, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumberToTextField("3");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8.setBounds(231, 337, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(textField.getText() + "\n");
				if(textField.getText() != "")
					addNumberToTextField("0");
			}
		});
		btnNewButton_9.setBounds(53, 403, 168, 56);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_8_1 = new JButton(".");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText() == "") {
					textField.setText("0.");
				} else {
					addNumberToTextField(".");
				}
			}
		});
		btnNewButton_8_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_1.setBounds(231, 403, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("=");
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str != "") {
					arithmetic.setSecondOperand(Double.parseDouble(str));
					textField.setText(arithmetic.calculate());
				}
			}
		});
		btnNewButton_8_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_2.setBounds(320, 403, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_2);
		
		JButton btnNewButton_8_3 = new JButton("+");
		btnNewButton_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str != "" && str != "NaN") {
					arithmetic.setFirstOperand(Double.parseDouble(str));
					arithmetic.setOperation("+");
					textField.setText("");
				}
			}
		});
		btnNewButton_8_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_3.setBounds(320, 337, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("-");
		btnNewButton_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str != "" && str != "NaN") {
					arithmetic.setFirstOperand(Double.parseDouble(str));
					arithmetic.setOperation("-");
					textField.setText("");
				}
			}
		});
		btnNewButton_8_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_4.setBounds(320, 271, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("x");
		btnNewButton_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str != "" && str != "NaN") {
					arithmetic.setFirstOperand(Double.parseDouble(str));
					arithmetic.setOperation("*");
					textField.setText("");
				}
			}
		});
		btnNewButton_8_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_5.setBounds(320, 205, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_5);
		
		JButton btnNewButton_8_6 = new JButton("/");
		btnNewButton_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str != "" && str != "NaN") {
					arithmetic.setFirstOperand(Double.parseDouble(str));
					arithmetic.setOperation("/");
					textField.setText("");
				}
			}
		});
		btnNewButton_8_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_6.setBounds(320, 139, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_6);
		
		JButton btnNewButton_8_7 = new JButton("AC");
		btnNewButton_8_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				arithmetic.clear();
			}
		});
		btnNewButton_8_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_8_7.setBounds(53, 139, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_7);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(53, 46, 346, 83);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("");
		
		JButton btnNewButton_8_6_1 = new JButton("+/-");
		btnNewButton_8_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if(str.charAt(0) == '-') {
					textField.setText(str.substring(1));
				} else {
					textField.setText("-" + str);
				}
			}
		});
		btnNewButton_8_6_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_8_6_1.setBounds(231, 139, 79, 56);
		frmCalculator.getContentPane().add(btnNewButton_8_6_1);
	}
	
	private void addNumberToTextField(String nr) {
		String str = textField.getText();
		if(str == "0") {
			textField.setText(nr);
		} else {
			textField.setText(str + nr);
		}
	}
}
