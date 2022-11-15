package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/Main.fxml"));
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setTitle("Rock-Paper-Scissors-Lizard-Spock Game");
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(event -> {event.consume(); Exit(stage);});
    }
    
    public void Exit(Stage stage) {
        
       Alert closeAlert = new Alert(Alert.AlertType.CONFIRMATION);
       closeAlert.setTitle("Exit Game");
       closeAlert.setHeaderText("Wait! You are about to exit the game!");
       closeAlert.setContentText("Are you sure you want to exit?");
        
       if (closeAlert.showAndWait().get() == ButtonType.OK) {  
            
           System.out.println("You have successfully exited the game!");
           stage.close();            
        }       
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }

}
