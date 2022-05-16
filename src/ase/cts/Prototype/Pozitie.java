package ase.cts.Prototype;

public class Pozitie implements Cloneable{
    private int x;
    private int y;

    public Pozitie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pozitie copie=(Pozitie) super.clone();
        this.x=x;
        this.y=y;
        return copie;
    }
}
