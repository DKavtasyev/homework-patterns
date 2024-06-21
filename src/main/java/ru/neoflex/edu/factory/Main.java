package ru.neoflex.edu.factory;

import ru.neoflex.edu.factory.entity.Coffee;

import static ru.neoflex.edu.factory.constants.CoffeeType.*;

public class Main {
	public static void main(String[] args) {
		CoffeeFabric coffeeFabric = new CoffeeFabric();
		Coffee espresso = coffeeFabric.getCoffee(ESPRESSO);
		Coffee americano = coffeeFabric.getCoffee(AMERICANO);
		espresso.offerCoffee();
		americano.offerCoffee();
	}
}
