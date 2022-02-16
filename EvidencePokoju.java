package com.engeto.examples;

import java.math.BigDecimal;

public class EvidencePokoju {
    int cisloPokoje;
    int pocetLuzek;
    boolean balkon;
    boolean vyhledNaMore;
    BigDecimal cenaZaNoc;

    public EvidencePokoju(int cisloPokoje, int pocetLuzek, boolean balkon, boolean vyhledNaMore, BigDecimal cenaZaNoc){
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.balkon = balkon;
        this.vyhledNaMore = vyhledNaMore;
        this.cenaZaNoc = cenaZaNoc;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isVyhledNaMore() {
        return vyhledNaMore;
    }

    public void setVyhledNaMore(boolean vyhledNaMore) {
        this.vyhledNaMore = vyhledNaMore;
    }

    public BigDecimal getCenaZaNoc() {
        return cenaZaNoc;
    }

    public void setCenaZaNoc(BigDecimal cenaZaNoc) {
        this.cenaZaNoc = cenaZaNoc;

    }

    public String getDesctription (){
        return "Pokoj číslo "+cisloPokoje+": "+"Počet lůžek - " +pocetLuzek+ ", " +"Balkón: "+balkon+", Výhled na moře: "
                +vyhledNaMore+" "+"Cena: "+cenaZaNoc+" Kč/noc";
    }
}
