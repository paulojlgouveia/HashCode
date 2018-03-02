
import java.util.ArrayList;

public class Node {
	
 	private int _id;
	private float _latitude;
	private float _longitude;
	private float _score = 0;
	private ArrayList<Edge> _edges;
	
	public Node() {
		this(0, 0);
	}
	
	public Node(float latitude, float longitude) {
		_latitude = latitude;
		_longitude = longitude;
		_edges = new ArrayList<Edge>();
	}
	
	public Node(int id, float latitude, float longitude, ArrayList<Edge> edges) {
		int score = 0;
		for(int i = 0; i < _edges.size(); i++){
			score += _edges.get(i).getScore();
		}
		_score = score/ _edges.size(); 

		_id = id;
		_latitude = latitude;
		_longitude = longitude;
		_edges = edges;

	}
	
	public float getLatitude() { return _latitude; }
	public float getLongitude() { return _longitude; }
	public ArrayList<Edge> getEdges() { return _edges; }
	public float getScore(){ return _score;	}
	public Edge getEdge(int edgeId){return _edges.get(edgeId);}
	
	public void setScore(float score){ _score = score; }
	
	public void addEdge(Edge edge) {
		_score *= _edges.size();
		_score += edge.getScore();
		_score /= _edges.size() + 1;
		_edges.add(edge);

	}
	
	
}



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