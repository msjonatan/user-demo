package com.jonatan.cv.UserDemo.serviceImpl;

import com.jonatan.cv.UserDemo.domain.RestrictedWord;
import com.jonatan.cv.UserDemo.service.RestrictedWordService;
import com.jonatan.cv.UserDemo.util.GenerateRandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author msjonatan on 01/07/18
 * @project UserDemo
 */
@Service
public class RestrictedWordServiceImpl implements RestrictedWordService {

    @Autowired
    GenerateRandomString generateRandomString;

    @Override
    public List<RestrictedWord> generateRandomRestrictedWordList() {
        return generateRandomRestrictedWordList(2000);
    }

    @Override
    public List<RestrictedWord> generateRandomRestrictedWordList(int amount) {
        List<String> generatedWords = generateRandomString.generateList(amount);
        List<RestrictedWord> restrictedWordList = new ArrayList<>();
        for (String name : generatedWords){
            RestrictedWord restrictedWord = new RestrictedWord();
            restrictedWord.setWord(name);
            restrictedWordList.add(restrictedWord);
        }
        return restrictedWordList;
    }
}
