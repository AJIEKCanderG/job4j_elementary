package ru.job4j.codewars.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author Ajiekcander
 */
public class RemoveDuplicateWordsTest {
    private Random random = new Random();
    String lets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String ans(String s){
        String[] words = s.split(" ");
        List<String> dedup = new ArrayList<>();
        for(String word : words){
            if(!dedup.contains(word)){
                dedup.add(word);
            }
        }
        return String.join(" ",dedup);
    }

    private int random(int l, int u){
        return random.nextInt(u-l)+l;
    }

    @Test
    public void basicTests(){
        assertEquals("alpha beta gamma delta", RemoveDuplicateWords.removeWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        assertEquals("my cat is fat", RemoveDuplicateWords.removeWords("my cat is my cat fat"));
    }

    @Test
    public void randomTests(){
        List<String> randWords;
        int j,k,c,cnt;
        StringBuilder randWord;
        String res;
        for(int i=0;i<100;i++){
            randWords = new ArrayList<>();
            for(j=0;j<10;j++){
                c = random(8,12);
                cnt = 0;
                randWord = new StringBuilder();
                while(cnt<c){
                    randWord.append(lets.charAt(random(0, lets.length())));
                    cnt++;
                }
                randWords.add(randWord.toString());
            }
            for(k=0;k<random(1,randWords.size());k++)
                randWords.add(random(2,randWords.size()),randWords.get(random(0,randWords.size())));
            res = String.join(" ",randWords);
            assertEquals(ans(res),RemoveDuplicateWords.removeWords(res));
        }
    }
}