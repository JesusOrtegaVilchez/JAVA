/**
 * @author jesus
 *
 */
	public class ProfesorFP extends Persona{
		//clase Profesor con su atributo
		int numVisitas;
	public ProfesorFP(String DNI, String nombre, String apellidos,boolean miembro,boolean tutor,int numVisitas){
		//CONSTRUCTOR
		super(DNI,nombre,apellidos,miembro,tutor);
		this.numVisitas = numVisitas;
	}
	//Metodos GET Y SET
	public int getNumVisitas() {
		return numVisitas;
	}
	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}
	//Metodo para imprimir el objeto completo
	public String toString() {
		return "ProfesorFP [numVisitas=" + numVisitas + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", miembro=" + miembro + ", tutor=" + tutor + "]";
	}

	

}
