package ase.cts.Prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {
    public static void main(String[] args) {
        try {
            //1. Instanta copac
            Pozitie pozPrototip=new Pozitie(334,4);
            Copac prototip= new Copac(40,"verzi","ovala",pozPrototip);

            //2. Clonare prototip

            Copac copie1=(Copac) prototip.clone();
            //3. Modific elem PARTICULAR
            Pozitie copiePoz=(Pozitie) pozPrototip.clone();
            copie1.getPozitieXoY(copiePoz);

            //4.Plantez (=adaugare in lista)????
            List<Copac> listaCopaci= new ArrayList<>();
            Livada liv1= new Livada();
            liv1.planteazaCopac(copie1);
            liv1.planteazaCopac(prototip);
            System.out.println("Lista de copaci e:");

            //5.Afisez lista
            liv1.afiseazaLista();


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
