package ej1;

public class Main {
    public static void main(String[] args) {
        Pared par1 = new Pared("Sur");
        Pared par2 = new Pared("Norte");
        Pared par3 = new Pared("Este");
        Pared par4 = new Pared("Oeste");
        Techo tec1 = new Techo(3, 35);
        Cama cam1 = new Cama("Rojo", 3, 2, 4,6);
        Lampara lam1 = new Lampara("verdem", false, 3);

        Habitacion hab1 = new Habitacion("hab1", par1, par2, par3, par4, tec1, cam1, lam1);
        System.out.println(hab1.getLampara().isBateria());
        hab1.getLampara().encender();
        System.out.println(hab1.getLampara().isBateria());

    }
}