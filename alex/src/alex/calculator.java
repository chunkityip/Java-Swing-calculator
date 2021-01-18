package alex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frmJavaCalculatorV;
	private JTextField textField;
	double ans , num;
	double first , second , result;
	String calculator;
	String operation , answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmJavaCalculatorV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	
	public calculator() {
		initialize();
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCalculatorV = new JFrame();
		frmJavaCalculatorV.setResizable(false);
		frmJavaCalculatorV.setTitle("Java Calculator v0.1");
		frmJavaCalculatorV.getContentPane().setFont(new Font("PMingLiU", Font.PLAIN, 12));
		frmJavaCalculatorV.setBounds(100, 100, 478, 465);
		frmJavaCalculatorV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCalculatorV.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.BLACK);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 53));
		textField.setBounds(0, 0, 462, 89);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frmJavaCalculatorV.getContentPane().add(textField);
		textField.setColumns(10);
		
		//button for remove all
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.setBounds(0, 86, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton);
		
		
		
		
		//button for remove one digit number
		JButton btnNewButton_3 = new JButton("\u2190");
		btnNewButton_3.setForeground(new Color(30, 144, 255));
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//by counting the length of the String , we can subtract 1 digit number from the text field
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				
				//Cause I am changing something in String but String is immutable in java , so I am using StrignBuilder
				if (length > 0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(number);
					store= sb.toString();
					textField.setText(store);
				}
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_3.setBounds(348, 86, 114, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_3);
		
		
		//button for 7
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +  "7");
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_4.setBounds(0, 153, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_4);
		
		
		//button for 8
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_5.setBounds(116, 153, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_5);
		
		
		//button for 9
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +  "9");
			}
		});
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(Color.BLACK);
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_6.setBounds(232, 153, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_6);
		
		
		
		
		
		//button for 4
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +  "4");
			}
		});
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(Color.BLACK);
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_8.setBounds(0, 221, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_8);
		
		
		//button for 5
		JButton btnNewButton_9 = new JButton("5");
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setBackground(Color.BLACK);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +  "5");
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_9.setBounds(116, 221, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_9);
		
		
		//button for 6
		JButton btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +  "6");
			}
		});
		btnNewButton_10.setForeground(Color.WHITE);
		btnNewButton_10.setBackground(Color.BLACK);
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_10.setBounds(232, 221, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_10);
		
		
		
		//button for 0
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_12.setForeground(Color.WHITE);
		btnNewButton_12.setBackground(Color.BLACK);
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_12.setBounds(116, 356, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_12);
		
		
		//button for 1
		JButton btnNewButton_13 = new JButton("1");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.setBackground(Color.BLACK);
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_13.setBounds(0, 289, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_13);
		
		
		//button for 2
		JButton btnNewButton_14 = new JButton("2");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_14.setForeground(Color.WHITE);
		btnNewButton_14.setBackground(Color.BLACK);
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_14.setBounds(116, 289, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_14);
		
		
		//button for 3
		JButton btnNewButton_15 = new JButton("3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() +"3");
			}
		});
		btnNewButton_15.setForeground(Color.WHITE);
		btnNewButton_15.setBackground(Color.BLACK);
		btnNewButton_15.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_15.setBounds(232, 289, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_15);
		
		//button for +
		JButton btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnNewButton_11.setForeground(new Color(30, 144, 255));
		btnNewButton_11.setBackground(Color.DARK_GRAY);
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_11.setBounds(348, 221, 114, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_11);
		
		
		//button for -
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "-";
			}
		});
		btnNewButton_7.setForeground(new Color(30, 144, 255));
		btnNewButton_7.setBackground(Color.DARK_GRAY);
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_7.setBounds(348, 153, 114, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_7);
		
		
		//button for *
		JButton btnNewButton_2 = new JButton("X");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnNewButton_2.setForeground(new Color(30, 144, 255));
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_2.setBounds(232, 86, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_2);
		
		//button for /
		JButton btnNewButton_1 = new JButton("\u00F7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnNewButton_1.setForeground(new Color(30, 144, 255));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		btnNewButton_1.setBounds(116, 86, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_1);
		
		
		
		//button for %
		JButton btnNewButton_13_1 = new JButton("%");
		btnNewButton_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnNewButton_13_1.setForeground(Color.WHITE);
		btnNewButton_13_1.setBackground(new Color(0, 0, 0));
		btnNewButton_13_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_13_1.setBounds(0, 356, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_13_1);
		
		
		//button for .
		JButton btnNewButton_13_2 = new JButton(".");
		btnNewButton_13_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_13_2.setBackground(Color.BLACK);
		btnNewButton_13_2.setForeground(Color.WHITE);
		btnNewButton_13_2.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton_13_2.setBounds(232, 356, 117, 69);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_13_2);
		
		
		//button for =
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer; 
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					//different operation will change the behavior 
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					//different operation will change the behavior 
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					//different operation will change the behavior 
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					//different operation will change the behavior 
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "%") {
					//different operation will change the behavior 
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_16.setForeground(new Color(30, 144, 255));
		btnNewButton_16.setBackground(Color.DARK_GRAY);
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 31));
		btnNewButton_16.setBounds(348, 289, 114, 136);
		frmJavaCalculatorV.getContentPane().add(btnNewButton_16);
	}
}
