package com.finalproject.PlantApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.PlantApp.entity.PlantInventory;

public interface PlantInventoryRepo extends JpaRepository<PlantInventory, Integer>{
	List<PlantInventory> findByUserId(String userId);

}
