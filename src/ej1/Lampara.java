package ej1;

public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(String est, boolean bat, int cal) {
        this.estilo = est;
        this.bateria = bat;
        this.calificacion = cal;
    }


    public void encender() {
        System.out.println("La lámpara se ha encendido");
        bateria = true;
    }
    public String getEstilo() {
        return estilo;
    }

    public boolean isBateria() {
        return bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
