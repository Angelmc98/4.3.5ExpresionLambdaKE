/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionlambdakeyevent;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import static javafx.scene.input.KeyCode.DOWN;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Angel Medina Cantos
 */
public class ExpresionLambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 250);
        
        Text text = new Text(20,20,"A");
        pane.getChildren().add(text);
        
        text.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event)
            {
                if(event.getCode() == DOWN){
                    
                }
               
            }
        });
        
        
        
        
        
        
        primaryStage.setTitle("Expreison Lambda KeyEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
