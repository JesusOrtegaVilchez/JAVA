package examen_compra_online;
/*
 * jbutton - acction event
 * jtextcomponent - textevent
 * jtextfield- action event
 * jcombobox item action event
 * jlist - listselection event
 * jcheckbox,jradiobutton - itemselectionevent
 * jmenuitem - action event*/
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Hija {

	private JDialog frmListaDeLa;
	private JTextArea lista_productos = new JTextArea();
	private JTextField nombre_usuario_de_hija;
	private JTextField total_a_pagar_en_hija;
	private JTextField nombre_producto_hija;
	private JTextField unidad_precio;
	private Padre p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Padre p =  new Padre();
					Hija window = new Hija(p);
					window.frmListaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hija(Padre p) {
		this.p = p;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListaDeLa = new JDialog();
		frmListaDeLa.setResizable(false);
		frmListaDeLa.setTitle("Lista de la Compra");
		frmListaDeLa.setBounds(100, 100, 633, 365);
		frmListaDeLa.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frmListaDeLa.getContentPane().setLayout(null);
		
		JButton finalizar_compra = new JButton("Finalizar Compra");
		JLabel lblIdentificacionDeUsurario = new JLabel("Identificacion de Usurario");
		lblIdentificacionDeUsurario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdentificacionDeUsurario.setBounds(30, 44, 156, 14);
		frmListaDeLa.getContentPane().add(lblIdentificacionDeUsurario);
		
		nombre_usuario_de_hija = new JTextField(p.getNombre_usuario_padre().getText().toString());
		nombre_usuario_de_hija.setEditable(false);
		nombre_usuario_de_hija.setBounds(193, 41, 161, 20);
		frmListaDeLa.getContentPane().add(nombre_usuario_de_hija);
		nombre_usuario_de_hija.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar (\u20AC) :  ");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalAPagar.setBounds(367, 44, 116, 14);
		frmListaDeLa.getContentPane().add(lblTotalAPagar);
		
		total_a_pagar_en_hija = new JTextField();
		total_a_pagar_en_hija.setText("0.0");
		total_a_pagar_en_hija.setEditable(false);
		total_a_pagar_en_hija.setColumns(10);
		total_a_pagar_en_hija.setBounds(474, 41, 86, 20);
		frmListaDeLa.getContentPane().add(total_a_pagar_en_hija);
		
		JLabel lblProducto = new JLabel("Producto : ");
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProducto.setBounds(30, 85, 72, 14);
		frmListaDeLa.getContentPane().add(lblProducto);
		
		nombre_producto_hija = new JTextField();
		nombre_producto_hija.setBounds(97, 82, 140, 20);
		frmListaDeLa.getContentPane().add(nombre_producto_hija);
		nombre_producto_hija.setColumns(10);
		
		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad : ");
		lblCantidadYPreciounidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidadYPreciounidad.setBounds(247, 85, 161, 14);
		frmListaDeLa.getContentPane().add(lblCantidadYPreciounidad);
		
		JComboBox cantidad_unidad = new JComboBox();
		cantidad_unidad.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cantidad_unidad.setBounds(408, 82, 55, 20);
		frmListaDeLa.getContentPane().add(cantidad_unidad);
		
		unidad_precio = new JTextField();
		unidad_precio.setBounds(474, 82, 86, 20);
		frmListaDeLa.getContentPane().add(unidad_precio);
		unidad_precio.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 130, 344, 126);
		frmListaDeLa.getContentPane().add(scrollPane);
		
		lista_productos = new JTextArea();
		scrollPane.setViewportView(lista_productos);
		
		JButton anadir_producto = new JButton("A\u00F1adir producto creado");
		anadir_producto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!nombre_producto_hija.getText().equals("") && cantidad_unidad.getSelectedIndex()!= 0 && !unidad_precio.getText().equals("")){
					String cad1;
					//el valor del precio sera la cantidad seleccionada por el precio que se le ponga
					double cantidad_por_precio = cantidad_unidad.getSelectedIndex() * Double.parseDouble(unidad_precio.getText().toString());
					//se añade al text area de la soguiente manera conservando el producto anterior
					lista_productos.setText(nombre_producto_hija.getText()+"("+cantidad_unidad.getSelectedIndex()+")"+"  ->  "+cantidad_por_precio+" € "+"\n"+lista_productos.getText());
					//guardamos en una variable de tipo String el valor del primer producto para ir sumandole los demas valores
					cad1 = total_a_pagar_en_hija.getText();
					//se convierte esa cantidad en un valor de tipo double
					double cantidad1 = Double.parseDouble(cad1);
					//la suma total sera la cantidad inicial mas las demas cantidades que se añadan 
					double suma_total = cantidad1 + cantidad_por_precio;
					//se tranforma el valor double a String 
					String resultado = String.valueOf(suma_total);
					//se suelta el valor por pantalla actualizado
					total_a_pagar_en_hija.setText(resultado);
					//se reinician los campos
					nombre_producto_hija.setText("");cantidad_unidad.setSelectedIndex(0);unidad_precio.setText("");//borramos lo escrito
					//se deja el cursor sobre el nombre de producto para añadir otra vez
					nombre_producto_hija.grabFocus();
			}
		}
	});
		anadir_producto.setBounds(384, 137, 176, 30);
		frmListaDeLa.getContentPane().add(anadir_producto);
		
		//JButton finalizar_compra = new JButton("Finalizar Compra");
		finalizar_compra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//p.setCarrito_compra_padre(lista_productos);
				p.getCarrito_compra_padre().setText((getLista_productos().getText()));
				p.getCantidad_aPagar_enPadre().setText((getTotal_a_pagar_en_hija().getText()));
				if(!getLista_productos().getText().equals(""));
					p.getOpcion_descuento().setEnabled(true);
					
				getFrmListaDeLa().dispose();
				
			}
		});
		finalizar_compra.setBounds(384, 213, 176, 30);
		frmListaDeLa.getContentPane().add(finalizar_compra);
	}
	
	
	//Getters y Setters

	public JTextArea getLista_productos() {
		return lista_productos;
	}

	public void setLista_productos(JTextArea lista_productos) {
		this.lista_productos = lista_productos;
	}

	public JTextField getUnidad_precio() {
		return unidad_precio;
	}

	public void setUnidad_precio(JTextField unidad_precio) {
		this.unidad_precio = unidad_precio;
	}

	public JDialog getFrmListaDeLa() {
		return frmListaDeLa;
	}

	public void setFrmListaDeLa(JDialog frmListaDeLa) {
		this.frmListaDeLa = frmListaDeLa;
	}

	public JTextField getNombre_usuario_de_hija() {
		return nombre_usuario_de_hija;
	}

	public void setNombre_usuario_de_hija(JTextField nombre_usuario_de_hija) {
		this.nombre_usuario_de_hija = nombre_usuario_de_hija;
	}

	public JTextField getTotal_a_pagar_en_hija() {
		return total_a_pagar_en_hija;
	}

	public void setTotal_a_pagar_en_hija(JTextField total_a_pagar_en_hija) {
		this.total_a_pagar_en_hija = total_a_pagar_en_hija;
	}

	public JTextField getNombre_producto_hija() {
		return nombre_producto_hija;
	}

	public void setNombre_producto_hija(JTextField nombre_producto_hija) {
		this.nombre_producto_hija = nombre_producto_hija;
	}

	public JTextField getCantidad_precio() {
		return unidad_precio;
	}

	public void setCantidad_precio(JTextField cantidad_precio) {
		this.unidad_precio = cantidad_precio;
	}

	public Padre getP() {
		return p;
	}

	public void setP(Padre p) {
		this.p = p;
	}
	
	
}
