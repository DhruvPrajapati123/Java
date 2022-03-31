package javanetworking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket client_socket = new Socket("hi",1234);
		BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream server_out = new DataOutputStream(client_socket.getOutputStream());
		String str;
		str = user_input.readLine();
		server_out.writeBytes(str +"\n");
		client_socket.close();
	}

}
