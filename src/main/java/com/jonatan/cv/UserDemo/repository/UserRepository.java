package com.jonatan.cv.UserDemo.repository;

import com.jonatan.cv.UserDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author msjonatan on 01/07/18
 * @project UserDemo
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
