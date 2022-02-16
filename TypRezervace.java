package com.engeto.examples;

public enum TypRezervace {
    PRACOVNI("Pracovní"), REKREACNI("Rekreační");

    final String description;

    TypRezervace(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return description;
    }
}
