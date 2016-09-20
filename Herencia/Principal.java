/**
 * @author jesus
 *
 */
public class Principal {

	public static void main(String[] args) {
		Vehiculo coche1 = new Coche ("BYH9464","FORD","FOCUS",65,false);
		Vehiculo moto1 = new Moto ("MP9875 BL","HONDA","XR",85,14);
		Vehiculo camion1 = new Camion("GFT4561","MERCEDES-BENZ","ENGINE4",23,600);
		
		System.out.println("DATOS:"+coche1.toString());
		System.out.println("Es contaminante? "+coche1.esContaminante());
		System.out.println("DATOS:"+camion1.toString());
		System.out.println("Es contaminante? "+camion1.esContaminante());
		System.out.println("DATOS:"+moto1.toString());
		System.out.println("Es contaminante?"+moto1.esContaminante());
		

	}

}
