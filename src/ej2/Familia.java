package ej2;

public class Familia {
    String nombre;
    Atributos atributoestrella;
    String color;

    public Familia(String nombre, Atributos atributoestrella, String color) {
        this.nombre = nombre;
        this.atributoestrella = atributoestrella;
        this.color = color;
    }

    private String getNombre() {
        return nombre;
    }

    private Atributos getAtributoestrella() {
        return atributoestrella;
    }

    private String getColor() {
        return color;
    }

    public void imprimirdatos(Personaje p) {
        System.out.println(p.getFamilia().getNombre());
    }
}
