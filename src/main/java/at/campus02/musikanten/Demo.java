package at.campus02.musikanten;

public class Demo {
    public static void main(String[] args) {

        Musikant m1=new Esel(3,new Instrument("Frula",17.00),2.5);
        Musikant m2=new Hahn(2,new Instrument("Frula",10.00),6);
        Musikant m3=new Katze(4,new Instrument("gittare",12.00),4.0);
        Musikant m4=new Hund(4,new Instrument("Frula",8.5),2.5);

  Quartett q1=new Quartett();
  q1.add(m1);
  q1.add(m2);
  q1.add(m3);
  q1.add(m4);

        System.out.println(q1.istQuartett());
        System.out.println(m1);
    }

}
