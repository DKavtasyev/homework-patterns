package ru.neoflex.edu.factory.entity;

public class Americano implements Coffee {
	@Override
	public void offerCoffee() {
		System.out.println("Ваш Американо готов!");
	}
}
