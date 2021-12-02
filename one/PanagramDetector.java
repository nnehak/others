package com.neha.gs.one;

import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;

public class PanagramDetector {

    public static class PanagramDetectorImpl{
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        /**
         * Find the letters of alphabet not included in the input string
         * return a string made up of missing letters of alphabet in sorted order
         */
        public String findMissingLetters(String sentence){
            SortedSet<Character> missing = new TreeSet<Character>();
            for(int i=0;i<ALPHABET.length();i++){
                missing.add(new Character(ALPHABET.charAt(i)));
            }
        String s = sentence.toLowerCase();
            for(int i=0;i<s.length();i++){
                missing.remove(new Character(s.charAt(i)));
            }
            StringBuilder sb = new StringBuilder();
            for(Character c: missing){
                sb.append(c.charValue());
            }
            return sb.toString();
        }
    }

    public static void main(String[] args){
        PanagramDetectorImpl pn = new PanagramDetectorImpl();
        System.out.println("".equals(pn.findMissingLetters(
                "The quick brown fox jumps over the lazy dog")));
        System.out.println("abcdefghijklmnopqrstuvwxyz".equals(pn.findMissingLetters(
                "")));
        System.out.println("bfgjkvz".equals(pn.findMissingLetters(
                "The slow purple oryx meanders past the quiescent canine")));
    }

}
