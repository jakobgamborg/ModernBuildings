/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Yourk
 */
public class AppController implements Initializable {
    @FXML
    private ListView<?> buildingId;
    @FXML
    private ListView<?> sensorId;
    @FXML
    private ListView<?> actuactorId;
    @FXML
    private ListView<?> rulesId;
    @FXML
    private ListView<?> eventsId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
