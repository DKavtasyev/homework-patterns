package ru.neoflex.edu.adapter.entity.flash_storage;

import ru.neoflex.edu.adapter.interfaces.Usb;

public class UsbFlashStorage extends FlashStorage implements Usb {
	public UsbFlashStorage() {
		data = "Данные из USB флеш-накопителя";
	}
	
	@Override
	public String returnDataViaUsb() {
		return data;
	}
}
