package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {
 private ArrayList<Musikant> quartetlist= new ArrayList<>();

	public Quartett() {
		this.quartetlist = quartetlist;
	}

	public void add(Musikant m) {
		quartetlist.add(m);
	}
	public boolean istQuartett() {

		boolean isQ = true;
		if (quartetlist.size() == 4) {
			isQ = true;
		} else {
			isQ = false;
		}
		return isQ;
	}
	
	public int gemeinsamRaeuberVerscheucht()
	{
		int sum=0;
//		//metoda bez iteratora, sa vor each petljom
//		for (Musikant m : quartetlist) {
//			sum= sum+m.verscheucheRaeuber();
//		}

		//sa iteratorom ce biti ovako, iterator ne koristi petlju :
		Iterator<Musikant> i = quartetlist.iterator();
		while(i.hasNext()) {
			sum = sum + i.next().verscheucheRaeuber();
		}
		return sum;
	}
	public double durchschnittlicheLautstaerke()
	{
		double sum=0;
		double erg=0;


		for (Musikant m : quartetlist) {

			sum= sum+m.spieleMusic();//TODO zato ovdje radi sa spielmusic ne trazi lautstarke a drugdje ne radi
		}

		erg=sum/quartetlist.size();

		return erg;
	}

	//bis hier muss ich perfect machen können!
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{
		ArrayList<Musikant> inBereich = new ArrayList<>();
		for(Musikant m : quartetlist) {
			if (m.spieleMusic()>von && m.spieleMusic()<bis){
				inBereich.add(m);
			}
		}
		return inBereich;
	}
	//HASHMAP Beispiel:
	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (Musikant m : quartetlist){
			//trebam pomocnu varijablu koja ce svaki put izracunati broj nogu
			int beine = m.getAnzahlBeine();

			//pocinjem sa brojanjem u svakoj kategoriji po broju nogu
			if(hm.containsKey(beine)){
				hm.put(beine, hm.get(beine) + 1);  //ovo je ???
			}
			else
			{
				hm.put(beine, 1);
			}
		}  //?????OBJASNITI METODU; NAPISATI JEDNOSTAVNIJU VARIJANTU!!!!!!
		return hm;
	}



	public void printLautStaerkeAbsteigend() {
		Collections.sort(quartetlist, new LautstaerkeComparator());
		quartetlist.toString();

	}
}
