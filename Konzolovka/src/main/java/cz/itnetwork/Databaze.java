package cz.itnetwork;

import java.util.ArrayList;
import java.util.List;

public class Databaze {

    private final List<PojistenaOsoba> pojistenci;

    public Databaze() {
        pojistenci = new ArrayList<>();
    }

    public void pridatPojistenouOsobu(PojistenaOsoba pojistenaOsoba) {
        pojistenci.add(pojistenaOsoba);
    }

    public void vypsatVsechnyPojisteneOsoby() {
        for (PojistenaOsoba pojistenaOsoba : pojistenci) {
            System.out.println(pojistenaOsoba);
        }
    }

    public PojistenaOsoba vyhledatPojistenouOsobu(String jmeno, String prijmeni) {
        for (PojistenaOsoba pojistenaOsoba : pojistenci) {
            if (pojistenaOsoba.getJmeno().equals(jmeno) && pojistenaOsoba.getPrijmeni().equals(prijmeni)) {
                return pojistenaOsoba;
            }
        }
        return null;
    }
}
