/**
 * @author jesus
 *
 */
public class ropa{
	// La primera clase de DAM 
	//1-ATRIBUTOS
	String nombre_tienda;
	char talla;
	String tipo;
	String sexo;
	double precio;
	 String color;
	 boolean disponible;
//2- Toda clase debe tener su contructor, que es el metodo necesario para comtruir los objetos
	
	public ropa(String nombre_tienda,char talla,String tipo,String sexo,double precio,String color,boolean disponible){
	this.nombre_tienda = nombre_tienda;
	this.talla = talla;
	this.tipo = tipo;
	this.sexo = sexo;
	this.precio = precio;
	this.color = color;
	this. disponible = disponible;
	}
// 3. Generar los metodos get y set

	public String getNombre_tienda() {
		return nombre_tienda;
	}

	public void setNombre_tienda(String nombre_tienda) {
		this.nombre_tienda = nombre_tienda;
	}

	public char getTalla() {
		return talla;
	}

	public void setTalla(char talla) {
		this.talla = talla;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
// 4. metdodo para imprimir un objeto completo: toString
	
	public String toString(){
		return getNombre_tienda()+" "+getTalla()+" "+getTipo()+" "+getSexo()+" "+getPrecio()+" "+getColor()+" "+isDisponible();
	}
}

