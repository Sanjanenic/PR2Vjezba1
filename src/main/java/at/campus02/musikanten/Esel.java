package at.campus02.musikanten;

public class Esel extends Musikant {
	protected double trittkraft;
	public Esel(int aB, Instrument i, double trittkraft) 
	{
		super(aB,i );
     this.trittkraft=trittkraft;
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	@Override
	public int verscheucheRaeuber() {
		int erg=0;
		erg=(int)Math.floor(getTrittkraft()*getAnzahlBeine());

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
		return "Esel " +trittkraft+
				super.toString();

	}
}
