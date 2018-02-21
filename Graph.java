import java.util.ArrayList;
public class Graph {
	
	private ArrayList<Node> _nodes;
	

	public Graph() {
		_nodes = new ArrayList<Node>();
	}
	
	public Graph(int nodes) {
		_nodes = new ArrayList<Node>(nodes);
	}
	
	
	
	public void addNode(float latitude, float longitude) {
		_nodes.add(new Node(latitude, longitude));
	}
	
	public void add1Edge(int source, int destination, int cost, int length) {
		_nodes.get(source).addEdge(destination, cost, length);
	}
	
	public void add2Edge(int source, int destination, int cost, int length) {
		_nodes.get(source).addEdge(destination, cost, length);
		_nodes.get(destination).addEdge(source, cost, length);
	}
	
}