package com.org.gen.day14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	private Socket socket=null;
	private ServerSocket server=null;
	private DataInputStream inp = null;
	
	
	
	public ServerSide(int port) {
		super();
		// TODO Auto-generated constructor stub
		
		//start server and waits for the connection
		try {
			server = new ServerSocket(port);
			System.out.println(" Server started");
			System.out.println(" Waiting for the client......");
			socket=server.accept();
			System.out.println("Client accepted...");
			
			//take input from the client socket
			//method for communication
			inp = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			String line = "";
			while(!line.equals("Over")) {
				try {
					line=inp.readLine();
					System.out.println(line);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				System.out.println("Closing the connection.....");
				
				socket.close();
				inp.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSide server = new ServerSide(8080);
	}

}
