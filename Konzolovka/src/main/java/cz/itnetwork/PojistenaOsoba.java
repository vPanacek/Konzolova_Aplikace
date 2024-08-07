package cz.itnetwork;



class PojistenaOsoba {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefon;

    public PojistenaOsoba(String jmeno, String prijmeni, int vek, String telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " " + vek + "   " + telefon;
    }
}
