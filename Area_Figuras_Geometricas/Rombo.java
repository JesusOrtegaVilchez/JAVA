/**
 * @author jesus
 *
 */
public class Rombo {
	double diagonal_mayor;
	double diagonal_menor;
		
	public Rombo(double diagonal_mayor, double diagonal_menor){
		this.diagonal_mayor = diagonal_mayor;
		this.diagonal_menor = diagonal_menor;
	}

	public double getDiagonal_mayor() {
		return diagonal_mayor;
	}

	public void setDiagonal_mayor(double diagonal_mayor) {
		this.diagonal_mayor = diagonal_mayor;
	}

	public double getDiagonal_menor() {
		return diagonal_menor;
	}

	public void setDiagonal_menor(double diagonal_menor) {
		this.diagonal_menor = diagonal_menor;
	}
	
	public String toString(){
		return getDiagonal_mayor()+" "+getDiagonal_menor();
	}
	
	public double area_rombo(){
		double total = (getDiagonal_mayor()*getDiagonal_menor())/2;
			return total;
	}

}
