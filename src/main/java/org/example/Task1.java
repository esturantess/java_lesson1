//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

package org.example;

import java.util.Arrays;

public class Task1 {
    public void reversePhrase(String phrase){
        String[] arr = phrase.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
