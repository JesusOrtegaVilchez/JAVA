/**
 * @author jesus
 *
 */
public class ProfesorESO extends Persona{
	//Clase ProfesorESO con su atributo
	String departamento;

	public ProfesorESO(String DNI, String nombre, String apellidos,boolean miembro,boolean tutor,String departamento){
		//constructor
		super(DNI,nombre,apellidos,miembro,tutor);
		this.departamento = departamento;
	}
	//Metodos Get y Set
	public String getDepartamento() {
		
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	//Metodo para imprimir un objeto completo
	public String toString() {
		return "ProfesorESO [departamento=" + departamento + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos="
				+ apellidos + ", miembro=" + miembro + ", tutor=" + tutor + "]";
	}

	
	
	
}
