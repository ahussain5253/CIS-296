
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class ButtonInPane extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        
        Button button = new Button("OK");
        button.setRotate(80);
        pane.getChildren().add(button);
        
        Scene scene = new Scene(pane, 200, 50);
        
        stage.setTitle("Button in a Pane");
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }


    
}
