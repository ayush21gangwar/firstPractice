package com.zarthi.firstPractice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInventory {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long inventory_id;
    private String itemName;
    private int quantity;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
