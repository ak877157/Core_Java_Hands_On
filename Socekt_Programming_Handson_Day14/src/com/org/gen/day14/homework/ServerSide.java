package com.org.gen.day14.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket;
		InputStreamReader inputStreamReader;
		OutputStreamWriter outputStreamWriter;
		BufferedReader bufferedReader;
		BufferedWriter bufferedWriter;
		ServerSocket serversocket;
		
		serversocket = new ServerSocket(5555);
		
		while(true) {
			try {
				
				socket = serversocket.accept();
				
				inputStreamReader = new InputStreamReader(socket.getInputStream());
				outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
				bufferedReader = new BufferedReader(inputStreamReader);
				bufferedWriter = new BufferedWriter(outputStreamWriter);
				
				while(true) {
					String msgFromClient = bufferedReader.readLine();
					System.out.println("Client: "+msgFromClient);
					bufferedWriter.write("Message Received");
					bufferedWriter.newLine();
					bufferedWriter.flush();
					
					if(msgFromClient.equalsIgnoreCase("Bye"))
						break;

				}
				socket.close();
				inputStreamReader.close();
				outputStreamWriter.close();
				bufferedReader.close();
				bufferedWriter.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		

	}

}
