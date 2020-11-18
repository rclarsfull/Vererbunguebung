public class Mensch {
    private String name,vorname,geburtsort;


    public Mensch(String name, String vorname, String geburtsort) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsort = geburtsort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsort() {
        return geburtsort;
    }

    public void setGeburtsort(String geburtsort) {
        this.geburtsort = geburtsort;
    }
}
