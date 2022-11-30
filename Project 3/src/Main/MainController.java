
package Main;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class MainController implements Initializable{
   
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane mainPane;
    private Label theLabel;
   
    private Stack calcOutStack = new Stack();
   
    public void addNumber(ActionEvent event) {
        
        theLabel.setText("Hello");

  
    }
    

    public void Operation(ActionEvent event) {
        
        
  
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
        
}//end class
