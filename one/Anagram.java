package com.neha.gs.one;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(anagram("Silent".toLowerCase(), "Listen".toLowerCase()));
	}
	
	public static boolean anagram(String one, String two){
		if(one == null || one.length()<1){
			return false;
		}
		
		if(two==null || two.length()<1){
			return false;
		}
		if(one.length()!=two.length()){
			return false;
		}
		HashMap<Character, Integer> map1 = new HashMap();
		map1 = getCharCount(one);
		for(int i=0;i<two.length();i++){
			if(map1.containsKey(two.charAt(i))){
				map1.put(two.charAt(i), (map1.get(two.charAt(i))-1));
			}
		}
		for(Map.Entry<Character, Integer> ent : map1.entrySet()){
			if(ent.getValue() !=0){
				return false;
			}
		}
		return true;
	}
	
	public static HashMap<Character, Integer> getCharCount(String in){
		char[] inCh = in.toCharArray();
		HashMap<Character, Integer> ret = new HashMap();
		for(int i=0;i<in.length();i++){
			if(ret.containsKey(inCh[i])){
				ret.put(inCh[i], ret.get(inCh[i]));
			}else{
				ret.put(inCh[i], 1);
			}
		}
		
		
		return ret;
	}

}
