package examen_compra_online;
/*
 * */
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Padre {

	private JFrame frmCompron;
	private JTextField nombre_usuario_padre;
	private JTextField cantidad_aPagar_enPadre;
	private Padre p;
	private JTextArea carrito_compra_padre;
	//private JCheckBox chckbxNewCheckBox = new JCheckBox("Tarjeta club Compron");
	private JCheckBox opcion_descuento;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padre window = new Padre();
					window.frmCompron.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Padre() {
		p = this;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompron = new JFrame();
		frmCompron.setTitle("COMPRON");
		frmCompron.setBounds(100, 100, 471, 404);
		frmCompron.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompron.getContentPane().setLayout(new GridLayout(6,2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		frmCompron.getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCompronTuCompra = new JLabel("                COMPRON: TU COMPRA ONLINE");
		lblCompronTuCompra.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblCompronTuCompra);
		lblCompronTuCompra.setHorizontalTextPosition(SwingConstants.LEFT);
		lblCompronTuCompra.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		
		
		JPanel panel = new JPanel();
		frmCompron.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Identificacion de Usuario:  ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel);
		
		nombre_usuario_padre = new JTextField();
		panel.add(nombre_usuario_padre);
		nombre_usuario_padre.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frmCompron.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Carrito de Compra:  ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		carrito_compra_padre = new JTextArea();
		carrito_compra_padre.setEditable(false);
		scrollPane.setViewportView(carrito_compra_padre);
		
		JPanel panel_3 = new JPanel();
		frmCompron.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Total a pagar (\u20AC):  ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_2);
		
		cantidad_aPagar_enPadre = new JTextField();
		cantidad_aPagar_enPadre.setEditable(false);
		cantidad_aPagar_enPadre.setText("0.0");
		panel_3.add(cantidad_aPagar_enPadre);
		cantidad_aPagar_enPadre.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		frmCompron.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		opcion_descuento = new JCheckBox("Tarjeta club Compron");
		opcion_descuento.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(opcion_descuento.isSelected()){//si esta seleccionada, la cantidad a pagar es decrementada en un 5%
					 double total = Double.parseDouble(cantidad_aPagar_enPadre.getText().toString());
					 double descuento = 0.05;
					 total = total - total * descuento;
					 cantidad_aPagar_enPadre.setText(String.valueOf(total));
				}
				else
					if(!opcion_descuento.isSelected()){// si no está seleccionada se vuele a sumar la cantidad restada.
						double total = Double.parseDouble(cantidad_aPagar_enPadre.getText().toString());
						 double descuento = 0.0525;
						 total = total + total * descuento;
						 cantidad_aPagar_enPadre.setText(String.valueOf(total));
				}
			}
		});
		opcion_descuento.setEnabled(false);
		opcion_descuento.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(opcion_descuento);
		
		JPanel panel_5 = new JPanel();
		frmCompron.getContentPane().add(panel_5);
		
		JButton btnImprimirTicket = new JButton("Imprimir Ticket");
		btnImprimirTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(carrito_compra_padre.getText().equals("")){//si el carrito esta vacio no deja imprimir el ticket
					JOptionPane.showMessageDialog(null, "No se ha realizado ninguna compra","Sin Compra",JOptionPane.ERROR_MESSAGE);
				}
				else {//si contiene elementos imprime el ticket
					JOptionPane.showMessageDialog(null,"Imprimiendo ticket","Compra Realizada",JOptionPane.INFORMATION_MESSAGE);
					nombre_usuario_padre.setText("");
					carrito_compra_padre.setText("");
					cantidad_aPagar_enPadre.setText("");
					
					
					
				}
				
			}
		});
		panel_5.add(btnImprimirTicket);
		
		JButton btnHacerCompra = new JButton("Hacer Compra");
		btnHacerCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nombre_usuario_padre.getText().equals("")){//si no hay ningun usuario creado, niega el acceso
					JOptionPane.showMessageDialog(null, "No ha añadido ningun usuario","Sin usuario", JOptionPane.ERROR_MESSAGE);
				}
				else 
					if(!nombre_usuario_padre.getText().equals("")){//cuando se ha introducido un usuario se accede a la interfaz de compra
						Hija r = new Hija(p);//dentro de un evento no se perimite crear una instancia de la clase
						r.getFrmListaDeLa().setModal(true);
						r.getFrmListaDeLa().setVisible(true);
				}
				
			}
		});
		panel_5.add(btnHacerCompra);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				Object[] textoOpciones = {"Si","No"};//declaracion de un objeto con dos cadenas de caracteres opcion "si" y opcion "no"
				int opcion = JOptionPane.showOptionDialog(null,"¿Realmente desea salir del programa?","Salir del Programa"
						,JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,null,textoOpciones,textoOpciones[0]);
				//Si pulso el primer boton, 0
				if(opcion == 0){
				System.exit(0);
				
			}
				else{
					//Si pulso el segundo boton,1
				}
			}
		});
		panel_5.add(btnSalir);
	}

	//Getters y Setters
	
	public JFrame getFrmCompron() {
		return frmCompron;
	}

	public void setFrmCompron(JFrame frmCompron) {
		this.frmCompron = frmCompron;
	}

	public JTextField getNombre_usuario_padre() {
		return nombre_usuario_padre;
	}

	public void setNombre_usuario_padre(JTextField nombre_usuario_padre) {
		this.nombre_usuario_padre = nombre_usuario_padre;
	}

	public JTextField getTextField_2() {
		return cantidad_aPagar_enPadre;
	}

	public void setTextField_2(JTextField textField_2) {
		this.cantidad_aPagar_enPadre = textField_2;
	}

	public Padre getP() {
		return p;
	}

	public void setP(Padre p) {
		this.p = p;
	}

	public JTextField getCantidad_aPagar_enPadre() {
		return cantidad_aPagar_enPadre;
	}

	public void setCantidad_aPagar_enPadre(JTextField cantidad_aPagar_enPadre) {
		this.cantidad_aPagar_enPadre = cantidad_aPagar_enPadre;
	}

	public JTextArea getCarrito_compra_padre() {
		return carrito_compra_padre;
	}

	public void setCarrito_compra_padre(JTextArea carrito_compra_padre) {
		this.carrito_compra_padre = carrito_compra_padre;
	}

	public JCheckBox getOpcion_descuento() {
		return opcion_descuento;
	}

	public void setOpcion_descuento(JCheckBox opcion_descuento) {
		this.opcion_descuento = opcion_descuento;
	}

	
	
}
