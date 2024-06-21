package ru.neoflex.edu.factory.entity;

public class Espresso implements Coffee {
	
	@Override
	public void offerCoffee() {
		System.out.println("Ваш Эспрессо готов!");
	}
}
