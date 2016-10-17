/**
 * 
 */
package Modelo_vista_controlador;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




/**
 * @author jesus
 *
 */

public class Principal{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora vista =  new Calculadora();
		Modelo modelo = new Modelo();
		Controlador d = new Controlador(modelo,vista);
	}

}
