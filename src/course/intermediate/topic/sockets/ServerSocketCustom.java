package course.intermediate.topic.sockets;

import java.io.*;
import java.net.*;

public class ServerSocketCustom {

    private int port;
    private Socket clientSock;
    private ServerSocket serverSock;
    private PrintWriter out;
    private BufferedReader in;

    public ServerSocketCustom(int port){
        this.port = port;
    }

    public void startServer(){
        try {
            serverSock = new ServerSocket(port);
            while(true){
                System.out.println("Waiting for the client request");
                //creating socket and waiting for client connection
                clientSock = serverSock.accept();
                //read from socket to ObjectInputStream object
                ObjectInputStream ois = new ObjectInputStream(clientSock.getInputStream());
                //convert ObjectInputStream object to String
                String message = (String) ois.readObject();
                System.out.println("Message Received: " + message);
                //create ObjectOutputStream object
                ObjectOutputStream oos = new ObjectOutputStream(clientSock.getOutputStream());


                /* ---------------------------------------- */
                out = new PrintWriter(clientSock.getOutputStream(),true);
                in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));

                String inputLine;
                while ((inputLine = in.readLine())!=null){
                    out.println(inputLine);
                }
                /* ---------------------------------------- */

                //write object to Socket
                oos.writeObject("Hi Client "+message);
                //close resources
                ois.close();
                oos.close();
                serverSock.close();
                //terminate the server if client sends exit request
                if(message.equalsIgnoreCase("exit")) break;
            }
            System.out.println("Shutting down Socket server!!");
            //close the ServerSocket object
            serverSock.close();
        }catch (Exception e){
            System.out.println("Exception  - Not Available Port: "+e);
        }
    }

    public void stopServer(){
        try {
            in.close();
            out.close();
            serverSock.close();
            clientSock.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
