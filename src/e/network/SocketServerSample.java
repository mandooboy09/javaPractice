package e.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args){
        SocketServerSample sample = new SocketServerSample();
//        sample.startServer();
        sample.startReplyServer("OK");
    }
    public void startServer(){
        ServerSocket server = null;
        Socket client = null;
        try{
            server = new ServerSocket(9999);
            while(true){
                System.out.println("Server:Waiting for request.");
                client = server.accept();
                System.out.println("Server:Accepted.");
                InputStream stream = client.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while((data = in.readLine()) != null){
                    receivedData.append(data);
                }
                System.out.println("Received data:"+receivedData);
                in.close();
                stream.close();
                client.close();
                if(receivedData != null && "EXIT".equals(receivedData.toString())){
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("---------");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if(server != null){
                try{
                    server.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void startReplyServer(String data){
        ServerSocket server = null;
        Socket client = null;
        try{
            server = new ServerSocket(9999);
            System.out.println("Server:Waiting for request.");
            client = server.accept();
            System.out.println("Server:Accepted.");
            OutputStream stream = client.getOutputStream();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(stream));
            out.write(data);
            System.out.println("Sent data:" + data);
            out.close();
            stream.close();
            client.close();
            System.out.println("---------");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if(server != null){
                try{
                    server.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
