import java.util.Arrays;

public class Lehrer extends Mensch{
    private String Faecher[];

    public Lehrer(String name, String vorname, String geburtsort, String[] faecher) {
        super(name, vorname, geburtsort);
        Faecher = faecher;
    }

    @Override
    public String toString() {
        return super.toString()+
                " "+
                "Lehrer{" +
                "Faecher=" + Arrays.toString(Faecher) +
                '}'+
                '}';
    }

    public String[] getFaecher() {
        return Faecher;
    }

    public void setFaecher(String[] faecher) {
        Faecher = faecher;
    }
}
