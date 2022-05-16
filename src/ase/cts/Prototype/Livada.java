package ase.cts.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Livada {
    private List<Copac> listaCopaci;

    public Livada() {
        listaCopaci=new ArrayList<>();
    }

    //metoda care modifica POZITIA si il adauga in LISTA
//    public void planteaza(Copac){};
    public void planteazaCopac(Copac copac){
        listaCopaci.add(copac);

    }

    public void afiseazaLista(){
        for(Copac c:listaCopaci){
            System.out.println("Lista este form"+c);
        }
    }
}
