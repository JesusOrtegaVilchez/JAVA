/**
 * @author jesus
 *
 */
  public class Moto extends Vehiculo {
	
	  int cilindrada;


  public Moto (String matricula,String marca, String modelo, double IndiceContaminacion,int cilindrada){
	  super(matricula,marca,modelo,IndiceContaminacion);
	  this.cilindrada = cilindrada;
  }



  public int getCilindrada() {
	  return cilindrada;
  }


  public void setCilindrada(int cilindrada) {
  	this.cilindrada = cilindrada;
  }

  public String toString() {
	  return "Moto [cilindrada=" + cilindrada + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
			+ ", IndiceContaminacion=" + IndiceContaminacion + "]";
  }

}
