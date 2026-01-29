package ej4;

public class Cancion {
    private float duracion;
    private int numeroMusicos;
    private String nombre;
    private Banda banda;

    public Cancion(float duracion, int numeroMusicos, String nombre, Banda banda) {
        this.duracion = duracion;
        this.numeroMusicos = numeroMusicos;
        this.nombre = nombre;
        this.banda = banda;
    }

    public float getDuracion() {
        return duracion;
    }

    public Banda getBanda() {
        return banda;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroMusicos() {
        return numeroMusicos;
    }
}
