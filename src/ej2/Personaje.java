package ej2;

public class Personaje {
    Familia familia;
    String nombre;

    public Personaje(Familia familia, String nombre) {
        this.familia = familia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Familia getFamilia() {
        return familia;
    }
}
