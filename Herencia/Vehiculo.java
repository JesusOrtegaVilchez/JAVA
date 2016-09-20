/**
 * @author jesus
 *
 */
public class Vehiculo {
	String matricula;
	String marca;
	String modelo;
	double IndiceContaminacion;
	
	public Vehiculo (String matricula,String marca, String modelo, double IndiceContaminacion){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.IndiceContaminacion = IndiceContaminacion;
	}

	
	protected String getMatricula() {
		return matricula;
	}



	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	protected String getMarca() {
		return marca;
	}



	protected void setMarca(String marca) {
		this.marca = marca;
	}



	protected String getModelo() {
		return modelo;
	}



	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}



	protected double getIndiceContaminacion() {
		return IndiceContaminacion;
	}



	protected void setIndiceContaminacion(double indiceContaminacion) {
		IndiceContaminacion = indiceContaminacion;
	}



	public boolean esContaminante() {
		
		boolean resultado = false;
		if(getIndiceContaminacion() > 50 )
			resultado =  true;
		return resultado;
	}

	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", IndiceContaminacion="
				+ IndiceContaminacion + "]";
	}
	
}
