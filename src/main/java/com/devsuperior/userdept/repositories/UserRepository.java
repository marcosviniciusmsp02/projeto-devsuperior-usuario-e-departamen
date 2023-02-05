package com.devsuperior.userdept.repositories;

import com.devsuperior.userdept.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
