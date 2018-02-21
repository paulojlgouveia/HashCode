
import java.util.ArrayList;

public class Graph {
	
	private ArrayList<int> _nodes;
	

	public Graph() {
		_nodes = new ArrayList<Node>();
	}
	
	public Graph(int nodes) {
		_nodes = new ArrayList<Node>(nodes);
	}
	
	
	public add1Edge(int source, int destination, int cost, int length) {
		_nodes[source].addEdge(destination, cost, length);
	}
	
	public add2Edge(int source, int destination, int cost, int length) {
		_nodes[source].addEdge(destination, cost, length);
		_nodes[destination].addEdge(source, cost, length);
	}
	
}