/**
 * @author jesus
 *
 */

public class Circunferencia {
	// 1- atributos
	double radio;
	
	// 2- constructor
	
	public Circunferencia(double radio){
		this.radio = radio;
	}
	//3- getter y setter
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public String toString(){
		return getRadio()+" ";
	}
	
	//5- otros metodos
	public double area_circulo(){
		double total = Math.PI * getRadio() * getRadio(); // para sacar el valor de pi se recurre a la funcion math
		return total;
	}

}
