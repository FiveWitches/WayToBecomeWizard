package com.fivewitches.waytobecomewizard.repository;

import com.fivewitches.waytobecomewizard.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
