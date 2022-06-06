package at.campus02.musikanten;

public class Hahn extends  Musikant {
	protected int flugWeite;
	public Hahn(int aB, Instrument i , int flugWeite) {
		super(aB,i);
		this.flugWeite=flugWeite;

	}

	public int getFlugWeite() {
		return flugWeite;
	}

	@Override
	public int verscheucheRaeuber() {
		int erg =0;
		if(flugWeite<2){
			//ovdje ne moze se sa spielmusic dobiti moram getLautstarke
			erg=(int)Math.floor(instrument.getLautstaerke());
		}
		else if(flugWeite==2){
			erg=6;
		}
		else if(flugWeite==3){
			erg=5;
		}
		else if(flugWeite==4){
			erg=4;
		}
		else if(flugWeite==5){
			erg=3;
		}
		else if(flugWeite==6){
			erg=2;
		}
		else if(flugWeite>6){
			erg=1;
		}
		return erg;
	}

	@Override
	public double spieleMusic() {
		double laut=0;
		laut= (instrument.getLautstaerke()+2)/flugWeite;
		return laut;
	}

	@Override
	public String toString() {
		return "Hahn " + flugWeite +":"+
				super.toString();

	}
}
