package javanetworking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket server_socket = new ServerSocket(1234);
		while(true) {
			Socket listen = server_socket.accept();
			BufferedReader client_input = new BufferedReader(new InputStreamReader(listen.getInputStream()));
			String client_str;
			client_str = client_input.readLine();
			System.out.println(client_str);
		}
	}

}
