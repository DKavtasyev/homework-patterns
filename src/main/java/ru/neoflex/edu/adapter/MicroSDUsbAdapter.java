package ru.neoflex.edu.adapter;

import ru.neoflex.edu.adapter.exception.MemoryCardMissingException;
import ru.neoflex.edu.adapter.interfaces.MicroSD;
import ru.neoflex.edu.adapter.interfaces.Usb;

public class MicroSDUsbAdapter implements Usb {
	private MicroSD microSD;
	
	public void insertMicroSD(MicroSD microSD) {
		this.microSD = microSD;
	}
	
	@Override
	public String returnDataViaUsb() {
		try {
			return microSD.returnDataViaMicroSD();
		}
		catch (NullPointerException e) {
			throw new MemoryCardMissingException("В адаптере отсутствует карта памяти", e);
		}
	}
}
