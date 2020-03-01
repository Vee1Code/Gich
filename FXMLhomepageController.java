/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gichambirasystem1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author user 2
 */
public class FXMLhomepageController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private void openScene4(ActionEvent event) throws IOException {
     Parent root=FXMLLoader.load(getClass().getResource("/gichambirasystem1/FXMLhomepage.fxml"));   
     Scene scene=new Scene(root);
     Stage stage=new Stage(StageStyle.DECORATED);
    
     stage.setScene(scene);
     stage.show();
    }
    
}

