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
    }
}
