package com.msservice.drak_api.service;


import com.msservice.drak_api.model.House;
import com.msservice.drak_api.repository.HouseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HouseService {
	private final HouseRepository houseRepository;

	public List<House> getAllHouses() {
		return houseRepository.findAll();
	}
	public House getHouseById(Long id) {
		return houseRepository.findById(id).orElse(null);
	}
	public House saveHouse(House house) {
		return houseRepository.save(house);
	}
	public void deleteHouse(Long id) {
		houseRepository.deleteById(id);
	}
	public House updateHouse(House house) {
		return houseRepository.save(house);
	}
}
