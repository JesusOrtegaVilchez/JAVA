/**
 * @author jesus
 *
 */
public class Impresora {
	//1- atributos
	int foliosMaximos;
	String marca;
	boolean laser;
	char color;
	double precio;
	String modelo;
	//2- metodo constructor
	public Impresora(int foliosMaximos,String marca,boolean laser,char color,double precio,String modelo){
		this.foliosMaximos = foliosMaximos;
		this.marca = marca;
		this.laser= laser;
		this.color = color;
		this.precio = precio;
		this.modelo =  modelo;
		
	}
	//3- getters y setters
	public int getFoliosMaximos() {
		return foliosMaximos;
	}
	public void setFoliosMaximos(int foliosMaximos) {
		this.foliosMaximos = foliosMaximos;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isLaser() {
		return laser;
	}
	public void setLaser(boolean laser) {
		this.laser = laser;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	// 4. Imprimer objeto completo
	
	public String toString(){
		return getFoliosMaximos()+" "+getMarca()+" "+isLaser()+" "+getColor()+""+getPrecio()+" "+getModelo();
	}
}
