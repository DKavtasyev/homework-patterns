package ru.neoflex.edu.proxy;

public class ConnectionImpl implements Connection {
	private final String dataBaseName;
	
	public ConnectionImpl(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}
	
	public void connectToDataBase() {
		System.out.println("подключено " + dataBaseName);
	}
}
