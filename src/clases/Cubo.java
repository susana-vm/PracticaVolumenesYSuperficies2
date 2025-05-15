package clases;

public class Cubo {
	
	int lado;
	
	public Cubo () {
		this.lado=1;
	}
	
	public Cubo (int lado) {
		if(lado<=0) {
			throw new IllegalArgumentException("El numero debe ser mayor a 0");
		}
		this.lado=lado;
		
	}
	
	public double superficie() {
		double superficie=6*(this.lado*this.lado);
		return superficie;
	}
	
	public double volumen() {
		double volumen=(this.lado*this.lado*this.lado);
		return volumen;
	}
	

}
