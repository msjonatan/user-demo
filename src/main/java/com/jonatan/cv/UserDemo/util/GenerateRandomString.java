package com.jonatan.cv.UserDemo.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author msjonatan on 30/06/18
 * @project UserDemo
 */
@Service
public class GenerateRandomString {
    /**
     * Generates a list of 2000 random words.
     * @return
     */
    public List<String> generateList(int amount){
        List<String> generatedNames = new ArrayList<>();
        for(int i = 0; i<amount; i++){
            String genetatedName = RandomStringUtils.randomAlphabetic(3, 15);
            if(!searchExisting(generatedNames, genetatedName)){
                generatedNames.add(genetatedName);
            }
        }
        return generatedNames;
    }

    /**
     * Search a specific name in the existing generatedNames list
     * @param generatedNames
     * @param name
     * @return true if the name exists.
     */
    private boolean searchExisting(List<String> generatedNames, String name){
        boolean exists = false;
        for (String generatedName : generatedNames){
            if(generatedName.equals(name)){
                exists = true;
            }
        }
        return exists;
    }
}
