package com.neha.gs.two;


//distance between strings 
//this is a sample document we just made up
// we and just - 4 - e+j+u+space
//is a - 1.5 - s+space+.5

// What is solution - how to implement

public class DistanceBetweenStrings {
	
	public static void main(String[] args) {
		String doc = "this is a sample document we just made up";
		System.out.println(shortestDistance(doc, "we", "just") == 4);
		System.out.println(shortestDistance(doc, "is", "a") == 2.5);
		System.out.println(shortestDistance(doc, "is", "not") == -1);
	}
	
	public static double shortestDistance(String doc, String word1, String word2){
		String[] words = doc.split("[,. ]");
		int index = 0;
		double word1Loc=0;
		double word2Loc=0;
		double shortest = doc.length();
		
		for(String s : words){
			if(word1.equalsIgnoreCase(s)){
				word1Loc= index+(s.length()/2d);
			}else if(word2.equalsIgnoreCase(s)) {
				word2Loc=index+(s.length()/2d);
			}
			
			if(word1Loc>0 && word2Loc>0){
				double current=Math.abs(word1Loc-word2Loc);
				if(current<shortest){
					shortest=current;
				}
			}

			index+=s.length()+1;
		}
		if(word1Loc==0 || word2Loc==0){
			return -1;
		}
		return shortest;
	}
	
	//word
	//
	
//	sortestDistance(doc, word1, word2){
//		words = doc.spilt("[,.]") - spliett word
//		int index =0;
//		double shortest = doc.len;
//		double word1loc =0;
//		double word2loc =0;
//		
//		for on word - enhanced for loop
//		 if(word equals ignore case word 1)
//			 woed1loc = index+word.lengh/2;
//		elseif
//		word equals ignore case word 1
//		
//		if word1loc>0 && word2loc>0
//		double curr = Math.abs(wor1loc-word2loc)
//		
//		if(curr <sort)
//		sort=curr
//		
//		index+=wordlent+1
//		
//		if both zero return -1
	//}

}
