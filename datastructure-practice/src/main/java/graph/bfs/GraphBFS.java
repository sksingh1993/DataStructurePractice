package graph.bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphBFS {
	private static Integer v;// Number of vertex
	public static List<Integer> edge[];
	public static int[][] mat;

	public GraphBFS(Integer v) {
		this.v = v;
		edge = new List[v];
		for (int i = 0; i < v; i++) {
			edge[i] = new LinkedList();
		}
		mat = new int[v][v];

	}

	public void addEdge(int v, int w) {
		edge[v].add(w);
	}

	public void add(int v, int w) {
		mat[v][w] = 1;
	}

	public void BFS(int s) {
		boolean visited[] = new boolean[v];
		LinkedList<Integer> queue = new LinkedList();
		visited[s] = true;
		queue.add(s);
		while (queue.size() != 0) {
			int temp = queue.poll();
			System.out.print(temp + " , ");

			/*
			 * Iterator<Integer>i= edge[temp].iterator(); while(i.hasNext()) { int
			 * t=i.next(); if(!visited[t]) { visited[t]=true; queue.add(t); } }
			 */

			int[] tempArr = mat[temp];
			for (int j = 0; j < v; j++) {
				if (tempArr[j] == 1 && !visited[j]) {
					visited[j] = true;
					queue.add(j);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GraphBFS g = new GraphBFS(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		for (int i = 0; i < v; i++) {
			System.out.println(edge[i]);
		}

		System.out.println("----------------------------");
		g.add(0, 1);
		g.add(0, 2);
		g.add(1, 2);
		g.add(2, 0);
		g.add(2, 3);
		g.add(3, 3);
		/*
		 * for (int i = 0; i < v; i++) { for (int j = 0; j < v; j++) {
		 * System.out.print(mat[i][j] + " , "); } System.out.println(); }
		 */

		System.out.println("----------------------------");
		g.BFS(2);
	}

}
