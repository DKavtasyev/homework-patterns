package ru.neoflex.edu.adapter.entity.flash_storage;

import ru.neoflex.edu.adapter.interfaces.MicroSD;

public class MicroSDFlashStorage extends FlashStorage implements MicroSD {
	public MicroSDFlashStorage() {
		data = "Данные из флеш-карты";
	}
	
	@Override
	public String returnDataViaMicroSD() {
		return data;
	}
}
