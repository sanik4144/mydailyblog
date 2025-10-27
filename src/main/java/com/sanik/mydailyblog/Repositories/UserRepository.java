package com.sanik.mydailyblog.Repositories;

import com.sanik.mydailyblog.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
