package at.campus02.musikanten;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator<Musikant> {

    @Override
    public int compare(Musikant o1, Musikant o2) {
        //ovdje se pise poredjene iz zadatka,
        // double jer je jacina kao double varijabla
        // ako bi bio krinterijum kao int onda je
        //Integer.compare
        //ako hocu da ide od najjaceg do najslabijeg u sledecoj liniji
        //mora biti prvo o2, pa o1.
        //za obrnuto:ako treba od najmanjeg do najveceg onda o1, pa poslije o2
        return Double.compare((o2.spieleMusic()),o1.spieleMusic());
    }
}
