package Main;

import java.io.*; 
import java.net.*; 
import javafx.application.Application; 
import javafx.application.Platform;
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.TextArea; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Client extends Application {
    
    //Initialize main variables
    DataOutputStream tServer = null; 
    DataInputStream fServer = null; 
    Label username = new Label("Enter your name");
    Label textl = new Label("Enter Message"); 
    TextField textf = new TextField(); 
    TextField namef = new TextField(); 
    Button send = new Button("Send"); 
    TextArea messagef = new TextArea(); 


    @Override
    public void start(Stage stage) throws IOException {

        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(10, 10, 10, 10));

        StackPane.setAlignment(username, Pos.TOP_LEFT);
        namef.setMaxWidth(200);
        StackPane.setAlignment(namef, Pos.TOP_CENTER);

        StackPane.setMargin(textl, new Insets(30, 0, 0, 0));
        StackPane.setMargin(textf, new Insets(30, 0, 0, 0));
        StackPane.setAlignment(textl, Pos.TOP_LEFT);
        textf.setMaxWidth(200);
        StackPane.setAlignment(textf, Pos.TOP_CENTER);

        StackPane.setAlignment(send, Pos.BOTTOM_CENTER);
        messagef.setMaxSize(450, 250);
        StackPane.setAlignment(messagef, Pos.CENTER);

        stackPane.getChildren().addAll(username, namef, send, messagef, textl, textf);

        // Create scene and place in the stage
        Scene scene = new Scene(stackPane, 500, 400);
        stage.setTitle("Chat Room"); 
        stage.setScene(scene); 
        stage.show(); 

        send.setOnAction(e -> {
            try {
                if (namef.getText().trim().length() == 0) { //name field is empty
                    messagef.appendText("Please enter your name\n");
                } else if (textf.getText().trim().length() == 0) { //message field is empty
                    messagef.appendText("Please enter your message to send\n");
                }
                
                if (namef.getText().trim().length() > 0 && textf.getText().trim().length() > 0) {
                    tServer.writeUTF(namef.getText().trim() + " : " + textf.getText().trim());
                    tServer.flush();
                }

            } catch (IOException ex) {
                messagef.appendText(ex+"   \n");
            }
        });

        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 8000); //socket with port number to connect server

            // Create an output stream to send data to the server
            tServer = new DataOutputStream(socket.getOutputStream());
            new ReceiveMessage(socket); // send socket receieve class
//            }
        } catch (Exception ex) {
            messagef.setText(ex.toString() + '\n');
        }

    }

    class ReceiveMessage implements Runnable {

        Socket socket;//socket

        public ReceiveMessage(Socket socket) { 
            this.socket = socket;
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.start();
        }

        @Override
        public void run() {
            try {
                fServer = new DataInputStream(socket.getInputStream());
                while (true) { 
       
                    String message = fServer.readUTF(); 
                    tServer.flush(); 
                    Platform.runLater(() -> {
                        messagef.appendText(message + " \n");
                    });
                }
            } catch (IOException e) {
                messagef.appendText("Error " + e);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}