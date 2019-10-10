package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import graph.DisjointSet.Graph;
import graph.MinimumSpaningTree.Edge;

import java.util.Comparator;

public class MinimumSpaningTree {
	static class Edge {
		int source;
		int destination;
		int weight;

		public Edge(int source, int destination, int weight) {
			super();
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}

		@Override
		public String toString() {
			return String.format("Edge [source=%s, destination=%s, weight=%s]", source, destination, weight);
		}
		

	}

	static class Graph {
		int vertices;
		List<Edge> edgeList;
		List<Edge> mst;

		public Graph(int vertices) {
			this.vertices = vertices;
			this.edgeList = new ArrayList<MinimumSpaningTree.Edge>();
			this.mst=new ArrayList<MinimumSpaningTree.Edge>();
		}

		public void addEgde(int source, int destination, int weight) {
			Edge edge = new Edge(source, destination, weight);
			edgeList.add(edge);
		}

		public int find(int[] parent, int i) {
			if (parent[i] == i) {
				return i;
			} else {
				return find(parent, parent[i]);
			}
		}

		public void union(int[] parent, int x, int y) {
			x = find(parent, x);
			y = find(parent, y);
			parent[y] = x;
		}

		public List<Edge> mst() {
			PriorityQueue<Edge>pq=new PriorityQueue<Edge>(edgeList.size(),
					 Comparator.comparingInt(o -> o.weight));
			for(int i=0;i<edgeList.size();i++) {
				pq.add(edgeList.get(i));
			}
			
			int[] parent = new int[vertices];
			
			for (int i = 0; i < vertices; i++) {
				parent[i] = i;
			}
			for (int i = 0; i < edgeList.size(); i++) {
				Edge edge=pq.remove();
				int x=find(parent,edge.source);
				int y=find(parent,edge.destination);
				if(x==y) {
					
				}else {
					mst.add(edge);
					union(parent,x,y);
				}
				
			}
			for(int i=0;i<vertices;i++) {
				System.out.println(parent[i]);
			}
			return mst;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(6);
		graph.addEgde(0, 1, 4);
        graph.addEgde(0, 2, 3);
        graph.addEgde(1, 2, 1);
        graph.addEgde(1, 3, 2);
        graph.addEgde(2, 3, 4);
        graph.addEgde(3, 4, 2);
        graph.addEgde(4, 5, 6);
       // graph.addEgde(7, 6, 6);
        List<Edge>mst=graph.mst();
        System.out.println(mst);

	}

}
