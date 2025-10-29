package com.zarthi.firstPractice.Repository;

import com.zarthi.firstPractice.Entity.UserInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInventoryRepo extends JpaRepository<UserInventory,Long> {
}
