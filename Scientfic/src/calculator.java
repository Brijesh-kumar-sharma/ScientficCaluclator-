import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				
					
					
					
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
		frame = new JFrame();
		frame.setForeground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 357, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(10, 39, 320, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("SCIENTFIC CALCULATOR");
		lblNewLabel.setBounds(10, 11, 320, 27);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn2.setBounds(139, 398, 64, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn5.setBounds(139, 347, 64, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn8.setBounds(139, 295, 64, 50);
		frame.getContentPane().add(btn8);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setBounds(139, 243, 64, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnLn = new JButton("sinh");
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnLn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLn.setBounds(139, 191, 64, 50);
		frame.getContentPane().add(btnLn);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(74, 449, 129, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSin.setBounds(139, 139, 64, 50);
		frame.getContentPane().add(btnSin);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDot.setBounds(202, 449, 64, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
						answer=String.format("%.2f", resultt);
						textField.setText(answer);
					}
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEqual.setBounds(266, 449, 64, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnXrx = new JButton("X^Y");
		btnXrx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="xrx";
				

			}
		});
		btnXrx.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnXrx.setBounds(10, 243, 64, 50);
		frame.getContentPane().add(btnXrx);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.log(Double.parseDouble(textField.getText()));
			
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLog.setBounds(74, 192, 64, 50);
		frame.getContentPane().add(btnLog);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCe.setBounds(74, 243, 64, 50);
		frame.getContentPane().add(btnCe);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn7.setBounds(74, 295, 64, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn4.setBounds(74, 347, 64, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn1.setBounds(74, 398, 64, 50);
		frame.getContentPane().add(btn1);
		
		JButton btnX = new JButton("x3");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		   double a = (Double.parseDouble(textField.getText()));
		   a=a*a*a;
			textField.setText("");
			textField.setText(textField.getText()+a);

			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBounds(10, 295, 64, 50);
		frame.getContentPane().add(btnX);
		
		JButton btnEx = new JButton("ex");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEx.setBounds(74, 139, 64, 50);
		frame.getContentPane().add(btnEx);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a =1/ Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnx.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnx.setBounds(9, 191, 64, 50);
		frame.getContentPane().add(btnx);
		
		JButton btnSqrt = new JButton("\u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSqrt.setBounds(10, 139, 64, 50);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCos.setBounds(202, 139, 64, 50);
		frame.getContentPane().add(btnCos);
		
		JButton btnCos_1 = new JButton("cosh");
		btnCos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnCos_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCos_1.setBounds(202, 191, 64, 50);
		frame.getContentPane().add(btnCos_1);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnBackSpace.setBounds(202, 243, 64, 50);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn9.setBounds(202, 295, 64, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn6.setBounds(202, 347, 64, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn3.setBounds(202, 398, 64, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTan.setBounds(266, 139, 64, 50);
		frame.getContentPane().add(btnTan);
		
		JButton btnTan_1 = new JButton("tanh");
		btnTan_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnTan_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTan_1.setBounds(266, 191, 64, 50);
		frame.getContentPane().add(btnTan_1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnPlus.setBounds(266, 243, 64, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnSub.setBounds(266, 295, 64, 50);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnMul.setBounds(266, 347, 64, 50);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDivide.setBounds(266, 398, 64, 50);
		frame.getContentPane().add(btnDivide);
		
		JButton btnP_1 = new JButton("x2");
		btnP_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnP_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnP_1.setBounds(10, 347, 64, 50);
		frame.getContentPane().add(btnP_1);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		    double a =(Double.parseDouble(textField.getText()));
		   double f=1;
		    while(a!=0)
		    {
		     f=f*a;
		     a--;
		    }
			textField.setText("");
			textField.setText(textField.getText()+f);

			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnN.setBounds(10, 398, 64, 50);
		frame.getContentPane().add(btnN);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(72, 291, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(19, 191, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 191, 320, 2);
		frame.getContentPane().add(separator_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 109, 63, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(74, 109, 64, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton button = new JButton("+/-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(10, 449, 64, 50);
		frame.getContentPane().add(button);
	}
}
