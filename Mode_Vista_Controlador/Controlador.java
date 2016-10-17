/**
 * 
 */
package Modelo_vista_controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jesus
 *
 */
public class Controlador implements ActionListener {
	public Modelo modelo;
	public Calculadora vista;
	public Controlador(Modelo modelo, Calculadora vista) {
		super();
		this.modelo = modelo;
		this.vista = vista;
		addListener(this);
	}
	
	private void addListener(Controlador controlador) {
		// TODO Auto-generated method stub
		vista.getButton().addActionListener(controlador);
		vista.getButton_1().addActionListener(controlador);
		vista.getBtnC().addActionListener(controlador);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double operando1 = Double.parseDouble(vista.getTextField().getText());
		double operando2 = Double.parseDouble(vista.getTextField_1().getText());
		
		
		if(e.getSource()==vista.getButton()){
			//Boton suma
			double suma = modelo.sumar(operando1, operando2);
			vista.getTextField_2().setText(String.valueOf(suma));
		}
		if(e.getSource() == vista.getButton_1()){
			//Boton resta
			double resta = modelo.restar(operando1, operando2);
			vista.getTextField_2().setText(String.valueOf(resta));
		}
		if(e.getSource() == vista.getBtnC()){
			//boton borrar
			vista.getTextField().setText("");
			vista.getTextField_1().setText("");
			vista.getTextField_2().setText("");
		}
		
	}
	
	

}
