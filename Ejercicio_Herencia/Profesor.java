/**
 * @author jesus
 *
 */
public class Profesor extends Persona{//extends "vincula cada clase con la clase principal Persona 
	//Clase Profesor y su atributo
	double salario;
	
	public Profesor(String DNI, String nombre, String apellidos,boolean miembro,boolean tutor,double salario){
		//constructor
		super(DNI,nombre,apellidos,miembro,tutor);
		this.salario = salario;
	}
	//Metodos GET Y SET

	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Metodo para imprimir el objeto completo

	public String toString() {
		return "Profesor [salario=" + salario + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", miembro=" + miembro + ", tutor=" + tutor + "]";
	}

	
	
	
}
