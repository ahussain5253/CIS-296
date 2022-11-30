package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import java.util.Stack;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
        
        stage.setOnCloseRequest(event -> {event.consume(); Exit(stage);});
    }
    
    public void Exit(Stage stage) {
        
       Alert closeAlert = new Alert(Alert.AlertType.CONFIRMATION);
       closeAlert.setTitle("Exit");
       closeAlert.setHeaderText("Wait! You are about to exit!");
       closeAlert.setContentText("Are you sure you want to exit?");
        
       if (closeAlert.showAndWait().get() == ButtonType.OK) {  
            
           System.out.println("You have successfully exited the calculator!");
           stage.close();            
        }       
    }
    
    public static void main(String[] args) {
        launch(args);
        
        Stack calcOutStack = new Stack();
        calcOutStack.push(4);
        
    }

}
