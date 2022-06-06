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

		//sa iteratorom ce biti ovako, iterator ne koristi for petlju :
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

			sum= sum+m.spieleMusic();
		}

		erg=sum/quartetlist.size();

		return erg;
	}

	//
	
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
	} 
		return hm;
	}

 //JEDNOSTAVNIJa VARIJANTa PREDHODNE METODE!!!!!!
// 	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
// 	{
// 		HashMap<Integer,Integer>erg = new HashMap<>();
// 		int einz=0;
// 		int zwei=0;
// 		int drei=0;
// 		int vier=0;
// 		for( Musikant m : musikanten){
// 			if(m.getAnzahlBeine()==1){
// 				einz++;
// 			}
// 			else if(m.getAnzahlBeine()==2) {
// 				zwei++;
// 			}
// 			else if(m.getAnzahlBeine()==3){
// 				drei ++;

// 			}
// 			else if(m.anzahlBeine==4){
// 				vier++;
// 			}

// 			if(einz > 0)
// 				erg.put(1,einz);
// 			if(zwei > 0)
// 				erg.put(2,zwei);
// 			if(drei > 0)
// 				erg.put(3,drei);

// 			if(vier >0)
// 				erg.put(4,vier);
// 		}
// 		return erg;
// 	}

	public void printLautStaerkeAbsteigend() {
		Collections.sort(quartetlist, new LautstaerkeComparator());
		quartetlist.toString();

	}
}
