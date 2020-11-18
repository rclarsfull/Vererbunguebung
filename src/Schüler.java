public class Schüler extends Mensch {
    private String fachrichtung;
    private int klasse;

    public Schüler(String name, String vorname, String geburtsort, String fachrichtung, int klasse) {
        super(name, vorname, geburtsort);
        this.fachrichtung = fachrichtung;
        this.klasse = klasse;
    }

    public String getFachrichtung() {
        return fachrichtung;
    }

    public void setFachrichtung(String fachrichtung) {
        this.fachrichtung = fachrichtung;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }
}
