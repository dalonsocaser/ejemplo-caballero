package es.caser.spring.caballeros;

import es.caser.spring.misiones.Mision;

public class CaballeroSanJorge implements Caballero {
	private Mision mision;
	public CaballeroSanJorge(Mision mision){
		this.mision=mision;
	}
	public void iniciarMision() {
		mision.iniciar();		
	}

}
