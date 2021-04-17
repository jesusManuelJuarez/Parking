package sample.model;

import javafx.scene.shape.Circle;
//CLASE POSOCION PARA EL OBJETO QUE VA DENTRO DEL GRIDPANE
public class Posicion {
    private Circle circle;
    private int fila;
    private int colum;

    public Posicion(Circle circle, int fila, int colum){
        this.circle=circle;
        this.fila=fila;
        this.colum=colum;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }
}