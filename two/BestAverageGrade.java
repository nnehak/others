package com.neha.gs.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {
	
	public static void main(String[] args) {
		boolean result = true;
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student("bobby", 87));
		s.add(new Student("charls",100));
		s.add(new Student("eric", 64));
		s.add(new Student("charls", 22));
		
		Student bestStudent = averageGrade(s);
		result = result && bestStudent.grade == 87;

		s= new ArrayList<>();
		s.add(new Student("Sarah", 91));
		s.add(new Student("Goldie", 92));
		s.add(new Student("Eliane", 93));
		s.add(new Student("Eliane", 95));
		s.add(new Student("Goldie", 94));
		s.add(new Student("Sarah", 93));

		bestStudent = averageGrade(s);
		result = result && bestStudent.grade == 94;

		System.out.println(result);
	}

	static Student averageGrade(ArrayList<Student> s){
		HashMap<String, ArrayList<Integer>> smap = new HashMap<String, ArrayList<Integer>>();
		for(Student in : s){
			if(smap.containsKey(in.name)){
				ArrayList<Integer> val = smap.get(in.name);
				val.add(in.grade);
				smap.put(in.name, val);
			}else{
				ArrayList<Integer> val = new ArrayList<Integer>();
				val.add(in.grade);
				smap.put(in.name,val );
			}
		}
		//double bestAvg = 0;
		Student bestS = new Student("none", 0);
		for(Map.Entry<String, ArrayList<Integer>> ent : smap.entrySet()){
			ArrayList<Integer> g = ent.getValue();
			double total = 0;
			double avg = 0;
			for(int gr: g){
				total+=gr;
			}
			avg=total/g.size();
			System.out.println(ent.getKey() + " " + avg);
			if(bestS.grade<avg){
				bestS.name=ent.getKey();
				bestS.grade=(int)Math.floor(avg);
			}
		}

		//System.out.println(bestS.toString());
		return bestS;
	}

}

class Student {
	String name;
	int grade;
	
	public Student(String name, int grade){
		this.name=name;
		this.grade = grade;
	}
	
	public String toString(){
		return name + " " + grade;
	}
}
