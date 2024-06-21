package ru.neoflex.edu.factory;

import ru.neoflex.edu.factory.constants.CoffeeType;
import ru.neoflex.edu.factory.entity.Americano;
import ru.neoflex.edu.factory.entity.Coffee;
import ru.neoflex.edu.factory.entity.Espresso;

public class CoffeeFabric {
	
	public Coffee getCoffee(CoffeeType coffeeType) {
		return switch (coffeeType) {
			case ESPRESSO -> new Espresso();
			case AMERICANO -> new Americano();
		};
	}
}
