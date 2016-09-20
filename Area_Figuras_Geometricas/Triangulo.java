/**
 * @author jesus
 *
 */
//atributos
public class Triangulo {
	double base;
	double altura;
//constructores
	public Triangulo(double base, double altura){
		this.base =  base;
		this.altura =  altura;
	}
//getters y setter
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
//metodo 
	public String toString(){
		return getAltura()+" "+getBase();
	}
	//5- otros metodos
		public double area_triangulo(){
			double total = (getBase() * getAltura()) / 2; 
			return total;
		}
}
