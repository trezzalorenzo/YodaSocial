package com.social.yodasocial.repository;

import com.social.yodasocial.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {

    List<User> findAll();
    Optional<User> findById(Integer id);
}
