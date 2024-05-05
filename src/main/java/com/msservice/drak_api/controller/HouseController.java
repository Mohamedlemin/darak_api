package com.msservice.drak_api.controller;

import com.msservice.drak_api.model.House;
import com.msservice.drak_api.service.HouseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/house")
public class HouseController {
	private final HouseService houseService;

	@GetMapping()
	public List<House> getAllHouses() {
		return houseService.getAllHouses();
	}

	@PostMapping()
	public House saveHouse(House house) {
		return houseService.saveHouse(house);
	}
	@GetMapping("/{id}")
	public House getHouseById(Long id) {
		return houseService.getHouseById(id);
	}

	@PostMapping("/update")
	public House updateHouse(House house) {
		return houseService.updateHouse(house);
	}
	@PutMapping("{id}")
	public House updateHouse(@PathVariable Long id, @RequestBody House house) {
		house.setId(id);
		return houseService.updateHouse(house);
	}

	@DeleteMapping("{id}")
	public void deleteHouse(@PathVariable Long id) {
		houseService.deleteHouse(id);
	}


}
