package com.neha.gs.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

//Question
//IP address search in java file is based on regex? Or can I do string.contains
//How to search an IP in input line
//What is sample input and expected output

public class ApacheLogTODO {
	public static void main(String[] args) {
		System.out.println(doTestsPAss());
	}

	static boolean doTestsPAss(){
		String result;
		String[] lines = new String[] {
		"10.0.0.1 - log line 1 abc xyz",
		"10.0.0.1 - log line 2 abc xyz",
		"10.0.0.2 - log line 3 abc xyz",
		"10.0.0.2 - log line 4 abc xyz",
		"10.0.0.3 - log line 5 abc xyz"
		};
		result = findTopIpAddress(lines);
		if(!result.equals("10.0.0.1,10.0.0.2")){
			return false;
		}
		return true;
	}

	static String findTopIpAddress(String[] lines){
		//given a string find the ip address that access the site most
		//log format <ip> - log string
		//in case of tie return a comma seperated string
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int x=0;x<lines.length;x++) {
			String line = lines[x];
			String[] token = line.split(" ");
			// for(int i=0;i<token.length;i++){
			// System.out.println(token[i]);
			// }
			if (line.length()>0) {

				if (map.containsKey(token[0])) {
					map.put(token[0], map.get(token[0]) + 1);
				} else {
					map.put(token[0], 1);
				}
			}
		}

		List<String> ipAddress = new ArrayList<String>();
		Integer max = null;
		for (Map.Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
			if(max == null || ent.getValue() > max){
				max=ent.getValue();
				ipAddress.clear();
				ipAddress.add(ent.getKey());
			}else if(max == ent.getValue()){
				ipAddress.add(ent.getKey());
			}
		}

		Collections.sort(ipAddress);
		return String.join(",", ipAddress);
	}

}
