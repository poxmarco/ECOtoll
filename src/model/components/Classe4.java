package model.components;

public class Classe4 extends Veicolo {


	public Classe4(String targa, String modello, String marca, int anno, int peso, double co22, int assi,
			ClasseAmbienale classeAmbientale2, int altezza) {
		super(targa, modello, marca, anno, peso, co22, assi, classeAmbientale2, altezza);
		// TODO Auto-generated constructor stub
	}

	public Classe4() {
		super();
		
	}

	public Classe4(Veicolo v) {
		this.targa = v.targa;
		this.modello = v.modello;
		this.marca = v.marca;
		this.anno = v.anno;
		this.peso = v.peso;
		this.co2 = v.co2;
		this.assi = v.assi;
		this.classeAmbientale = null;
		this.altezza = v.altezza;
		this.setClasseAmbientale();
		this.setClasseVeicolo(model.components.classeVeicolo.D);
	}

	
	@Override
	public classeVeicolo getClasseVeicolo() {
		
		return super.getClasseVeicolo();
	}

	@Override
	public void setClasseAmbientale() {
		
		super.setClasseAmbientale();
	}

	@Override
	public int checkClasseV() {
		int i=super.checkClasseV();
		
		return i;
		
	}

	@Override
	public Veicolo factory() {
		
		return super.factory();
	}

	
	@Override
	public void setClasseVeicolo() {
	
		super.setClasseVeicolo();
	}

	@Override
	public ClasseAmbienale getClasseAmbientale() {
	
		return super.getClasseAmbientale();
	}


	
	

}
