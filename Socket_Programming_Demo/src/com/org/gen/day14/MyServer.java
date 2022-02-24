package com.org.gen.day14;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(6666);
			Socket s = server.accept(); //establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("Message= "+str);
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
