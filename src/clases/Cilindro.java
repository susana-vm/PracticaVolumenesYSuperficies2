package clases;

public class Cilindro {
	int radio;
	int altura;
	
	public Cilindro() {
		this.radio=1;
		this.altura=1;
	}
	
	public Cilindro(int radio, int altura) {
		if((this.radio<=0)||(this.altura<=0)) {
			throw new IllegalArgumentException("El radio y la altura deben ser mayores que cero");
		}
		this.radio=radio;
		this.altura=altura;
	}
	
	public double superficie() {
		double superficie= ((2 * 3.14) * (this.radio*this.radio)) + ((2 * 3.14) * (this.radio*this.altura)) ;
		
		return superficie;
	}
	
	public double volumen() {
		double volumen= (3.14 * (this.radio*this.radio)) * this.altura;
		return volumen;
	}
	

}
