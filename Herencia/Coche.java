/**
 * @author jesus
 *
 */
public class Coche extends Vehiculo {

	boolean cuatroXcuatro;

  public Coche(String matricula,String marca, String modelo, double IndiceContaminacion, boolean cuantroXcuatro){
	  super(matricula,marca,modelo,IndiceContaminacion);
	  this.cuatroXcuatro = cuatroXcuatro;
  }

  public boolean isCuatroXcuatro() {
	  return cuatroXcuatro;
  }
  
  public void setCuatroXcuatro(boolean cuatroXcuatro) {
	  this.cuatroXcuatro = cuatroXcuatro;
  }

  public String toString() {
	return "Coche [cuatroXcuatro=" + cuatroXcuatro + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
			+ modelo + ", IndiceContaminacion=" + IndiceContaminacion + "]";
  }
}
