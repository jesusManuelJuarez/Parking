package sample.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import sample.model.Auto;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;



public class Controller implements Initializable {
    @FXML
    public GridPane boxId;

    private Random random =  new Random(System.currentTimeMillis());



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Auto auto = new Auto(boxId,0,0);
        auto.start();
        //Auto auto2 = new Auto(boxId,1,0);
        //auto2.start();
        System.out.println("Hilo");

        /*
        for(int i=0;i<=6;i++){
            for(int i1=0;i1<=6;i1++){
                Circle circle = new Circle(10, Color.RED);
                boxId.add(circle,i,i1);
            }
        }
        */
        //lanzador();
    }

    public void lanzador(){

        while(true){

            if(true){
                //CARGA DE HILOS AL GRIDPANE
                Boolean bandera=true;
                while(bandera){

                }
            }else{
                //BLOQUEADO DE HILOS
            }

        }
    }

    public void busqueda(){
        for(int i=0;i<=6;i++){
            for(int i1=0;i1<=6;i1++){
                // Circle circle = new Circle(10, Color.RED);
                //boxId.add(circle,i,i1);
                //Auto auto = new Auto(boxId,i,i1);
                //auto.start();
            }
        }
    }




}
