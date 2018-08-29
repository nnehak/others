package com.neha.gs.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

/*train map - represent station in rail n/w, station have unique name, shortest path - one way graph multipl path
shortest path with min sum*/
//what is exact problem
//Input and output examples
//HOw to implement
public class TrainMap {
	
	private HashMap<String, Station> stations;
	
	public TrainMap(){
		this.stations= new HashMap<>();
	}
	
	public TrainMap addStation(String name){
		Station s = new Station(name);
		this.stations.putIfAbsent(name, s);
		return this;
	}
	
	public Station getStation(String name){
		return this.stations.get(name);
	}
	
	public TrainMap connectStations(Station from, Station to){
		if(from == null){
			throw new IllegalArgumentException();
		}
		if (to == null){
			throw new IllegalArgumentException();
		}
		from.addNeighbour(to);;
		to.addNeighbour(from);;
		return this;
	}
	
	public List<Station> shortestPathBFS(String from, String to){
		Station root = this.stations.get(from);
		if(root == null){
			throw new IllegalArgumentException();
		}
		Station goalNode = this.stations.get(to);
		if(goalNode == null){
			throw new IllegalArgumentException();
		}
		LinkedList<Station> searchSpace=new LinkedList<>();
		Map<Station,Station> parentOftheNode= new HashMap<>();
		Set<Station> visited = new HashSet<>();
		
		searchSpace.add(root);
		while(!searchSpace.isEmpty()){
			Station curr = searchSpace.poll();
			if(!visited.contains(curr)){
				visited.add(curr);
				if(curr.equals(goalNode)){
					break;
				}else{
					 curr.getNeighbours().stream().forEach(station -> {parentOftheNode.putIfAbsent(station, curr);
					 searchSpace.addLast(station);
						 });
				}
			}
		}
		
		LinkedList<Station> shortestPath = new LinkedList<Station>();
		Station parentNode = parentOftheNode.get(goalNode);
		shortestPath.addFirst(goalNode);
		shortestPath.addFirst(parentNode);
		while(!parentNode.equals(root)){
			parentNode=parentOftheNode.get(parentNode);
			shortestPath.addFirst(parentNode);
		}
		return shortestPath;
	}
	
	public Set<List<Station>> getAllPathsDFS(String from, String to){
		Set<List<Station>> allPaths = new HashSet<> ();
		Station root = this.stations.get(from);
		Station goalNode = this.stations.get(to);
		Stack<Station> searchSpace = new Stack<>();
		searchSpace.push(root);
		addAllPathsDFSRecursive(searchSpace, goalNode, allPaths);
		return allPaths;
	}
	
	public void addAllPathsDFSRecursive(Stack<Station> searchSpace, Station goalNode, Set<List<Station>> paths){
		Station current = searchSpace.peek();
		if(current.equals(goalNode)){
			Station[] path = new Station[searchSpace.size()];
			paths.add(Arrays.asList(searchSpace.toArray(path)));
		}else{
			for(Station v : current.getNeighbours()){
				if(!searchSpace.contains(v)){
					searchSpace.push(v);
					addAllPathsDFSRecursive(searchSpace, goalNode, paths);
				}
			}
		}
		searchSpace.pop();
	}
	
	public List<Station> shoertestPathDFS(String from, String to){
		Set<List<Station>> paths = getAllPathsDFS(from, to);
		List<Station> shortest = null;
		for(List<Station> path : paths){
			if(shortest == null || shortest.size() > path.size()){
				shortest=path;
			}
		}
		return shortest;
	}

}

class Station{
	private String name;
	private List<Station> neighbours;
	
	public Station(String name){
		this.name=name;
		this.neighbours=new ArrayList<>();
	}
	
	String getName(){
		return this.name;
	}
	
	void addNeighbour(Station v){
		this.neighbours.add(v);
	}
	
	List<Station> getNeighbours(){
		return this.neighbours;
	}
	
	public boolean equals(Object obj){
		return (obj instanceof Station) && this.name.equals(((Station) obj).getName());
	}
	
	public int hashcode(){
		return Objects.hash(this.getName());
	}
}
