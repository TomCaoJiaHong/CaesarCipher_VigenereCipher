//Author: Jiahong Cao

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class VigenereCipherClient {
    public static void main(String[] args) throws IOException{
        //Initialize a socket object that we call link, and a PrintWriter object that
        //we call output, and a BufferedReader object that we call input
        Socket link = null;
        PrintWriter output = null;
        BufferedReader input = null;
        //then the client has to create the link object, which uses the local
        //machine IP address as the destination (127.0.0.1), and the port number that the
        //server is looking for, which is 50000. Since we are testing both the client and
        //the server programs on the same machine, you should use 127.0.0.1 as the
        //destination IP address. An IP address that starts with 127 is called a loop-back
        //address and the packet doesn’t leave the machine
        try{
            link = new Socket("127.0.0.1", 50000);
            output = new PrintWriter(link.getOutputStream(), true);
            input = new BufferedReader(new InputStreamReader(link.getInputStream()));
        }
        //Catch exceptions if the above doesn’t work
        catch(UnknownHostException e)
        {
            System.out.println("Unknown Host");
            System.exit(1);
        }
        catch (IOException e){
            System.out.println("Cannot connect to host");
            System.exit(1);
        }
        //Now the client is ready to send and receive data. The BufferedReader
        //object at the client side will receive messages sent by the PrintWriter object at
        //the server side, and vice versa
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String usrInput;
    }
}
