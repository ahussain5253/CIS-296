
package Main;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;


public class MainController {
   
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    
    //Go back to main scene
    public void Back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainFXML.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();        
    }
  
    
    //User chooses Rock
    public void Rock(ActionEvent event) throws IOException{
        
        //Random choice chosen for computer (1 - 5)
        // 1 = Rock | 2 = Paper | 3 = Scissors | 4 = Lizard | 5 = Spock
        // W = Win | L = Lose | T = Tie
        
        Random randNum = new Random();
        int compChoice = randNum.nextInt(1, 6);
        int userChoice = 1;  
        
         //User(Rock) ties Computer(Rock) T
        if (compChoice == 1) {                        
            root = FXMLLoader.load(getClass().getResource("FXML/TRock.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();                         
        }
        
        //User(Rock) is covered by Computer(Paper) L
        if (compChoice == 2) {                        
            root = FXMLLoader.load(getClass().getResource("FXML/CPBR.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();                         
        }
       
        //User(Rock) crushes Computer(Scissors) W
        if (compChoice == 3) {                        
            root = FXMLLoader.load(getClass().getResource("FXML/URBS.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();                         
        }
 
            

            
        

        

    
    }
    
}
