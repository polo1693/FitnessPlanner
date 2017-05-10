package com.fitnessplanner.repositories;

import com.fitnessplanner.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to store user data
 * Created by paula on 3/14/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByUsername(String username);
}
