package ru.neoflex.edu.adapter.entity;

import ru.neoflex.edu.adapter.interfaces.Usb;

public class Computer {
	public void readData(Usb usb) {
		System.out.println("Прочитаны данные: " + usb.returnDataViaUsb());
	}
}
