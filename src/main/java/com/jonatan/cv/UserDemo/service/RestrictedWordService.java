package com.jonatan.cv.UserDemo.service;

import com.jonatan.cv.UserDemo.domain.RestrictedWord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author msjonatan on 01/07/18
 * @project UserDemo
 */
@Service
public interface RestrictedWordService {
    public List<RestrictedWord> generateRandomRestrictedWordList();

    public List<RestrictedWord> generateRandomRestrictedWordList(int amount);
}
