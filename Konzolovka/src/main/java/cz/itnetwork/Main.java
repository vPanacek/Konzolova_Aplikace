package cz.itnetwork;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Databaze databaze = new Databaze();

        String volba = "";
        while (!volba.equals("4")) {
            System.out.println("-------------- Evidence pojištěných --------------");
            System.out.println("Vyberte si akci: ");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();

            switch (volba) {
                case "1":
                    String jmeno = "";
                    while (jmeno.isEmpty()) {
                        System.out.println("Zadejte jméno pojištěného");
                        jmeno = scanner.nextLine();
                    }
                    System.out.println("Zadejte přijmení: ");
                    String prijmeni = scanner.nextLine();
                    System.out.println("Zadejte telefonní číslo: ");
                    String telefon = scanner.nextLine();
                    System.out.println("Zadejte věk: ");
                    int vek = 0;
                    try {
                        vek = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Neplatný věk, prosím zkuste znovu.");
                        break;
                    }
                    System.out.println("Data byla uložena. Stiskněte libovolnou klávesu...");
                    new Scanner(System.in).nextLine();

                    PojistenaOsoba pojistenaOsoba = new PojistenaOsoba(jmeno, prijmeni, vek, telefon);
                    databaze.pridatPojistenouOsobu(pojistenaOsoba);
                    break;
                case "2":
                    databaze.vypsatVsechnyPojisteneOsoby();
                    System.out.println("\nStiskněte libovolnou klávesu...");
                    new Scanner(System.in).nextLine();
                    break;
                case "3":
                    System.out.println("Zadejte jméno pojištěného: ");
                    jmeno = scanner.nextLine();
                    System.out.println("Zadejte příjmení pojištěného: ");
                    prijmeni = scanner.nextLine();

                    PojistenaOsoba vyhledaniPojistence = databaze.vyhledatPojistenouOsobu(jmeno, prijmeni);
                    if (vyhledaniPojistence != null) {
                        System.out.println(vyhledaniPojistence);
                    } else {
                        System.out.println("Osoba nenalezena.");
                    }
                    System.out.println("\nStiskněte libovolnou klávesu...");
                    new Scanner(System.in).nextLine();
                    break;
                case "4":
                    System.out.println("Ukončili jste program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Neplatná volba, prosím zkuste znovu.");
                    break;
            }
        }
    }
}


