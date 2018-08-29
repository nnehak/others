package com.neha.gs.one;

//https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters//

public class LongestNonRepeatingSubString {
	
	public static void main(String[] args) {
		String str = "ABDEFGABEF";
        System.out.println("The input string is "+str);
        int len = longestSubStr(str);
        System.out.println("The length of "
                + "the longest non repeating character is "+len);
	}
	
	public static int longestSubStr(String str){
		int n=str.length();
		int curLen=1;
		int maxLen=1;
		int prevIndex;
		int i;
		int visited[] = new int[256];
		int begin = 0;
		int end =0;
		String maxString = "";
		
		for(i=0;i<256;i++){
			visited[i]=-1;
		}
		
		visited[str.charAt(0)]=0;
		
		for(i=1;i<n;i++){
			prevIndex=visited[str.charAt(i)];
			if(prevIndex==-1 || i-curLen>prevIndex){
				curLen++;
			}else{
				if(curLen>maxLen){
					maxLen=curLen;
					begin=prevIndex+1;
					end = i;
					maxString=str.substring(begin,end+1);
				}
				curLen=i-prevIndex;
			}
			visited[str.charAt(i)]=i;
		}
		if(curLen > maxLen)
            maxLen = curLen;
		System.out.println(maxString);
		return maxLen;
		
		
	}

}
