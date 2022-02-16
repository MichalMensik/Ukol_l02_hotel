package com.engeto.examples;

import java.time.LocalDate;

public class EvidenceHostu {
    String jmenoHosta;
    String prijmeniHosta;
    LocalDate datumNarozeni;

    public EvidenceHostu(String jmenoHosta, String prijmeniHosta, LocalDate datumNarozeni){
        this.jmenoHosta = jmenoHosta;
        this.prijmeniHosta = prijmeniHosta;
        this.datumNarozeni = datumNarozeni;

    }

   public String getJmenoHosta() {
        return jmenoHosta;
    }

    public void setJmenoHosta(String jmenoHosta) {
        this.jmenoHosta = jmenoHosta;
    }

    public String getPrijmeniHosta() {
        return prijmeniHosta;
    }

    public void setPrijmeniHosta(String prijmeniHosta) {
        this.prijmeniHosta = prijmeniHosta;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getDesctription(){
        return "Jméno a příjmení hosta: "+jmenoHosta+" "+prijmeniHosta+", Datum narození: " + datumNarozeni;
    }

    public String getFullJmenoHosta(){
        return getJmenoHosta()+" "+getPrijmeniHosta();
    }
}
