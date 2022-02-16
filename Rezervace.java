package com.engeto.examples;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rezervace {
    EvidenceHostu mainEvidenceHostu;
    List<EvidenceHostu> otherEvidenceHostu = new ArrayList<>();
    EvidencePokoju pokoje;
    LocalDate zacatek;
    LocalDate konec;
    TypRezervace typ;

    public Rezervace(EvidenceHostu mainEvidenceHostu, EvidencePokoju pokoje, LocalDate zacatek, LocalDate konec, TypRezervace typ) {
        this.mainEvidenceHostu = mainEvidenceHostu;
        this.pokoje = pokoje;
        this.zacatek = zacatek;
        this.konec = konec;
        this.typ = typ;
    }

    public Rezervace(EvidenceHostu mainEvidenceHostu, EvidencePokoju pokoje) {
        this(mainEvidenceHostu, pokoje, LocalDate.now(), LocalDate.now().plusDays(7), TypRezervace.REKREACNI);
    }

    public EvidenceHostu getMainEvidenceHostu() {
        return mainEvidenceHostu;
    }

    public void setMainEvidenceHostu(EvidenceHostu mainEvidenceHostu) {
        this.mainEvidenceHostu = mainEvidenceHostu;
    }

    public List<EvidenceHostu> getOtherEvidenceHostu() {
        return otherEvidenceHostu;
    }

    public void setOtherEvidenceHostu(List<EvidenceHostu> otherEvidenceHostu) {
        this.otherEvidenceHostu = otherEvidenceHostu;
    }

    public EvidencePokoju getPokoje() {
        return pokoje;
    }

    public void setPokoje(EvidencePokoju pokoje) {
        this.pokoje = pokoje;
    }

    public LocalDate getZacatek() {
        return zacatek;
    }

    public void setZacatek(LocalDate zacatek) {
        this.zacatek = zacatek;
    }

    public LocalDate getKonec() {
        return konec;
    }

    public void setKonec(LocalDate konec) {
        this.konec = konec;
    }

    public TypRezervace getTyp() {
        return typ;
    }

    public void setTyp(TypRezervace typ) {
        this.typ = typ;
    }

    public void addEvidenceHostu(EvidenceHostu newEvidenceHostu) {
        otherEvidenceHostu.add(newEvidenceHostu);
    }

    public void removeEvidenceHostu(EvidenceHostu evidenceHostu) {
        otherEvidenceHostu.remove(evidenceHostu);
    }

    public void clearOtherEvidenceHostu() {
        otherEvidenceHostu.clear();
    }

    public String getDesctription(){
              StringBuilder result = new StringBuilder("Rezervace pro: " + mainEvidenceHostu.getFullJmenoHosta()+", " +typ+" pobyt" + ", " + "Pokoj číslo "+ getPokoje().cisloPokoje + " od "
                + zacatek.toString()+" do " + konec.toString() + ", hosté: ");
        for (EvidenceHostu evidenceHostu : otherEvidenceHostu) {
            result.append(evidenceHostu.getFullJmenoHosta()).append(", ");
        }

        return result.toString();

    }
}



