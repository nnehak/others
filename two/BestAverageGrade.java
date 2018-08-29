package com.neha.gs.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {
	
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student("bobby", 87));
		s.add(new Student("charls",100));
		s.add(new Student("eric", 64));
		s.add(new Student("charls", 22));
		
		HashMap<String, ArrayList<Double>> smap = new HashMap<String, ArrayList<Double>>();
		for(Student in : s){
			if(smap.containsKey(in.name)){
				ArrayList<Double> val = smap.get(in.name);
				val.add(in.grade);
				smap.put(in.name, val);
			}else{
				ArrayList<Double> val = new ArrayList<Double>();
				val.add(in.grade);
				smap.put(in.name,val );
			}
		}
		double bestAvg = 0;
		Student bestS = new Student("none", 0);
		for(Map.Entry<String, ArrayList<Double>> ent : smap.entrySet()){
			ArrayList<Double> g = ent.getValue();
			double total = 0;
			double avg = 0;
			for(double gr: g){
				total+=gr;
			}
			avg=total/g.size();
			System.out.println(ent.getKey() + " " + avg);
			if(bestS.grade<avg){
				bestS.name=ent.getKey();
				bestS.grade=avg;
			}
		}
		
		System.out.println(bestS.toString());
	}

}

class Student {
	String name;
	double grade;
	double averageGrade;
	
	public Student(String name, int grade){
		this.name=name;
		this.grade = grade;
	}
	
	public String toString(){
		return name + " " + grade;
	}
}
