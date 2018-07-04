package com.jonatan.cv.UserDemo.repository;

import com.jonatan.cv.UserDemo.domain.RestrictedWord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author msjonatan on 01/07/18
 * @project UserDemo
 */
public interface RestrictedWordRepository extends JpaRepository<RestrictedWord, Integer> {
}
