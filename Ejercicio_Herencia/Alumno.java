/**
 * @author jesus
 *
 */
public class Alumno extends Persona {
	//clase Alumno y su atributo
	int  numAsignaturas;
	
	public Alumno(String DNI, String nombre, String apellidos,boolean miembro,boolean tutor,int numAsignaturas){
		//contructor
		super(DNI,nombre,apellidos,miembro,tutor);
		this.numAsignaturas = numAsignaturas;
	}
	//Metodos GET y SET
	public int getNumAsignaturas() {
		return numAsignaturas;
	}

	public void setNumAsignaturas(byte numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}
	//Metodo para imprimir un objeto completo
	public String toString() {
		return "Alumno [numAsignaturas=" + numAsignaturas + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", miembro=" + miembro + ", tutor=" + tutor + "]";
	}
	
	

}
