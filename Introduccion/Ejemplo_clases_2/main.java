/**
 * @author jesus
 *
 */
public class Main {
public static void main(String[] args) {
	Impresora Impresora1 = new Impresora(100,"hp",false,'8',50.00,"c500");
	Impresora1.setPrecio(43.50);
	System.out.println(Impresora1.toString());
	}
}
