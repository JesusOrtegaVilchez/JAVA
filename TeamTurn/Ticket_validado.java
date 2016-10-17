package model;

import java.awt.EventQueue;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JDialog;

import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ticket_validado extends Parte2{

	 JDialog frmListaDeEquipos;
	 JTextField textField;
	 private Parte2 p;
	 private JTextField numero_tarjeta_text;
	 private JTextField ccv_text;
	 private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parte2 p = new Parte2();
					Ticket_validado window = new Ticket_validado(p);
					window.frmListaDeEquipos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param p 
	 */
	public Ticket_validado(Parte2 p) {
		this.p = p;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeEquipos = new JDialog();
		frmListaDeEquipos.setResizable(false);
		frmListaDeEquipos.getContentPane().setBackground(new Color(0, 0, 51));
		frmListaDeEquipos.setBounds(new Rectangle(0, 0, 461, 446));
		frmListaDeEquipos.setTitle("LIsta de Equipos");
		frmListaDeEquipos.setBounds(100, 100, 554, 490);
		frmListaDeEquipos.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frmListaDeEquipos.getContentPane().setLayout(null);
		
		JLabel lblMiembroPorEquipo = new JLabel("Introduce tu nombre");
		lblMiembroPorEquipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMiembroPorEquipo.setForeground(new Color(255, 255, 255));
		lblMiembroPorEquipo.setBounds(10, 11, 141, 14);
		frmListaDeEquipos.getContentPane().add(lblMiembroPorEquipo);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 173, 20);
		frmListaDeEquipos.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago");
		lblFormaDePago.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFormaDePago.setForeground(Color.WHITE);
		lblFormaDePago.setBounds(10, 67, 128, 14);
		frmListaDeEquipos.getContentPane().add(lblFormaDePago);
		
		JRadioButton rdbtnTarjetaDeDbito = new JRadioButton("Tarjeta de d\u00E9bito o cr\u00E9dito");
		rdbtnTarjetaDeDbito.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnTarjetaDeDbito.isSelected()){
					numero_tarjeta_text.setEnabled(true);
					ccv_text.setEnabled(true);
					
				}
				else
				if(!rdbtnTarjetaDeDbito.isSelected()){
					numero_tarjeta_text.setEnabled(false);
					ccv_text.setEnabled(false);
					
				}
			}
		});
		buttonGroup.add(rdbtnTarjetaDeDbito);
		rdbtnTarjetaDeDbito.setBackground(new Color(0, 0, 51));
		rdbtnTarjetaDeDbito.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnTarjetaDeDbito.setForeground(Color.WHITE);
		rdbtnTarjetaDeDbito.setBounds(10, 88, 189, 23);
		frmListaDeEquipos.getContentPane().add(rdbtnTarjetaDeDbito);
		
		JRadioButton rdbtnPaypal = new JRadioButton("Efectivo");
		rdbtnPaypal.setSelected(true);
		buttonGroup.add(rdbtnPaypal);
		rdbtnPaypal.setBackground(new Color(0, 0, 51));
		rdbtnPaypal.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnPaypal.setForeground(Color.WHITE);
		rdbtnPaypal.setBounds(10, 114, 109, 23);
		frmListaDeEquipos.getContentPane().add(rdbtnPaypal);
		
		JLabel lblIntroduceElN = new JLabel("Introduce el n\u00BA de tu tajerta");
		lblIntroduceElN.setForeground(Color.WHITE);
		lblIntroduceElN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduceElN.setBounds(10, 144, 173, 14);
		frmListaDeEquipos.getContentPane().add(lblIntroduceElN);
		
		numero_tarjeta_text = new JTextField();
		numero_tarjeta_text.setEnabled(false);
		numero_tarjeta_text.setBounds(10, 169, 173, 20);
		frmListaDeEquipos.getContentPane().add(numero_tarjeta_text);
		numero_tarjeta_text.setColumns(10);
		
		JLabel lblIntroduceCcv = new JLabel("Introduce CCV");
		lblIntroduceCcv.setForeground(Color.WHITE);
		lblIntroduceCcv.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduceCcv.setBounds(10, 200, 173, 14);
		frmListaDeEquipos.getContentPane().add(lblIntroduceCcv);
		
		ccv_text = new JTextField();
		ccv_text.setEnabled(false);
		ccv_text.setBounds(10, 225, 86, 20);
		frmListaDeEquipos.getContentPane().add(ccv_text);
		ccv_text.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(337, 37, 147, 153);
		frmListaDeEquipos.getContentPane().add(scrollPane);
		
		
		//DefaultListModel lista_ticket = new DefaultListModel();
		JList list_equipos_ticket = new JList(p.getLista());
		scrollPane.setViewportView(list_equipos_ticket);
		//list_equipos_ticket.setModel(lista_ticket);
		
		JLabel lblListaDeEquipos = new JLabel("Lista de Equipos");
		lblListaDeEquipos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeEquipos.setForeground(Color.WHITE);
		lblListaDeEquipos.setBounds(338, 11, 116, 14);
		frmListaDeEquipos.getContentPane().add(lblListaDeEquipos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(337, 249, 147, 177);
		frmListaDeEquipos.getContentPane().add(scrollPane_1);
		
		JList list_miembros_ticket = new JList(p.getLista2());
		scrollPane_1.setViewportView(list_miembros_ticket);
		
		JLabel lblListaDeMiembros = new JLabel("Lista de Miembros");
		lblListaDeMiembros.setForeground(Color.WHITE);
		lblListaDeMiembros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeMiembros.setBounds(337, 213, 116, 14);
		frmListaDeEquipos.getContentPane().add(lblListaDeMiembros);
		
		JLabel lblEquipo = new JLabel("Equipo-1");
		lblEquipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo.setForeground(Color.WHITE);
		lblEquipo.setBounds(274, 39, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo);
		
		JLabel label = new JLabel("Equipo-1");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(264, 249, 63, 14);
		frmListaDeEquipos.getContentPane().add(label);
		
		JLabel lblEquipo_1 = new JLabel("Equipo-2");
		lblEquipo_1.setForeground(Color.WHITE);
		lblEquipo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_1.setBounds(274, 64, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_1);
		
		JLabel lblEquipo_2 = new JLabel("Equipo-3");
		lblEquipo_2.setForeground(Color.WHITE);
		lblEquipo_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_2.setBounds(274, 92, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_2);
		
		JLabel lblEquipo_3 = new JLabel("Equipo-4");
		lblEquipo_3.setForeground(Color.WHITE);
		lblEquipo_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_3.setBounds(274, 118, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_3);
		
		JLabel lblEquipo_4 = new JLabel("Equipo-5");
		lblEquipo_4.setForeground(Color.WHITE);
		lblEquipo_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_4.setBounds(274, 144, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_4);
		
		JLabel lblEquipo_5 = new JLabel("Equipo-2");
		lblEquipo_5.setForeground(Color.WHITE);
		lblEquipo_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_5.setBounds(264, 275, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_5);
		
		JLabel lblEquipo_6 = new JLabel("Equipo-3");
		lblEquipo_6.setForeground(Color.WHITE);
		lblEquipo_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_6.setBounds(264, 301, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_6);
		
		JLabel lblEquipo_7 = new JLabel("Equipo-4");
		lblEquipo_7.setForeground(Color.WHITE);
		lblEquipo_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_7.setBounds(264, 326, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_7);
		
		JLabel lblEquipo_8 = new JLabel("Equipo-5");
		lblEquipo_8.setForeground(Color.WHITE);
		lblEquipo_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_8.setBounds(264, 352, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_8);
		
		JLabel lblEquipo_9 = new JLabel("Equipo-6");
		lblEquipo_9.setForeground(Color.WHITE);
		lblEquipo_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEquipo_9.setBounds(264, 377, 63, 14);
		frmListaDeEquipos.getContentPane().add(lblEquipo_9);
		
		JButton boton_imprimir = new JButton("Imprimir Ticket");
		boton_imprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Imprimiendo ticket...","Atención",JOptionPane.INFORMATION_MESSAGE);
				//getFrame().dispose();
				new Parte2().setVisible(true);
				getFrmListaDeEquipos().setVisible(false);
				
				Object[] textoOpciones = {"Si"," No"};
				int opcion = JOptionPane.showOptionDialog(null, "Ticket Impreso, ¿Desea acceder otra vez?","Mensaje",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,textoOpciones,textoOpciones[0]);
				if(opcion == 0){
					
					
				}
				else if(opcion == 1){
					JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio");
					System.exit(0);
					
				}
			}
				
			
		});
		
		boton_imprimir.setBounds(10, 297, 173, 43);
		frmListaDeEquipos.getContentPane().add(boton_imprimir);
	}

	
	//GETTERS Y SETTERS
	

	public JDialog getFrmListaDeEquipos() {
		return frmListaDeEquipos;
	}

	public void setFrmListaDeEquipos(JDialog frmListaDeEquipos) {
		this.frmListaDeEquipos = frmListaDeEquipos;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public Parte2 getP() {
		return p;
	}

	public void setP(Parte2 p) {
		this.p = p;
	}
	
	
	
	
	//OTROS METODOS
	
	public void setVisible(boolean b) {
		if(b == true){
			frmListaDeEquipos.setVisible(true);
		}
		else{
			frmListaDeEquipos.setVisible(false);
		}
		
	}
}
