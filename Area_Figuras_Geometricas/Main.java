/**
 * @author jesus
 *
 */
public class Main {
	public static void main(String[] args){
		Circunferencia c1 = new Circunferencia(3.5);
		double resultado = c1.area_circulo();
		System.out.println("El area del circulo es: "+resultado); 
		
		Cuadrado quad1 = new Cuadrado(2);
		double resultado2 = quad1.area_cuadrado();
		System.out.println("El area del cuadrado es: "+ resultado2);
		
		Triangulo tri1 = new Triangulo(4,2);
		double resultado3 =  tri1.area_triangulo();
		System.out.println("El area del triangulo es: "+resultado3);
		
		Trapecio trap1 = new Trapecio(4,2,2);
		double resultado4 = trap1.areaTrapecio();
		System.out.println("El area del trapecio es: "+ resultado4);
		
		Rombo romb1 = new Rombo(8,7);
		double resultado5 = romb1.area_rombo();
		System.out.println("El area del rombo es: " + resultado5);
	}
}
