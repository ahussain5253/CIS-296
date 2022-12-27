
package Main;

import java.awt.Button;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;


public class MainController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane mainPane;

    public void Exit(ActionEvent event) {
        
        Alert closeAlert = new Alert(AlertType.CONFIRMATION);
        closeAlert.setTitle("Exit Game");
        closeAlert.setHeaderText("Wait! You are about to exit the game!");
        closeAlert.setContentText("Are you sure you want to exit?");
        
        if (closeAlert.showAndWait().get() == ButtonType.OK) {           
            stage = (Stage) mainPane.getScene().getWindow();
            System.out.println("You have successfully exited the game!");
            stage.close();            
        }       
    }//end Exit
        
    //Go back to main scene
    public void Back(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("FXML/Main.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Rock-Paper-Scissors-Lizard-Spock Game");
        stage.setScene(scene);
        stage.show();        
    }//end Back

    //User chooses Rock
    public void Rock(ActionEvent event) throws IOException{

        //Random choice chosen for computer (1 - 5)
        // 1 = Rock | 2 = Paper | 3 = Scissors | 4 = Lizard | 5 = Spock
        // W = Win | L = Lose | T = Tie

        Random randNum = new Random();
        int compChoice = randNum.nextInt(1, 6);

         //User(Rock) ties Computer(Rock) T
        if (compChoice == 1) {
            root = FXMLLoader.load(getClass().getResource("FXML/Rock/TRock.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Tie!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Rock) is covered by Computer(Paper) L
        if (compChoice == 2) {
            root = FXMLLoader.load(getClass().getResource("FXML/Rock/CPBR.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Rock) crushes Computer(Scissors) W
        if (compChoice == 3) {
            root = FXMLLoader.load(getClass().getResource("FXML/Rock/URBS.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Rock) crushes Computer(Lizard) W
        if (compChoice == 4) {
            root = FXMLLoader.load(getClass().getResource("FXML/Rock/URBL.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Rock) is vaporized by Computer(Spock) L
        if (compChoice == 5) {
            root = FXMLLoader.load(getClass().getResource("FXML/Rock/CSpBR.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }
    }// end Rock

    //User chooses Paper
    public void Paper(ActionEvent event) throws IOException {
         //Random choice chosen for computer (1 - 5)
        // 1 = Rock | 2 = Paper | 3 = Scissors | 4 = Lizard | 5 = Spock
        // W = Win | L = Lose | T = Tie

        Random randNum = new Random();
        int compChoice = randNum.nextInt(1, 6);

         //User(Paper) covers Computer(Rock) W
        if (compChoice == 1) {
            root = FXMLLoader.load(getClass().getResource("FXML/Paper/UPBR.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Paper) ties Computer(Paper) T
        if (compChoice == 2) {
            root = FXMLLoader.load(getClass().getResource("FXML/Paper/TPaper.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Tie!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Paper) is cut by Computer(Scissors) L
        if (compChoice == 3) {
            root = FXMLLoader.load(getClass().getResource("FXML/Paper/CSBP.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Paper) is eaten by Computer(Lizard) L
        if (compChoice == 4) {
            root = FXMLLoader.load(getClass().getResource("FXML/Paper/CLBP.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Paper) disproves Computer(Spock) W
        if (compChoice == 5) {
            root = FXMLLoader.load(getClass().getResource("FXML/Paper/UPBSp.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }
    }// end Paper

    //User chooses Scissors
    public void Scissors(ActionEvent event) throws IOException {
         //Random choice chosen for computer (1 - 5)
        // 1 = Rock | 2 = Paper | 3 = Scissors | 4 = Lizard | 5 = Spock
        // W = Win | L = Lose | T = Tie

        Random randNum = new Random();
        int compChoice = randNum.nextInt(1, 6);

         //User(Scissors) is crushed by Computer(Rock) L
        if (compChoice == 1) {
            root = FXMLLoader.load(getClass().getResource("FXML/Scissors/CRBS.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Scissors) cuts Computer(Paper) W
        if (compChoice == 2) {
            root = FXMLLoader.load(getClass().getResource("FXML/Scissors/USBP.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Scissors) ties Computer(Scissors) T
        if (compChoice == 3) {
            root = FXMLLoader.load(getClass().getResource("FXML/Scissors/TScissors.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Tie!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Scissors) decapitates Computer(Lizard) W
        if (compChoice == 4) {
            root = FXMLLoader.load(getClass().getResource("FXML/Scissors/USBL.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Scissors) is smashed by Computer(Spock) L
        if (compChoice == 5) {
            root = FXMLLoader.load(getClass().getResource("FXML/Scissors/CSpBS.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }
    }// end Scissors

    //User chooses Lizard
    public void Lizard(ActionEvent event) throws IOException {
         //Random choice chosen for computer (1 - 5)
        // 1 = Rock | 2 = Paper | 3 = Scissors | 4 = Lizard | 5 = Spock
        // W = Win | L = Lose | T = Tie

        Random randNum = new Random();
        int compChoice = randNum.nextInt(1, 6);

         //User(Lizard) is crushed by Computer(Rock) L
        if (compChoice == 1) {
            root = FXMLLoader.load(getClass().getResource("FXML/Lizard/CRBL.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Lizard) eats Computer(Paper) W
        if (compChoice == 2) {
            root = FXMLLoader.load(getClass().getResource("FXML/Lizard/ULBP.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Lizard) is decapitated by Computer(Scissors) L
        if (compChoice == 3) {
            root = FXMLLoader.load(getClass().getResource("FXML/Lizard/CSBL.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Lizard) ties Computer(Lizard) T
        if (compChoice == 4) {
            root = FXMLLoader.load(getClass().getResource("FXML/Lizard/TLizard.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Tie!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Lizard) poisons Computer(Spock) W
        if (compChoice == 5) {
            root = FXMLLoader.load(getClass().getResource("FXML/Lizard/ULBSp.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Won!");
            stage.setScene(scene);
            stage.show();
        }
    }// end Lizard

    //User chooses Spock
    public void Spock(ActionEvent event) throws IOException {
         //Random choice chosen for computer (1 - 5)
        // 1 = Rock | 2 = Paper | 3 = Scissors | 4 = Lizard | 5 = Spock
        // W = Win | L = Lose | T = Tie

        Random randNum = new Random();
        int compChoice = randNum.nextInt(1, 6);

         //User(Spock) vaporizes Computer(Rock) W
        if (compChoice == 1) {
            root = FXMLLoader.load(getClass().getResource("FXML/Spock/USpBR.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Win!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Spock) is disproved by Computer(Paper) L
        if (compChoice == 2) {
            root = FXMLLoader.load(getClass().getResource("FXML/Spock/CPBSp.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Spock) smashes Computer(Scissors) W
        if (compChoice == 3) {
            root = FXMLLoader.load(getClass().getResource("FXML/Spock/USpBS.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Win!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Spock) is posioned by Computer(Lizard) L
        if (compChoice == 4) {
            root = FXMLLoader.load(getClass().getResource("FXML/Spock/CLBSp.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("You Lost!");
            stage.setScene(scene);
            stage.show();
        }

        //User(Spock) ties Computer(Spock) T
        if (compChoice == 5) {
            root = FXMLLoader.load(getClass().getResource("FXML/Spock/TSpock.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Tie!");
            stage.setScene(scene);
            stage.show();
        }
    }// end Spock

}//end class
