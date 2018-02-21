
import java.util.ArrayList;
import Edge;


public class Node {
	
// 	private int _id;
	private int _latitude;
	private int _longitude;
	
	private ArrayList<Edge> _edges;
	

// 	public Node(int id) {
// 		Node(id, 0, 0);
// 	}
// 	
// 	public Node(int id, float latitude, float longitude) {
// 		_id = id;
// 		_latitude = latitude;
// 		_longitude = longitude;
// 	}
// 	
// 	public Node(int id, float latitude, float longitude, ArrayList<Edge> edges) {
// 		_id = id;
// 		_latitude = latitude;
// 		_longitude = longitude;
// 		
// 		_edges = edges;
// 	}
	
	public Node() {
		Node(0, 0);
	}
	
	public Node(float latitude, float longitude) {
		_latitude = latitude;
		_longitude = longitude;
		_edges = new ArrayList<Edge>()
	}
	
	public Node(int id, float latitude, float longitude, ArrayList<Edge> edges) {
		_latitude = latitude;
		_longitude = longitude;
		_edges = edges;
	}
	
	public int getLatitude() { return _latitude; }
	public int getLongitude() { return _longitude; }
	public ArrayList getEdges() { return _edges; }
	
	
	public void addEdge(int destination, int cost, int length) {
		_edges.add(new Edge(destination, cost, length));
	}
	
	
}

