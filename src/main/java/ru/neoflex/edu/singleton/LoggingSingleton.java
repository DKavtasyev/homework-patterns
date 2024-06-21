package ru.neoflex.edu.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoggingSingleton {
	private static volatile LoggingSingleton instance;
	
	private LoggingSingleton() {
	}
	
	public static LoggingSingleton getInstance() {
		LoggingSingleton localInstance = instance;
		
		if (localInstance == null) {
			synchronized (LoggingSingleton.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = new LoggingSingleton();
				}
			}
		}
		return instance;
	}
	
	public void classLogg(Object obj, String info) {
		String aClass = obj.getClass().getSimpleName();
		LocalDate now = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.printf("Log info: %1$s - %2$s - %3$s%n", dtf.format(now), aClass, info);
	}
}
