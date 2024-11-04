package com.example.jpa.services;

import com.example.jpa.dtos.CreateUserDto;
import com.example.jpa.models.User;
import com.example.jpa.repositories.UserJpaRepository;
import com.example.jpa.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserJpaRepository jpaRepository;
    @Autowired
    private ObjectMapper mapper;

    public Iterable<User> saveAll(List<User> users){return repository.saveAll(users);}

    public Iterable<User> findAllUsers(){return repository.findAll();}

    public void deletUser(Long id){repository.deleteById(id);}

    public Optional<User> findUserByUsername(String username) {
        return jpaRepository.findByUsername(username);
    }

    public User addUser(User user) {
        // Save User
        return jpaRepository.save(user);
    }
    public User createUserFromDto(CreateUserDto userDto){
        User user = mapper.convertValue(userDto,User.class);
        return jpaRepository.save(user);


    }
}
