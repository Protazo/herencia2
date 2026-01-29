package ej2;

public class Main {
    public static void main(String[] args) {
        Familia fam1 = new Familia("magos", Atributos.MAGIA, "rojo");
        Personaje p1 = new Personaje(fam1, "hugo");
        p1.getFamilia().imprimirdatos(p1);

    }
}