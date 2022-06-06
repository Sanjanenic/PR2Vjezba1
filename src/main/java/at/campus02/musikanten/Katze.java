package at.campus02.musikanten;

public class Katze extends  Musikant {
	protected double kratzKraft;
	
	public Katze(int aB, Instrument i , double kratzKraft) {
		super(aB,i);
		this.kratzKraft=kratzKraft;

	}

	public double getKratzKraft() {
		return kratzKraft;
	}

	@Override
	public int verscheucheRaeuber() {
		int erg=0;
		if(getAnzahlBeine()==4){
			erg = (int)Math.floor(kratzKraft);
		}
		else if(getAnzahlBeine()==3){
			erg = ((int)Math.floor(kratzKraft))/2;
		}
		else if(getAnzahlBeine()<=2){
			erg=1;
		}
		return erg;
	}

	@Override
	public double spieleMusic() {
		double laut=0;
		laut= instrument.getLautstaerke();
		return laut;
	}

	@Override
	public String toString() {
		return "Katze " +kratzKraft+
				super.toString();
	}
}
