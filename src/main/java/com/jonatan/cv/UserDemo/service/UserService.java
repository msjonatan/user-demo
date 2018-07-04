package com.jonatan.cv.UserDemo.service;

import com.jonatan.cv.UserDemo.domain.User;

import java.util.List;

/**
 * @author msjonatan on 30/06/18
 * @project UserDemo
 */
public interface UserService {
    List<User> generateRandomUserList();
    List<User> generateRandomUserList(int amount);
    long countAll();
    String concatAll();
}
