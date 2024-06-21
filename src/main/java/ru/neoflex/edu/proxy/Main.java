package ru.neoflex.edu.proxy;

public class Main {
	public static void main(String[] args) {
		Connection connection = new ConnectionImpl("my_database");
		connection.connectToDataBase();
		
		@SuppressWarnings("CastCanBeRemovedNarrowingVariableType") Connection proxyConnection = new ProxyConnection((ConnectionImpl) connection);
		proxyConnection.connectToDataBase();
	}
}
