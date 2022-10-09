package com.rajat.inventoryservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajat.inventoryservice.entities.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long>{
    Optional<InventoryItem> findByProductCode(String productCode);
}
