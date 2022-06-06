package EventBeispielUE3;

import java.util.ArrayList;
import java.util.HashMap;



    public class EventKalendar {

        private ArrayList<Event> lista = new ArrayList<>();

        public EventKalendar(ArrayList<Event> lista) {

            this.lista = lista;
        }
        public void add( ) {
            for ( Event x : lista ) {
                lista.add(x);

            }

        }
        //  Metoda koja vraca prvi objekat koji ima naslov isti kao u nasem parametru
        public Event getByTitle(String title) {
            Event erg = null;
            for ( Event x : lista ) {
                if(x.getTitle().equals(title)){
                    erg=x;
                    break;  //break prekida for petlju i tako se vraca prvi event za title
                    // ako hocemo zadnji event onda pisemo bez break
                }
            }
            return erg;

        }

        public ArrayList<Event> getByOrt(String ort){
            ArrayList<Event>erg = new ArrayList<>();
            for ( Event x : lista ){
                if(x.getOrt().equals(ort)){
                    erg.add(x);
                }
            }
            return  erg;
        }
        public ArrayList<Event> getByEintrittsPreis(double min, double max){
            ArrayList<Event>erg = new ArrayList<>();
            for ( Event x : lista ){
                if(x.getEntrittpreis()>=min && x.getEntrittpreis()<=max){
                    erg.add(x);
                }
            }
            return erg;
        }
        //kompleksna metoda koja sortira prvo elemente koji imaju ort = paramentru
        //a zatim nalazi najvcu vrijednost u nizu za taj jedan ort
        public Event getMostExpensiveByOrt(String ort){

            ArrayList<Event>pomocna = new ArrayList<>();
            for ( Event x : lista ){
                if(x.getOrt().equals(ort)){
                    pomocna.add(x);
                }
            }

            // Uvijek moramo uzeti prvi clan niza za uporedjivanje, inace baci gresku
            Event erg = pomocna.get(0);

            for(Event x : pomocna ){
                if(erg.getEntrittpreis()<x.getEntrittpreis()){
                    erg=x;
                }
            }

            return erg;
        }
        // racuna prosjek u nizu odabranih elementa po ort
        public double getAvgPreisByOrt(String ort){

            ArrayList<Event>pomocna = new ArrayList<>();
            for ( Event x : lista ){
                if(x.getOrt().equals(ort)){
                    pomocna.add(x);
                }
            }

            double sum=0;
            for(Event x : pomocna ){
                sum = sum+x.getEntrittpreis();
            }
            return  sum/pomocna.size();

        }
        //HASHMAP metoda bez parametara, vraca u mapi ort kao kljuc i broj elemnata po ortu kao vrijednost
        public HashMap<String, Integer> getCountEventsByOrt(){
            HashMap<String, Integer> erg = new HashMap<>();
//for ide kroz niz uzima elemnta ort kao key, ukoliko taj key nije vec u HashMap erg ide dalje povecava count i na kraju upise u mapu
            for (Event e:lista) {
                String key = e.getOrt();
                if(!erg.containsKey(key)) {  //ova linija sprecava da vise puta ide kroz listu za isti ort
                    int count = 0;
                    for(Event event:lista){
                        if(event.getOrt() == key) {
                            count++;
                        }
                    }
                    erg.put(key, count);  //upisuje u HashMap
                }
            }
            return erg;
        }

        public HashMap<String, Double> getSumPriceEventsByOrt(){
            HashMap<String, Double> erg = new HashMap<>();
            for (Event e:lista) {
                String key = e.getOrt();
                if(!erg.containsKey(key)){

                    double sum=0;
                    for(Event ev :lista)  {
                        if(ev.getOrt()==key){
                            sum=sum+ev.getEntrittpreis();
                        }
                    }
                    erg.put(key, sum);
                }
            }

            return erg;
        }
    }


