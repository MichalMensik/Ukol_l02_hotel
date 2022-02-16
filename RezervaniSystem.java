package com.engeto.examples;

import java.util.ArrayList;
import java.util.List;

public class RezervaniSystem {
    List<Rezervace> rezervacniSystem = new ArrayList<Rezervace>();

public void addRezervace(Rezervace newRezervace){
    rezervacniSystem.add(newRezervace);
}

public void printRezervacniSystem(){
    for (Rezervace rezervace:rezervacniSystem){
        System.out.println(rezervace.getDesctription());
    }
}
}
