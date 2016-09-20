/**
 * @author jesus
 *
 */
public class Persona {
	//Clase Persona y sus atributos
	//Los atributos comunes se situan en la clase Padre, es asi como funciona la herencia
	String DNI;
	String nombre;
	String apellidos;
	boolean miembro;
	boolean tutor;
	
	public Persona(String DNI, String nombre, String apellidos,boolean miembro, boolean tutor){
		//constructor
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.miembro = miembro;
		this.tutor =  tutor;
	}
	//Metodos GET Y SET en este caso protegidas para que la herencia se lleve a cabo
	protected String getDNI() {
		return DNI;
	}

	protected void setDNI(String dNI) {
		DNI = dNI;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	protected boolean isMiembro() {
		return miembro;
	}


	protected void setMiembro(boolean miembro) {
		this.miembro = miembro;
	}
	
	protected boolean isTutor() {
		return tutor;
	}


	protected void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", miembro=" + miembro
				+ ", tutor=" + tutor + "]";
	}
	//Otro metodo para saber si es miembro 
	public boolean esMiembro(){
		if(isMiembro() == true )
			return true;
		else 
			return false;
	}
}
