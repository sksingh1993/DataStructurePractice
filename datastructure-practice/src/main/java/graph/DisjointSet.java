package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author suraj.singh
 * 
 * This class checks whether graph contain cycle or not.
 * Also finds number of disjoint set
 *
 */

public class DisjointSet {
	
	static class Edge{
		int source;
		int destination;
		public Edge(int source, int destination) {
			super();
			this.source = source;
			this.destination = destination;
		}
		@Override
		public String toString() {
			return String.format("Edge [source=%s, destination=%s]", source, destination);
		}
		
		
	}

	static class Graph{
		boolean isCycle;
		int vertices;
		List<Edge> edgeList=new ArrayList();
		public Graph(int vertices) {
			super();
			this.vertices = vertices;
		}
		
		public void addEdge(int source,int destination) {
			Edge edge=new Edge(source,destination);
			edgeList.add(edge);
		}
		
		public int find(int parent[],int i ) {
			if(parent[i]==i) {
				return i;
			}else {
				return find(parent,parent[i]);
			}
		}
		public void union(int parent[],int x,int y) {
			x=find(parent,x);
			y=find(parent,y);
			parent[y]=x;
		}
		
		public void disjoint() {
			int[] parent=new int[vertices];
			for(int i=0;i<vertices;i++) {
				parent[i]=i;
			}
			for(int i=0;i<edgeList.size();i++) {
				Edge edge=edgeList.get(i);
				int x=find(parent,edge.source);
				int y=find(parent,edge.destination);
				if(x!=y) {
					union(parent,x,y);
				}else {
					isCycle=true;
				}
			}
			if(isCycle) {
				System.out.println("Cycle present");
			}else {
				System.out.println("Cycle not present");
			}
			for(int i=0;i<vertices;i++) {
				System.out.print(parent[i]+" , ");
			}
			printDisjointSet(parent);
			
		}
		
		public void printDisjointSet(int [] parent) {
			Map<Integer,List<Integer>> map=new HashMap();
			for(int i=0;i<vertices;i++) {
				int temp=parent[i];
				if(map.containsKey(temp)) {
					List<Integer>list=map.get(temp);
					list.add(i);
					map.put(temp, list);
				}else {
					List<Integer>list=new ArrayList<Integer>();
					list.add(i);
					map.put(temp, list);
				}
			}
			System.out.println(map);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph=new Graph(6);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		graph.addEdge(4,5);
		//graph.addEdge(2,1);
		System.out.println(graph.edgeList);
		graph.disjoint();

	}

}
