package com.zarthi.firstPractice.Controller;

import com.zarthi.firstPractice.Entity.UserInventory;
import com.zarthi.firstPractice.Service.UserInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-inventory")
public class UserInventoryController {
    @Autowired
    private UserInventoryService userInventoryService;

    @GetMapping("/get-user-inventory")
    public List<UserInventory> getAllUserInventory()
    {
      return  userInventoryService.getAllInventories();
    }

    @PostMapping("/save-user-inventory")
    public UserInventory saveInventory(@RequestBody UserInventory userInventory)
    {
        return userInventoryService.saveInventory(userInventory);
    }
}
