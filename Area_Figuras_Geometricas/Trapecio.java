/**
 * @author jesus
 *
 */
//atributos
public class Trapecio {
	double base_mayor;
	double base_menor;
	double altura;
	//constructor
	public Trapecio(double base_mayor,double base_menor, double altura){
		this.base_mayor = base_mayor;
		this.base_menor = base_menor;
		this.altura = altura;
	}
	//getters y setters

	public double getBase_mayor() {
		return base_mayor;
	}

	public void setBase_mayor(double base_mayor) {
		this.base_mayor = base_mayor;
	}

	public double getBase_menor() {
		return base_menor;
	}

	public void setBase_menor(double base_menor) {
		this.base_menor = base_menor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	//objeto
	public String toString(){
		return getBase_mayor()+" "+getBase_menor()+" "+getAltura();
	}
//5- otros metodos
	public double areaTrapecio(){
		double total = ((getBase_mayor() + getBase_menor()) / 2) * getAltura();
		return total;
	}
}
