package com.example.jpa.services;
import com.example.jpa.dtos.CreateUserDto;
import com.example.jpa.models.Instrument;
import com.example.jpa.models.User;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserService {
    Iterable<User> saveAll(List<User> users);

    Iterable<User> findAllUsers();

    void deleteUser(Long id);

    Optional<User> findUserByUsername(String username);

    User addUser(User user);

    User createUserFromDto(CreateUserDto userDto);

    Set<Instrument> getWishlist(Long id);
}