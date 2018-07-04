package com.jonatan.cv.UserDemo.serviceImpl;

import com.jonatan.cv.UserDemo.domain.User;
import com.jonatan.cv.UserDemo.repository.UserRepository;
import com.jonatan.cv.UserDemo.service.UserService;
import com.jonatan.cv.UserDemo.util.GenerateRandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author msjonatan on 30/06/18
 * @project UserDemo
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    GenerateRandomString generateRandomString;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> generateRandomUserList() {
        return generateRandomUserList(2000);
    }

    @Override
    public List<User> generateRandomUserList(int amount) {
        List<String> generatedWords = generateRandomString.generateList(amount);
        List<User> userList = new ArrayList<>();
        for (String name : generatedWords){
            User user = new User();
            user.setUsername(name);
            userList.add(user);
        }
        return userList;
    }

    @Override
    public long countAll() {
        return userRepository.count();
    }

    @Override
    public String concatAll() {
        List<User> userList = userRepository.findAll();
        StringBuilder stringBuilder = new StringBuilder();
        for (User user:userList
             ) {
            stringBuilder.append(user.getUsername());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
