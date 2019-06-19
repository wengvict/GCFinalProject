package com.finalproject.PlantApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.PlantApp.entity.PlantInventory;

public interface PlantInventoryRepo extends JpaRepository<PlantInventory, Integer>{

}
