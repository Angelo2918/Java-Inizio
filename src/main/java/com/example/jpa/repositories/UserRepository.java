package com.example.jpa.repositories;

import com.example.jpa.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
