package ej3;

public class Impresora {
    int nivelToner;
    int numPagImpresas;
    boolean dobleCara;

    public Impresora(int nivelToner, int numPagImpresas, boolean dobleCara) {
        if (nivelToner <= 0) {
            nivelToner = 0;
        }
        this.nivelToner = nivelToner;
        this.numPagImpresas = numPagImpresas;
        this.dobleCara = dobleCara;
    }

    public int añadirToner(int sumaToner) {
        if (sumaToner > 100) {
            System.out.println("El cartucho es muy grande");
            return -1;
        }
        if (this.nivelToner <= 100) {
            this.nivelToner = this.nivelToner + sumaToner;


            if (this.nivelToner > 100) {
                this.nivelToner = 100;
                System.out.println("El toner esta lleno, solo puedes llenarlo hasta 100");
            } else {
                System.out.println("El toner se ha llenado bien");
            }
            return this.nivelToner;
        } else {
            System.out.println("El toner ya está lleno");

            return -1;
        }

    }

    public int imprimir(int numHojas) {

        if (dobleCara) {
            if (numHojas % 2 == 1) {
                numHojas = (numHojas /2)+1;
            } else if (numHojas % 2 == 0) {
                numHojas = numHojas /2;
            }
        }

        this.numPagImpresas = this.numPagImpresas + numHojas;
        return numHojas;
    }

    public int getNumPagImpresas() {
        return numPagImpresas;
    }
}
