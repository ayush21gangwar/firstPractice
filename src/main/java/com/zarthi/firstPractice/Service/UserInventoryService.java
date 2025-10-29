package com.zarthi.firstPractice.Service;

import com.zarthi.firstPractice.Entity.UserInventory;
import com.zarthi.firstPractice.Repository.UserInventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInventoryService {
    @Autowired
    private UserInventoryRepo userInventoryRepo;
    public List<UserInventory> getAllInventories()
    {
        return userInventoryRepo.findAll();
    }
    public UserInventory saveInventory(UserInventory userInventory){
        return userInventoryRepo.save(userInventory);
    }
}
