package com.zarthi.firstPractice.Repository;

import com.zarthi.firstPractice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
