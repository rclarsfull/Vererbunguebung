import java.util.ArrayList;

class Test{
  public static void main(String[]args){
    
    Lehrer l1=new Lehrer("Günzel","Heidrut","Deutschland",new String[] {"Informatik","Mathe"});
    Schueler s1=new Schueler("Przybylek","Lars","Offenbach","Informatik",12);


    System.out.println(l1.toString());
    System.out.println(s1.toString());
    System.out.println(l1.showInfo());
    System.out.println(s1.showInfo());


    Mensch m1=new Schueler("test","test","heimat","info",999999);

    System.out.println(m1);

    Schueler s2=(Schueler) m1;

    System.out.println("\n\n\n");

    ArrayList<Mensch> liste=new ArrayList<Mensch>();

    for (int i = 0; i < 100; i++) {
      if (i%2==0){
        String a= String.valueOf(i);
        liste.add(new Schueler(a,a,a,a,i));
      }else if (i%3==0){
        String a= String.valueOf(i);
        liste.add(new Mensch(a,a,a));
      }else{
        String a= String.valueOf(i);
        liste.add(new Lehrer(a,a,a,new String[]{"test","test2"}));
      }
    }

    for (Mensch o:liste) {
      System.out.println(o.toString());
    }

    Object o= new Mensch("Objekt","vObjekt","oooooo");

    System.out.println(o.toString());





    
    
    
    }
  
  }
