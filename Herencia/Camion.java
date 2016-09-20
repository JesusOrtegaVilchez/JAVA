public class Camion extends Vehiculo {
	
		int numruedas;


	public Camion (String matricula,String marca, String modelo, double IndiceContaminacion,int numruedas){
		super(matricula,marca,modelo,IndiceContaminacion);
		this.numruedas = numruedas;
	}


	public int getNumruedas() {
		return numruedas;
	}

	public void setNumruedas(int numruedas){
		this.numruedas = numruedas;
	}


	@Override
	public String toString() {
		return "Camion [numruedas=" + numruedas + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", IndiceContaminacion=" + IndiceContaminacion + "]";
	}



}
