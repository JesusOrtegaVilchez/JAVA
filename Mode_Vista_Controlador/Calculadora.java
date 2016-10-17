package Modelo_vista_controlador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.swing.text.html.parser.ParserDelegator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	JButton button = new JButton("+");
	JButton button_1 = new JButton("-");
	JButton btnC = new JButton("C");
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		
	}*/

	/**
	 * Create the application.
	 */
	public Calculadora() {
		
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblValor = new JLabel("Valor1 : ");
		lblValor.setBounds(96, 55, 46, 14);
		frame.getContentPane().add(lblValor);
		
		JLabel lblValor_1 = new JLabel("Valor 2 :");
		lblValor_1.setBounds(96, 83, 46, 14);
		frame.getContentPane().add(lblValor_1);
		
		JLabel lblValor_2 = new JLabel("Resultado :");
		lblValor_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor_2.setBounds(45, 115, 97, 14);
		frame.getContentPane().add(lblValor_2);
		
		textField = new JTextField();
		textField.setBounds(152, 52, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 80, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 112, 86, 20);
		frame.getContentPane().add(textField_2);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total= Double.parseDouble(textField.getText().toString()) + Double.parseDouble(textField_1.getText().toString()) ;	
				textField_2.setText(String.valueOf(total));
			}
		});
		button.setBounds(248, 51, 89, 23);
		frame.getContentPane().add(button);
		
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total= Double.parseDouble(textField.getText().toString()) - Double.parseDouble(textField_1.getText().toString()) ;	
				textField_2.setText(String.valueOf(total));
			}
		});
		button_1.setBounds(248, 79, 89, 23);
		frame.getContentPane().add(button_1);
		
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnC.setBounds(248, 111, 89, 23);
		frame.getContentPane().add(btnC);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
	}

	public JButton getBtnC() {
		return btnC;
	}

	public void setBtnC(JButton btnC) {
		this.btnC = btnC;
	}

	
	
	
}
