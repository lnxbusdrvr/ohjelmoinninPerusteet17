package ristinolla;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {


    public static void main(String[] args) {
        System.out.println("Ohjelma alkaa!");
        launch(RistinollaSovellus.class);
    }
    
    @Override
    public void start(Stage ikkuna)  {
        BorderPane asettelu = new BorderPane();
        
        //HBox ylavalikko = new HBox();
        
        Label ylateksti = new Label("Vuoro: ");
        //Label vuoro = new Label("X");
        
        ylateksti.setFont(Font.font("Monospaced", 40));
        
        //ylavalikko.getChildren().addAll(ylateksti, vuoro);
        
                
        GridPane ristikko = new GridPane();
        
        // Asetetaan ristikon napit        
        // Luodaan 3x3 ristikko
        /*for (int rivi = 1; rivi <= 3; rivi++) {
            for (int sarake = 1; sarake <= 3; sarake++) {
                // Javassa ei ole mahdollista luoda muuttuijia, jonka nimessä
                // oleva numero kasvaa, 
                // nappi11, nappi12, nappi13
                // nappi21, nappi22, nappi23 jne
                ristikko.add(new Button(), rivi, sarake);
            }
        }*/
        
        // Napit, rivi 1
        Button nappi11 = new Button(" ");
        Button nappi12 = new Button(" ");
        Button nappi13 = new Button(" ");
        
        // Napit, rivi 2
        Button nappi21 = new Button(" ");
        Button nappi22 = new Button(" ");
        Button nappi23 = new Button(" ");
        
        // Napit, rivi 3
        Button nappi31 = new Button(" ");
        Button nappi32 = new Button(" ");
        Button nappi33 = new Button(" ");
        
        // Asetetaan fontit, rivi 1
        nappi11.setFont(Font.font("Monospaced", 40));
        nappi12.setFont(Font.font("Monospaced", 40));
        nappi13.setFont(Font.font("Monospaced", 40));
        
        // Asetetaan fontit, rivi 2
        nappi21.setFont(Font.font("Monospaced", 40));
        nappi22.setFont(Font.font("Monospaced", 40));
        nappi23.setFont(Font.font("Monospaced", 40));
        
        // Asetetaan fontit, rivi 3
        nappi31.setFont(Font.font("Monospaced", 40));
        nappi32.setFont(Font.font("Monospaced", 40));
        nappi33.setFont(Font.font("Monospaced", 40));
        
        // Lisätään kaikki napit ristikkoon
        ristikko.add(nappi11, 1, 1);
        ristikko.add(nappi12, 1, 2);
        ristikko.add(nappi13, 1, 3);
        ristikko.add(nappi21, 2, 1);
        ristikko.add(nappi22, 2, 2);
        ristikko.add(nappi23, 2, 3);
        ristikko.add(nappi31, 3, 1);
        ristikko.add(nappi32, 3, 2);
        ristikko.add(nappi33, 3, 3);
        
        ristikko.setHgap(10);
        ristikko.setVgap(10);
        ristikko.setAlignment(Pos.CENTER);
        //ristikko.setPadding(new Insets(70, 70, 70, 70));
        
        asettelu.setTop(ylateksti);
        asettelu.setCenter(ristikko);
        
        Scene nakyma = new Scene(asettelu, 350, 350);
        
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

}
