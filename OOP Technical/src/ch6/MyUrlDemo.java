package ch6;
import java.net.*;
public class MyUrlDemo {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		URL obj = new URL("https://www.verisign.com/en_US/website-presence/online/what-is-a-url/index.xhtml");
		System.out.println("Protocol: " + obj.getProtocol());
		System.out.println("Port: " + obj.getPort());
		System.out.println("Host : " + obj.getHost());
		System.out.println("File : " + obj.getFile());
	}

}
