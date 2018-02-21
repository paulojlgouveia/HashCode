
import java.util.ArrayList;

public class Node {
	
// 	private int _id;
	private float _latitude;
	private float _longitude;
	
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
		this(0, 0);
	}
	
	public Node(float latitude, float longitude) {
		_latitude = latitude;
		_longitude = longitude;
		_edges = new ArrayList<Edge>();
	}
	
	public Node(int id, float latitude, float longitude, ArrayList<Edge> edges) {
		_latitude = latitude;
		_longitude = longitude;
		_edges = edges;
	}
	
	public float getLatitude() { return _latitude; }
	public float getLongitude() { return _longitude; }
	public ArrayList getEdges() { return _edges; }
	
	
	public void addEdge(int destination, int cost, int length) {
		_edges.add(new Edge(destination, cost, length));
	}
	
	
}

