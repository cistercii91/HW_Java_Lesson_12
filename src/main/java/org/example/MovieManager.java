package org.example;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    private String [] movieSet = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void movieAdd (String name) {
        String [] tmp = new String [movieSet.length + 1];
        for (int i = 0; i < movieSet.length; i++) {
            tmp [i] = movieSet[i];
        }
        tmp[tmp.length - 1] = name;
        movieSet = tmp;
    }

    public String[] findAll() {
        return movieSet;
    }

    public String[] findLast() {
        int resultLength;
        if (movieSet.length < limit) {
            resultLength = movieSet.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movieSet[movieSet.length - 1 - i];
        }
        return tmp;
    }


}
