package Calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculatoor {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double prviBroj;
	double drugiBroj;
	String operacije;
	double rezultat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatoor window = new Calculatoor();
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
	public Calculatoor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 353, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font ("Tahoma", Font.PLAIN, 20));
		txtDisplay.setBounds(29,10,291,35);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
	
		//---------------------------------------------
		
		JButton btnNazad = new JButton("\uF0E7");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nazad = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					nazad = strB.toString();
					txtDisplay.setText(nazad);
				}
			}
		});
		btnNazad.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnNazad.setBounds(29, 55, 60, 60);
		frame.getContentPane().add(btnNazad);
		
		JButton btnObrisi = new JButton("C");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnObrisi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnObrisi.setBounds(106, 55, 60, 60);
		frame.getContentPane().add(btnObrisi);
		
		JButton btnPosto = new JButton("%");
		btnPosto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prviBroj = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacije = "%";
			}
		});
		btnPosto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPosto.setBounds(183, 55, 60, 60);
		frame.getContentPane().add(btnPosto);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prviBroj = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacije = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlus.setBounds(260, 55, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		//-----------------------prvi red--------------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(29, 120, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(106, 120, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
				}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(183, 120, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prviBroj = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacije = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.setBounds(260, 120, 60, 60);
		frame.getContentPane().add(btnMinus);
		
	//-----------------------------------drugi red-----------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(29, 185, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(106, 185, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String EnterNumber = txtDisplay.getText() +  btn6.getText();
			txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(183, 185, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnMnoz = new JButton("*");
		btnMnoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prviBroj = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacije = "*";
			}
		});
		btnMnoz.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMnoz.setBounds(260, 185, 60, 60);
		frame.getContentPane().add(btnMnoz);
		
	//----------------------------------------treci red--------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
				}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(29, 250, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(106, 250, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(183, 250, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnDijelj = new JButton("/");
		btnDijelj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prviBroj = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operacije = "/";
			}
		});
		btnDijelj.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDijelj.setBounds(260, 250, 60, 60);
		frame.getContentPane().add(btnDijelj);
		
	//----------------------------------------cetvrti red--------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(29, 315, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnTocka = new JButton(".");
		btnTocka.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTocka.setBounds(106, 315, 60, 60);
		frame.getContentPane().add(btnTocka);
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlusMinus.setBounds(183, 315, 60, 60);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnJednako = new JButton("=");
		btnJednako.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String odgovor;
				
				drugiBroj = Double.parseDouble(txtDisplay.getText());
				if(operacije == "+") 
				{
					rezultat = prviBroj + drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtDisplay.setText(odgovor);
				}
				
				else if(operacije == "-") 
				{
					rezultat = prviBroj - drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtDisplay.setText(odgovor);
				}
				
				else if(operacije == "*") 
				{
					rezultat = prviBroj  * drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtDisplay.setText(odgovor);
				}
				
				else if(operacije == "/") 
				{
					rezultat = prviBroj / drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtDisplay.setText(odgovor);
				}
				
				else if(operacije == "%") 
				{
					rezultat = prviBroj % drugiBroj;
					odgovor = String.format("%.2f", rezultat);
					txtDisplay.setText(odgovor);
				}
			}
		});
		btnJednako.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnJednako.setBounds(260, 315, 60, 60);
		frame.getContentPane().add(btnJednako);
		
	//----------------------------------------peti red--------------------
		
		
	}

}
