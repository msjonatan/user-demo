package com.jonatan.cv.UserDemo;


import com.jonatan.cv.UserDemo.domain.RestrictedWord;
import com.jonatan.cv.UserDemo.domain.User;
import com.jonatan.cv.UserDemo.repository.RestrictedWordRepository;
import com.jonatan.cv.UserDemo.repository.UserRepository;
import com.jonatan.cv.UserDemo.service.RestrictedWordService;
import com.jonatan.cv.UserDemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @Autowired
    RestrictedWordService restrictedWordService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestrictedWordRepository restrictedWordRepository;

	public static void main(String[] args) {
	    SpringApplication.run(UserDemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        List<User> userList = userService.generateRandomUserList();
        userRepository.saveAll(userList);
        List<RestrictedWord> restrictedWordList =restrictedWordService.generateRandomRestrictedWordList();
        restrictedWordRepository.saveAll(restrictedWordList);
        logger.info("Random Users created: " +userList.size());
        logger.info("Random Restricted Words created: " +restrictedWordList.size());
    }
}
