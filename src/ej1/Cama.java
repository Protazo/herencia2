package ej1;

public class Cama {
    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colcha;

    public Cama(String est, int alm, int alt, int sab, int col) {
        this.estilo = est;
        this.almohadas = alm;
        this.altura = alt;
        this.sabanas = sab;
        this.colcha = col;
    }

    public void hacer() {
        System.out.println("Se ha hecho la cama");
    }

    public String getEstilo() {
        return estilo;
    }

    public int getAlmohadas() {
        return almohadas;
    }

    public int getAltura() {
        return altura;
    }

    public int getSabanas() {
        return sabanas;
    }

    public int getColcha() {
        return colcha;
    }
}
