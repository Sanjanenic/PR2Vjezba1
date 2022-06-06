package at.campus02.musikanten;

public class  Hund extends Musikant {
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(aB,i);
		this.bellLautstaerke=bellLautstaerke;

	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}

	@Override
	public int verscheucheRaeuber() {
		int erg = 0;


		if (bellLautstaerke > instrument.getLautstaerke()){
			erg = (int) Math.floor(bellLautstaerke);
		} else  {
			erg = (int) Math.floor(instrument.getLautstaerke());

		}
		return erg;
	}

	@Override
	public double spieleMusic() {
		double laut=0;
		laut=(instrument.getLautstaerke()+bellLautstaerke)/2;
		return laut;
	}

	@Override
	public String toString() {
		return "Hund " + bellLautstaerke+
				super.toString();

	}
}
