package tcp1;

import java.net.Socket;

public class Client {
	
	String ip;
	int port;
	
	Socket socket;
	
	
	public Client(String ip, int port) {
		this.ip=ip;
		this.port=port;
	}
	public static void main(String[] args) {
		Client client = null;
		client = 
		new Client("70.12.60.90", 8888);
	}	
}
