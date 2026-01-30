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
        if (sumaToner > 100 || sumaToner < 0) {
            return -1;
        }

        if (this.nivelToner + sumaToner > 100) {
            return -1;
        } else {
            this.nivelToner = this.nivelToner + sumaToner;
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
