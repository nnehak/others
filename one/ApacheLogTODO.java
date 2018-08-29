package com.neha.gs.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Question
//IP address search in java file is based on regex? Or can I do string.contains
//How to search an IP in input line
//What is sample input and expected output

public class ApacheLogTODO {
	public static void main(String[] args) {
		FileReader f;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try {
			f = new FileReader(new File("M:\\workspace\\GSPractisePriority1\\apache.log"));
			BufferedReader br = new BufferedReader(f);
			String line = null;
			while ((line = br.readLine()) != null) {
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

			for (Map.Entry<String, Integer> ent : map.entrySet()) {
				System.out.println(ent.getKey() + " " + ent.getValue());
			}
		} catch (Exception e) {
			System.out.println("File not found");
		}
	}

}
