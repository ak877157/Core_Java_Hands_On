package com.org.gen.day14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientProgram {
	
	private Socket socket=null;
	private DataInputStream input=null;
	private DataOutputStream output=null;
	
	

	public ClientProgram(String address, int port) {
		super();
		// TODO Auto-generated constructor stub
		
		//establish connection
		try {
			socket  = new Socket(address, port);
			System.out.println(" Connected");
			//take input from terminal
			input = new DataInputStream(System.in);
			//send output to the socket
			output =new DataOutputStream(socket.getOutputStream());
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		//string to read message from input
		String line = "";
		//keep reading until over is input
		while(!line.equals("Over")) {
			try {
				line = input.readLine();
				output.writeUTF(line);
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				input.close();
				output.close();
				socket.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientProgram client = new ClientProgram("127.0.0.1", 8080);

	}

}
