package Main;

import java.io.*; 
import java.net.*; 
import java.util.Date;
import java.util.Enumeration; 
import java.util.Hashtable; 
import javafx.application.Application;
import javafx.application.Platform; 
import javafx.stage.Stage; 


public class Server extends Application { 

    int cNum = 0; 
    ServerSocket serverSocket; 
    Hashtable<Object, Object> hash = new Hashtable<>();

    @Override
    public void start(Stage primaryStage) {

        new Thread(() -> {
            listen();
        }).start();
    }

    private void listen() {

        try {
            // Create server socket
            serverSocket = new ServerSocket(8000); 
            System.out.println("Server Started. Listening for a connection...\n");

            while (true) { 

                Socket socket = serverSocket.accept(); 
                DataOutputStream output = new DataOutputStream(socket.getOutputStream()); 
                cNum++;

                Platform.runLater(() -> {

                    System.out.println("Connection established...");
                    System.out.println("Starting thread for client " + cNum + "\n");
                    
                });

                hash.put(socket, output);
                new HandleClient(socket);

            }
        } catch (IOException ex) {
            
            System.out.println(ex + " \n");
            
        }

    }


    Enumeration getOutput() {
        return hash.elements();
    }


    void sendAll(String message) {

        for (Enumeration e = getOutput(); e.hasMoreElements();) {
            DataOutputStream dout = (DataOutputStream) e.nextElement();
            try {

                dout.writeUTF(message);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }



    class HandleClient extends Thread {

        private final Socket socket; 
        private String message = "";

        public HandleClient(Socket socket) throws IOException {
            this.socket = socket;
            start();
        }

        //Run Thread
        @Override
        public void run() {
            try {

                //Input from client
                DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
                while (true) {

                    message = inputFromClient.readUTF(); 
                    
                    System.out.println(new Date() + "    " + message);

                    sendAll(message); 

                }

            } catch (IOException e) {
                
                System.out.println("Error " + e + " \n");
                
                try {
                    this.socket.close();
                } catch (IOException ex) {
                    System.out.println("Error " + e + " \n");
                }
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}