package ru.neoflex.edu.adapter;

import ru.neoflex.edu.adapter.entity.Computer;
import ru.neoflex.edu.adapter.entity.flash_storage.MicroSDFlashStorage;
import ru.neoflex.edu.adapter.entity.flash_storage.UsbFlashStorage;
import ru.neoflex.edu.adapter.interfaces.MicroSD;
import ru.neoflex.edu.adapter.interfaces.Usb;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Usb flashka = new UsbFlashStorage();
		MicroSD memoryCard = new MicroSDFlashStorage();
		MicroSDUsbAdapter adapter = new MicroSDUsbAdapter();
		adapter.insertMicroSD(memoryCard);
		
		computer.readData(flashka);
		computer.readData(adapter);
	}
}
