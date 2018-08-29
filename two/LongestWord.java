package com.neha.gs.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//longest word = Given a string of letters O,E,T dictionary - {TO TOE TOES} 
//AB
//BC 
//AC
//longest word = ABC

//please can you explain problem more 
//More examples
//How to implement

//oseetg

//toes, dogs

public class LongestWord {
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(new String[] {"to","toe","toes","doe","dog","god","dogs","book","banana" });
		boolean res = true;
		res = res && new HashSet<String>(Arrays.asList("toes", "dogs")).equals(longestWord("osetdg", dic));
		res = res && new HashSet<String>(Arrays.asList("toe")).equals(longestWord("toe", dic));
		res = res && new HashSet<String>(Arrays.asList("doe", "toe", "dog", "god")).equals(longestWord("oetdg", dic));
		res = res && new HashSet<String>(Arrays.asList("book")).equals(longestWord("obokt", dic));
		res = res && new HashSet<String>(Arrays.asList("banana")).equals(longestWord("nanabaook", dic));
		res = res && new HashSet<String>().equals(longestWord("aeiou", dic));
		res = res && new HashSet<String>().equals(longestWord("a", dic));
		System.out.println(res);
	}

	public static Set<String> longestWord(String letters, Dictionary dic) {
		// Set<String> sortedLetter = new
		// HashSet<>(Arrays.asList(Stream.of(letters.split("")).sorted().reduce("",String::concat)));
		Set<String> sortedLetter = new HashSet<>();
		char[] soLet = letters.toCharArray();
		Arrays.sort(soLet);
		sortedLetter.add(new String(soLet));
		while (sortedLetter.size() > 0) {
			// List<String> allFoundInDict = sortedLetter.stream()
			// .map(lets -> dic.getEntriesForLet(lets))
			// .filter(l->l!=null)
			// .flatMap(l->l.stream())
			// .collect(Collectors.toList());
			List<String> allFoundInDict = new ArrayList<String>();
			for (String let : sortedLetter) {
				List<String> l = dic.getEntriesForLet(let);
				if (l != null) {
					allFoundInDict.addAll(l);
				}
			}
			if (allFoundInDict.size() > 0) {
				return new HashSet<String>(allFoundInDict);
			}

			sortedLetter = combinationDroppingLetter(sortedLetter);
		}
		return new HashSet<>();
	}

	public static Set<String> combinationDroppingLetter(Set<String> let) {
		Set<String> other = new HashSet<>();
		for (String l : let) {
			if (l.length() > 1) {
				for (int i = 0; i < l.length(); i++) {
					other.add(l.substring(0, i) + l.substring(i + 1, l.length()));
				}

			}
		}
		return other;
	}

}

class Dictionary {
	private Map<String, List<String>> dic = new HashMap<>();

	public Dictionary(String[] entries) {
		for (String entry : entries) {
			char[] sorted = entry.toCharArray();
			Arrays.sort(sorted);
			String so = new String(sorted);
			if (dic.containsKey(so)) {
				List<String> lis = dic.get(so);
				lis.add(entry);
			} else {
				List<String> lis = new ArrayList<String>();
				lis.add(entry);
				dic.put(so, lis);
			}
		}
	}

	public List<String> getEntriesForLet(String sort) {
		return dic.get(sort);
	}
}
