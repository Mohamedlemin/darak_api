package com.msservice.drak_api.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class House {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private  String address;
	private String imageUrl;
	private String price;
	private String description;

}
