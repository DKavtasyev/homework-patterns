package ru.neoflex.edu.proxy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ProxyConnection implements Connection {
	private final ConnectionImpl connection;
	
	public ProxyConnection(ConnectionImpl connection) {
		this.connection = connection;
	}
	
	@Override
	public void connectToDataBase() {
		PrintStream consoleStream = System.out;
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream stream = new PrintStream(outputStream);
		System.setOut(stream);
		connection.connectToDataBase();
		System.setOut(consoleStream);
		
		String message = outputStream.toString();
		String[] s = message.split(" ");
		System.out.println(s[0] + " localhost:port/" + s[1]);
	}
}
