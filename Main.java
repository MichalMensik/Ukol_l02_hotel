package com.engeto.examples;

import javax.swing.text.html.HTMLDocument;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	EvidenceHostu adela = new EvidenceHostu("Adéla", "Malíková", LocalDate.of(1993,3,13));
        System.out.println(adela.getDesctription());
    EvidenceHostu jan = new EvidenceHostu("Jan","Dvořáček", LocalDate.of(1995,5,5));
               System.out.println(jan.getDesctription());


    EvidencePokoju pokoj1 = new EvidencePokoju(1,1,true,true, BigDecimal.valueOf(1000.00));
        System.out.println(pokoj1.getDesctription());
    EvidencePokoju pokoj2 = new EvidencePokoju(2,1,true,true, BigDecimal.valueOf(1000.00));
        System.out.println(pokoj2.getDesctription());
    EvidencePokoju pokoj3 = new EvidencePokoju(3,3,false,true, BigDecimal.valueOf(2400.00));
        System.out.println(pokoj3.getDesctription());

    RezervaniSystem rezervaniSystem = new RezervaniSystem();
    Rezervace rezervace = new Rezervace(adela, pokoj1, LocalDate.of(2021,7,19),
            LocalDate.of(2021,7,26),TypRezervace.REKREACNI);
    rezervace.addEvidenceHostu(adela);
    rezervaniSystem.addRezervace(rezervace);

    rezervace = new Rezervace(adela, pokoj3, LocalDate.of(2021,9,1),
            LocalDate.of(2021,9,14), TypRezervace.PRACOVNI);
    rezervace.addEvidenceHostu(jan);
    rezervace.addEvidenceHostu(adela);

    rezervaniSystem.addRezervace(rezervace);
    rezervaniSystem.printRezervacniSystem();
    }
}
