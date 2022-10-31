
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Circle circle = new Circle();
        
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        
        //Pane to hold circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        
        //Scene onto stage
        Scene scene = new Scene(pane, 200, 200);
        stage.setTitle("Show the circle");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
