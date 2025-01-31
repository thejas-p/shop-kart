package com.tp.shop_kart.repo;

import com.tp.shop_kart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
