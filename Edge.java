
public class Edge {
	
	private int _source;
	private int _destination;
	private int _cost;
	private int _length;
	private boolean _visited = false;
	private float _score;
	
	public Edge(int source, int destination, int cost, int length) {
		_destination = destination;
		_source = source;
		_cost = cost;
		_length = length;
		_score = length/cost;
	}

	
	public int getSource() { return _source; }
	public int getDestination() { return _destination; }
	public int getCost() { return _cost; }
	public int getLength() { return _length; }
	public boolean getVisited() {return _visited; }
	public float getScore(){ return _score;}
	
	
	
}

/*public Edge(Node destination) {
		this(destination, 1, 1);
	}*/
