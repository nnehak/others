package com.neha.gs.one;

//https://www.geeksforgeeks.org/position-of-robot-after-given-movements/
public class WalkingRobot {
	public static void main(String[] args) {
		String input = "UDDLRL";
		System.out.println(position("ULDR").equals("0,0"));
		System.out.println(position("UUU").equals("0,3"));
		System.out.println(position("UP LEFT 2*DOWN DOWN RIGHT RIGHT UP UP").equals("1,1"));
	}
	
	public static String position(String in){
		Coordinate c = new Coordinate(0,0);
		int upCount=0, downCount=0, lCount=0, rCount =0;
		for(int i=0;i<in.length();i++){
			if(in.charAt(i)=='U'){
				upCount++;
			}else if(in.charAt(i)=='D'){
				downCount++;
			}else if(in.charAt(i) == 'L')
			{
				lCount++;
			}else if(in.charAt(i)=='R'){
				rCount++;
			}
			
			c.x=rCount-lCount;
			c.y=upCount-downCount;
		}
		return c.toString();
	}

}

class Coordinate{
	int x;
	int y;
	
	public Coordinate(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return x + "," + y;
	}
}
