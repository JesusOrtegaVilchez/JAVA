/**
 * @author jesus
 *
 */
//atributos
public class Cuadrado {
	double base;
	double altura;
//constructores	
	public Cuadrado(double base){
		this.base =  base;
	}
//getters y setters
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
//objeto

	public String toString(){
	return getBase()+" ";
	}
	//5- otros metodos
		public double area_cuadrado(){
			double total = getBase()*getBase(); // para sacar el valor de pi se recurre a la funcion math
			return total;
		}
}
