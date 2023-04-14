//Author: Jiahong Cao

import java.net.*;
import java.io.*;
import java.util.Random;

public class CaesarCipherServer {
    public static void main(String[] args) throws IOException{
        //create a serverSock object
        ServerSocket serverSock = null;
        //Instantiate the ServerSocket object on a port. We can choose any port
        //from 1024-65535, since we are creating our own “toy” server. The client will
        //send its messages to this port
        try{
            serverSock = new ServerSocket(50000);
        }
        //in case the connection was unsuccessful
        catch (IOException ie){
            System.out.println("Can't listen on 50000");
            System.exit(1);
        }
        //if the connection is successful, we create a client socket (this is the mirror of
        //the client on the server process), and print out a message that says we are
        //listening for a connection. In other words, we are waiting for a client to connect to our server
        Socket link = null;
        System.out.println("Listening for connection ...");
        //If the client sends a request, we accept the connection, again using a try-catch block
        try {
            link = serverSock.accept();
        }
        catch (IOException ie){
            System.out.println("Accept failed");
            System.exit(1);
        }
        //Otherwise (if the connection is successful), we display a message that the server
        //is listening for input
        System.out.println("Connection successful");
        System.out.println("Listening for input ...");
        //Methods getInputStream and getOutputStream of the Socket class are used to
        //get references to streams associated with the socket in Step 3. For non-GUI
        //applications, we wrap the OutputStream object with a PrintWriter object and the
        //InputStream object with a BufferedReader object
        PrintWriter output = new PrintWriter(link.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(link.getInputStream()));
        //Now that we have set up the BufferedReader and the PrintWriter
        //objects, sending and receiving data is very straightforward. We use the
        //method readLine for receiving data and the method println for sending data
        //(similar to an I/O console). The program ends when it receives a “Bye”
        //message from the client
        String userInput;
        boolean encrypt = false;
        int key = 0;
    }
}
