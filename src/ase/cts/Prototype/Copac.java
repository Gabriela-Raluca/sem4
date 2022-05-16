package ase.cts.Prototype;

public class Copac implements Cloneable {
    private float inaltime;
    private String culoareFrunze;
    private String tipCoroana;

    //elem PARTICULAR-pozitie
    private Pozitie pozitieXoY;

    //constructor
    public Copac(float inaltime, String culoareFrunze, String tipCoroana, Pozitie pozitieXoY) {
        this.inaltime = inaltime;
        this.culoareFrunze = culoareFrunze;
        this.tipCoroana = tipCoroana;
        this.pozitieXoY = pozitieXoY;
    }

    //implementare metoda clone()


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Copac copie=(Copac) super.clone();
        copie.inaltime=inaltime;
        copie.culoareFrunze=culoareFrunze;
        copie.tipCoroana=tipCoroana;
        copie.pozitieXoY=(Pozitie) pozitieXoY.clone();
        //modificare pozitie la clona
        copie.pozitieXoY.setX(copie.pozitieXoY.getX()+10);
        return copie;
    }

    public float getInaltime() {
        return inaltime;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    public String getCuloareFrunze() {
        return culoareFrunze;
    }

    public void setCuloareFrunze(String culoareFrunze) {
        this.culoareFrunze = culoareFrunze;
    }

    public String getTipCoroana() {
        return tipCoroana;
    }

    public void setTipCoroana(String tipCoroana) {
        this.tipCoroana = tipCoroana;
    }

    public Pozitie getPozitieXoY(Pozitie pozitieXoY) {
        return pozitieXoY;
    }

    public void setPozitieXoY(Pozitie pozitieXoY) {
        this.pozitieXoY = pozitieXoY;
    }
}
