
package hellofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloFXMLController {

    @FXML
    private Circle myCircle;
    private double x;
    private double y = 0;
    
    @FXML
    private void up(ActionEvent event) {
        myCircle.setCenterY(y-=10);    
    }
    
}
