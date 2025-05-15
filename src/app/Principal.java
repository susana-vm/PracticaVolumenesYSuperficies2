package app;

import clases.Cilindro;
import clases.Cubo;

public class Principal {

	public static void main(String[] args) {
		
		
		int ale = (int)(Math.random() * 10) + 1;
		int ale2 = (int)(Math.random() * 10) + 1;
		
        Cubo c1 = new Cubo(ale);
        Cubo c2 = new Cubo(ale2);
        
        c1.superficie();
        c2.superficie();
        
        c1.volumen();
        c2.volumen();
        
        
        int radio = (int)(Math.random() * 10) + 1;
		int altura = (int)(Math.random() * 10) + 1;
		
        Cilindro cl1 = new Cilindro(radio, altura);
        Cilindro cl2 = new Cilindro(radio, altura);
        
        cl1.superficie();
        cl2.superficie();
        
        cl1.volumen();
        cl2.volumen();
        
        
		// TODO Auto-generated method stub

	}

}
