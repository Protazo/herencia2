package ej4;

public class Main {
    static void main() {
        Banda Ax7 = new Banda("Avenged Sevenfold", "Metalcore");
        Cancion Gunslinger = new Cancion(5.35F, 4, "Gunslinger", Ax7);
        System.out.println(Gunslinger.getBanda());
        //No se pueden cambiar los atributos de una cancion cuando ya esta hecha por lo que
        //tiene que estar en private los atributos.
    }
}
