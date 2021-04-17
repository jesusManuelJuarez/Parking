package sample.model;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import sample.Controller.Controller;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Auto extends Thread{
    //VARIABLES DE UBICACIÓN DE POSICIONES
    int colum;
    int fila;
    GridPane boxId;

    public static Posicion puente;

    //VARIABLE DE CLASE POSICION
    Controller contClass;
    //CONSTRUCTOR

    public Auto(GridPane boxId,int fila,int colum){
        this.colum=colum;
        this.fila=fila;
        this.boxId=boxId;
    }


    @Override
    public void run() {
        try{
            Circle circle = new Circle(15, Color.RED);
            boxId.add(circle,fila,colum);
            sleep(2000);
            System.out.println(boxId);
        }catch (Exception ex){
            Logger.getLogger(Auto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
