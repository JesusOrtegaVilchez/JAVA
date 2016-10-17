package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DecimalFormat;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JMenu;

public class Parte2{

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField text_equipos;
	//propiedades de la lista
	public DefaultListModel lista; 
	public DefaultListModel lista2;
	//propiedades de la cuenta atras, uso byte y short para ahorrar espacio de memoria son mas eficientes que int 
	private byte centesimas = 0;
	private byte segundos = 0;
	private short minutos = 10;

	private DecimalFormat timeFormatter;
	private Timer timer;
	private Parte2 p;
	private JTextField text_miembros;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parte2 window = new Parte2();
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
	public Parte2() {
		p=this;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		//frame.setIconImage(Toolkit.getDefaultToolkit().getImage("fondoCalculadora.jpg"));
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 750, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel timelabel = new JLabel("10:00");
		timelabel.setAutoscrolls(true);
		timelabel.setBackground(Color.WHITE);
		timelabel.setForeground(Color.WHITE);
		timelabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		timelabel.setHorizontalAlignment(SwingConstants.CENTER);
		timelabel.setBounds(53, 271, 192, 68);
		frame.getContentPane().add(timelabel);
		JLabel lblNewLabel = new JLabel("Miembros del Equipo Seleccinado");
		JLabel lblJugadorjugadorjugadoretc = new JLabel("Jugador1,jugador2,jugador3...etc");
	
		
		JLabel lblTipoDeCampo = new JLabel("Tipo de campo");
		lblTipoDeCampo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeCampo.setForeground(Color.WHITE);
		lblTipoDeCampo.setBounds(269, 119, 102, 21);
		frame.getContentPane().add(lblTipoDeCampo);
		
		JLabel lblLimiteJugadores = new JLabel("Limite Jugadores");
		lblLimiteJugadores.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLimiteJugadores.setForeground(Color.WHITE);
		lblLimiteJugadores.setBounds(270, 52, 126, 21);
		frame.getContentPane().add(lblLimiteJugadores);
		
		JRadioButton selected_tenis = new JRadioButton("tenis");
		buttonGroup.add(selected_tenis);
		selected_tenis.setBackground(new Color(0, 0, 51));
		selected_tenis.setForeground(Color.WHITE);
		selected_tenis.setBounds(269, 200, 117, 23);
		frame.getContentPane().add(selected_tenis);
		
		JRadioButton selected_fut7 = new JRadioButton("Cesped Fut 7");
		buttonGroup.add(selected_fut7);
		selected_fut7.setForeground(Color.WHITE);
		selected_fut7.setBackground(new Color(0, 0, 51));
		selected_fut7.setBounds(269, 174, 117, 23);
		frame.getContentPane().add(selected_fut7);
		
		JRadioButton selected_sala = new JRadioButton("sala");
		selected_sala.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		
		buttonGroup.add(selected_sala);
		selected_sala.setForeground(Color.WHITE);
		selected_sala.setBackground(new Color(0, 0, 51));
		selected_sala.setBounds(269, 226, 117, 23);
		frame.getContentPane().add(selected_sala);
		
		
		JRadioButton selected_fut11 = new JRadioButton(" Cesped Fut 11");
		
		selected_fut11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		buttonGroup.add(selected_fut11);
		selected_fut11.setBackground(new Color(0, 0, 51));
		selected_fut11.setForeground(Color.WHITE);
		selected_fut11.setBounds(269, 147, 117, 23);
		frame.getContentPane().add(selected_fut11);
		
		JComboBox vs_type = new JComboBox();
		vs_type.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(vs_type.getSelectedIndex() == 1){
					timelabel.setText(timeFormatter.format(minutos=90)+":"+timeFormatter.format(segundos)+"."+timeFormatter.format(centesimas));
					selected_fut11.setEnabled(true);
					selected_sala.setEnabled(false);
					selected_fut7.setEnabled(false);
					selected_tenis.setEnabled(false);
					selected_fut11.setSelected(true);
					
				}
				else if(vs_type.getSelectedIndex() == 2){
					timelabel.setText(timeFormatter.format(minutos=50)+":"+timeFormatter.format(segundos)+"."+timeFormatter.format(centesimas));
					selected_fut11.setEnabled(false);
					selected_sala.setEnabled(false);
					selected_fut7.setEnabled(true);
					selected_tenis.setEnabled(false);
					selected_fut7.setSelected(true);
				}
				else if(vs_type.getSelectedIndex() == 3){
					timelabel.setText(timeFormatter.format(minutos=40)+":"+timeFormatter.format(segundos)+"."+timeFormatter.format(centesimas));
					selected_fut11.setEnabled(false);
					selected_sala.setEnabled(true);
					selected_fut7.setEnabled(false);
					selected_tenis.setEnabled(false);
					selected_sala.setSelected(true);
				}
				else if(vs_type.getSelectedIndex() == 4 ||vs_type.getSelectedIndex() == 5){
					timelabel.setText(timeFormatter.format(minutos=00)+":"+timeFormatter.format(segundos)+"."+timeFormatter.format(centesimas));
					selected_fut11.setEnabled(false);
					selected_sala.setEnabled(false);
					selected_fut7.setEnabled(false);
					selected_tenis.setEnabled(true);
					selected_tenis.setSelected(true);
				}
			}
		});
		vs_type.setModel(new DefaultComboBoxModel(new String[] {"", "11 vs 11", "7 vs 7", "5 vs 5", "2 vs 2 ", "1 vs 1"}));
		vs_type.setBounds(270, 84, 89, 20);
		frame.getContentPane().add(vs_type);
		
		JButton agregar_equipo = new JButton("ADD");
		agregar_equipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		agregar_equipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!text_equipos.getText().trim().equals("")){//si el texto no es nulo
					lista.addElement(text_equipos.getText().trim().toUpperCase());//añadimos el elemento en mayusculas
					text_equipos.setText("");//borramos lo escrito
					text_equipos.grabFocus();//para volver a poner el cursor en el Jtexfield
					
				}
				else{
					text_equipos.setBackground(Color.RED);//si intenta añadir sin texto el textfield se pondra de color rojo
					//escribe_equipo.setText("Escriba un equipo");//se da la orden para que se use correctamente, aunque provoca un bug y si se le vuelve a dar a añadir el texto se añade a la lista
				}
			}
		});
		agregar_equipo.setBounds(170, 66, 65, 23);
		frame.getContentPane().add(agregar_equipo);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 120, 144, 134);
		frame.getContentPane().add(scrollPane);
		
		lista = new DefaultListModel();
		JList lista_equipos = new JList();
		scrollPane.setViewportView(lista_equipos);
		lista_equipos.setModel(lista);
		
		JButton borrar_equipo = new JButton("DEL");
		borrar_equipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		borrar_equipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lista.getSize()!=0){ //si la lista tiene mas de 1 elemento
					if(lista_equipos.getSelectedIndex()!=-1){//se entiende que el valor -1 es equivalente a ningun valor seleccionado
						lista.removeElementAt(lista_equipos.getSelectedIndex());//borra elemento seleccionado
						text_equipos.grabFocus();//volvemos al tener el cursor en el Jtexfield
					}
				}
			}
		});
		
		
		borrar_equipo.setBounds(170, 122, 65, 23);
		frame.getContentPane().add(borrar_equipo);
		
		JButton limpiar_lista_equipo = new JButton("CLR");
		limpiar_lista_equipo.setFont(new Font("Tahoma", Font.BOLD, 11));
		limpiar_lista_equipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lista.getSize()!=0){//limpia la lista si hay elementos en ella
					lista.clear();
					text_equipos.grabFocus();
				}
			}
		});
		
		
		
		JLabel lblTurnos = new JLabel("Tiempo de Juego");
		lblTurnos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTurnos.setForeground(new Color(255, 255, 255));
		lblTurnos.setBounds(102, 264, 111, 14);
		frame.getContentPane().add(lblTurnos);
		limpiar_lista_equipo.setBounds(170, 154, 65, 23);
		frame.getContentPane().add(limpiar_lista_equipo);
		
		
		JLabel lblListaDeEquipos = new JLabel("Lista de Equipos");
		lblListaDeEquipos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblListaDeEquipos.setForeground(Color.WHITE);
		lblListaDeEquipos.setBounds(21, 100, 111, 14);
		frame.getContentPane().add(lblListaDeEquipos);
		
		JButton boton_empezar = new JButton("Empezar");
		boton_empezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		boton_empezar.setFont(new Font("Tahoma", Font.BOLD, 10));
		boton_empezar.setBounds(6, 340, 102, 23);
		frame.getContentPane().add(boton_empezar);
		
		
		JButton boton_parar = new JButton("Parar");
		boton_parar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
			}
		});
		
		JButton btnNewButton = new JButton("Validar Ticket");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ticket_validado r = new Ticket_validado(p);//dentro de un evento no se perimite crear una instancia de la clase
				r.getFrmListaDeEquipos().setModal(true);
				r.getFrmListaDeEquipos().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(563, 334, 144, 34);
		
		
		frame.getContentPane().add(btnNewButton);
		boton_parar.setFont(new Font("Tahoma", Font.BOLD, 10));
		boton_parar.setBounds(109, 340, 89, 23);
		frame.getContentPane().add(boton_parar);
		
		text_equipos = new JTextField();
		text_equipos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {//al pintar el jtextfield de rojo no vuelve a su estado normal porque el focus esta por encima de esta manera el textfield vuelve a estar blanco
				text_equipos.setBackground(Color.WHITE);
			}
		});
		text_equipos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String texto1 = blanco.getText();
			}
		});
		
		JButton boton_reiniciar = new JButton("Reiniciar");
		boton_reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timer.stop();
				centesimas = 0;
				segundos=0;
				minutos = 00;
				
				timelabel.setText(timeFormatter.format(minutos)+":"+timeFormatter.format(segundos)+"."+timeFormatter.format(centesimas));
			}
		});
		boton_reiniciar.setFont(new Font("Tahoma", Font.BOLD, 10));
		boton_reiniciar.setBounds(199, 340, 89, 23);
		frame.getContentPane().add(boton_reiniciar);
		
		text_equipos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		text_equipos.setBounds(21, 66, 144, 23);
		frame.getContentPane().add(text_equipos);
		text_equipos.setColumns(10);
		
		timeFormatter = new DecimalFormat("00");
		
		timer = new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(centesimas > 0){
					centesimas --;
				}
				else{
					if(segundos == 0 && minutos == 0){
						timer.stop();
					}
					else
						if(minutos > 0){
							minutos --;
							segundos = 59;
							centesimas = 99;							
						}
				}
				timelabel.setText(timeFormatter.format(minutos)+":"+timeFormatter.format(segundos)+"."+timeFormatter.format(centesimas));
			}
		});
		
		timelabel.setText("00:00.00");
		frame.getContentPane().add(timelabel);
		
		JLabel lblIntroduceElNombre = new JLabel("Introduce el nombre de tu equipo");
		lblIntroduceElNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroduceElNombre.setForeground(Color.WHITE);
		lblIntroduceElNombre.setBounds(21, 44, 192, 14);
		frame.getContentPane().add(lblIntroduceElNombre);
		
		JCheckBox modonocturno = new JCheckBox("Modo Nocturno");
		modonocturno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(!modonocturno.isSelected()){
					frame.getContentPane().setBackground(new Color(215, 214, 214));
					lblIntroduceElNombre.setForeground(Color.BLACK);
					lblListaDeEquipos.setForeground(Color.BLACK);
					timelabel.setForeground(Color.BLACK);
					lblTurnos.setForeground(new Color(0, 0, 0));
					lblLimiteJugadores.setForeground(Color.BLACK);
					lblTipoDeCampo.setForeground(Color.BLACK);
					modonocturno.setBackground(new Color(215, 214, 214));
					modonocturno.setForeground(Color.BLACK);
					selected_fut11.setBackground(new Color(215, 214, 214));
					selected_fut11.setForeground(Color.BLACK);
					selected_fut7.setForeground(Color.BLACK);
					selected_fut7.setBackground(new Color(215, 214, 214));
					selected_tenis.setBackground(new Color(215, 214, 214));
					selected_tenis.setForeground(Color.BLACK);
					selected_sala.setForeground(Color.BLACK);
					selected_sala.setBackground(new Color(215, 214, 214));
					lblNewLabel.setForeground(Color.BLACK);
					lblJugadorjugadorjugadoretc.setForeground(Color.BLACK);
					
				}
				else if(modonocturno.isSelected()){
					
					frame.getContentPane().setBackground(new Color(0, 0, 51));
					lblIntroduceElNombre.setForeground(Color.WHITE);
					lblListaDeEquipos.setForeground(Color.WHITE);
					timelabel.setForeground(Color.WHITE);
					lblTurnos.setForeground(new Color(255, 255, 255));
					lblLimiteJugadores.setForeground(Color.WHITE);
					lblTipoDeCampo.setForeground(Color.WHITE);
					modonocturno.setBackground(new Color(0, 0, 51));
					modonocturno.setForeground(Color.WHITE);
					selected_fut11.setBackground(new Color(0, 0, 51));
					selected_fut11.setForeground(Color.WHITE);
					selected_fut7.setForeground(Color.WHITE);
					selected_fut7.setBackground(new Color(0, 0, 51));
					selected_tenis.setBackground(new Color(0, 0, 51));
					selected_tenis.setForeground(Color.WHITE);
					selected_sala.setForeground(Color.WHITE);
					selected_sala.setBackground(new Color(0, 0, 51));
					lblNewLabel.setForeground(Color.WHITE);
					lblJugadorjugadorjugadoretc.setForeground(Color.WHITE);
				}
			}
		});
		modonocturno.setSelected(true);
		modonocturno.setBackground(new Color(0, 0, 51));
		modonocturno.setFont(new Font("Tahoma", Font.BOLD, 11));
		modonocturno.setForeground(Color.WHITE);
		modonocturno.setBounds(6, 373, 136, 23);
		frame.getContentPane().add(modonocturno);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 734, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnInicio = new JMenu("ARCHIVO");
		mnInicio.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnInicio.setForeground(Color.DARK_GRAY);
		menuBar.add(mnInicio);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		mnInicio.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Acerca de.");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llamada1();
			}

			private void llamada1() {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Has entrado en lista de equipos");
				//se intancia el numero frame
				new Ticket_validado(p).setVisible(true);
				frame.setEnabled(false);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		mnInicio.add(mntmSalir);
		
		JMenu mnEditar = new JMenu("EDITAR");
		mnEditar.setFont(new Font("Segoe UI", Font.BOLD, 11));
		mnEditar.setForeground(Color.DARK_GRAY);
		menuBar.add(mnEditar);
		
		//JLabel lblNewLabel = new JLabel("Miembros del Equipo Seleccinado");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(415, 44, 220, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(415, 119, 193, 196);
		frame.getContentPane().add(scrollPane_1);
		
		lista2 = new DefaultListModel();
		JList lista_miembros = new JList();
		scrollPane_1.setViewportView(lista_miembros);
		lista_miembros.setModel(lista2);
		
		text_miembros = new JTextField();
		text_miembros.setBounds(416, 67, 192, 20);
		frame.getContentPane().add(text_miembros);
		text_miembros.setColumns(10);
		
		JButton añadir_miembros = new JButton("ADD");
		añadir_miembros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!text_miembros.getText().trim().equals("")){//si el texto no es nulo
					lista2.addElement(text_miembros.getText().trim().toUpperCase());//añadimos el elemento en mayusculas
					text_miembros.setText("");//borramos lo escrito
					text_miembros.grabFocus();//para volver a poner el cursor en el Jtexfield
					
				}
				else{
					text_miembros.setBackground(Color.RED);//si intenta añadir sin texto el textfield se pondra de color rojo
					//escribe_equipo.setText("Escriba un equipo");//se da la orden para que se use correctamente, aunque provoca un bug y si se le vuelve a dar a añadir el texto se añade a la lista
				}
			}
		});
				
		añadir_miembros.setBounds(618, 66, 71, 23);
		frame.getContentPane().add(añadir_miembros);
		
	
		
	
		
		JButton borrar_miembros = new JButton("DEL");
		borrar_miembros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(lista2.getSize()!=0){ //si la lista tiene mas de 1 elemento
						if(lista_miembros.getSelectedIndex()!=-1){//se entiende que el valor -1 es equivalente a ningun valor seleccionado
							lista2.removeElementAt(lista_miembros.getSelectedIndex());//borra elemento seleccionado
							text_miembros.grabFocus();//volvemos al tener el cursor en el Jtexfield
						}
					}
			}
		});
		borrar_miembros.setBounds(618, 118, 71, 23);
		frame.getContentPane().add(borrar_miembros);
		
		JButton limpiar_lista_miembros = new JButton("CLR");
		limpiar_lista_miembros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(lista2.getSize()!=0){//limpia la lista si hay elementos en ella
						lista2.clear();
						text_miembros.grabFocus();
					}
			}
		});
		limpiar_lista_miembros.setBounds(618, 154, 71, 23);
		frame.getContentPane().add(limpiar_lista_miembros);
		
		//JLabel lblJugadorjugadorjugadoretc = new JLabel("Jugador1,jugador2,jugador3...etc");
		lblJugadorjugadorjugadoretc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblJugadorjugadorjugadoretc.setForeground(Color.WHITE);
		lblJugadorjugadorjugadoretc.setBounds(414, 90, 194, 14);
		frame.getContentPane().add(lblJugadorjugadorjugadoretc);
		
		
	}
	
	//getters y setters

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getText_equipos() {
		return text_equipos;
	}

	public void setText_equipos(JTextField text_equipos) {
		this.text_equipos = text_equipos;
	}

	public DefaultListModel getLista() {
		return lista;
	}

	public void setLista(DefaultListModel lista) {
		this.lista = lista;
	}

	public DefaultListModel getLista2() {
		return lista2;
	}

	public void setLista2(DefaultListModel lista2) {
		this.lista2 = lista2;
	}

	public byte getCentesimas() {
		return centesimas;
	}

	public void setCentesimas(byte centesimas) {
		this.centesimas = centesimas;
	}

	public byte getSegundos() {
		return segundos;
	}

	public void setSegundos(byte segundos) {
		this.segundos = segundos;
	}

	public short getMinutos() {
		return minutos;
	}

	public void setMinutos(short minutos) {
		this.minutos = minutos;
	}

	public DecimalFormat getTimeFormatter() {
		return timeFormatter;
	}

	public void setTimeFormatter(DecimalFormat timeFormatter) {
		this.timeFormatter = timeFormatter;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public Parte2 getP() {
		return p;
	}

	public void setP(Parte2 p) {
		this.p = p;
	}

	public JTextField getText_miembros() {
		return text_miembros;
	}

	public void setText_miembros(JTextField text_miembros) {
		this.text_miembros = text_miembros;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}
	public void setVisible(boolean b) {
		if(b == true){
			frame.setVisible(true);
		}
		else{
			frame.setVisible(false);
		}
		
	}
}


