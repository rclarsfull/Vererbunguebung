public class Lehrer extends Mensch{
    private String Faecher[];

    public Lehrer(String name, String vorname, String geburtsort, String[] faecher) {
        super(name, vorname, geburtsort);
        Faecher = faecher;
    }

    public String[] getFaecher() {
        return Faecher;
    }

    public void setFaecher(String[] faecher) {
        Faecher = faecher;
    }
}
