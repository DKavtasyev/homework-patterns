package ru.neoflex.edu.singleton;

public class Main {
	public static void main(String[] args) {
		LoggingSingleton log = LoggingSingleton.getInstance();
		Object s = "1234";
		log.classLogg(s, "I like Java");
	}
}
