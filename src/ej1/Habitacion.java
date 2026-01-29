package ej1;

public class Habitacion {
    String nombre;
    Pared pared1;
    Pared pared2;
    Pared pared3;
    Pared pared4;
    Techo techo;
    Cama cama;
    Lampara lampara;

    public Habitacion(String nom, Pared pared1, Pared pared2, Pared pared3,
                      Pared pared4, Techo tec, Cama cam, Lampara lam) {
        this.nombre = nom;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
        this.techo = tec;
        this.cama = cam;
        this.lampara = lam;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", pared1=" + pared1 +
                ", pared2=" + pared2 +
                ", pared3=" + pared3 +
                ", pared4=" + pared4 +
                ", techo=" + techo +
                ", cama=" + cama +
                ", lampara=" + lampara +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public Pared getPared1() {
        return pared1;
    }

    public Pared getPared2() {
        return pared2;
    }

    public Pared getPared3() {
        return pared3;
    }

    public Pared getPared4() {
        return pared4;
    }

    public Techo getTecho() {
        return techo;
    }

    public Cama getCama() {
        return cama;
    }

    public Lampara getLampara() {
        return lampara;
    }

    public boolean encendida() {
        return lampara.isBateria();
    }
}
