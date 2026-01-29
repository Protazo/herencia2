package ej3;

public class MainEncapsulacion {
    static void main() {
        Impresora imp1 = new Impresora(34, 1, true);
        int p;
        p = imp1.añadirToner(68);
        System.out.println("El toner esta al " + p + " % ");

        System.out.println("Las hojas que va a imprimir son " + imp1.imprimir(45));
        System.out.println("Lleva impresas " + imp1.getNumPagImpresas() + " hojas");
        System.out.println("Las hojas que va a imprimir son " + imp1.imprimir(149));
        System.out.println("Lleva impresas " + imp1.getNumPagImpresas() + " hojas");
        imp1.numPagImpresas = 1;
        System.out.println("Lleva impresas " + imp1.getNumPagImpresas() + " hojas");
    }
}
