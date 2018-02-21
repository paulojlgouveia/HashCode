
public class Edge {
	
	private int _destination;
	private int _cost;
	private int _length;
	
	public Edge(int destination, int cost, int length) {
		_destination = destination;
		_cost = cost;
		_length = length;
	}

	public Edge(int destination) {
		this(destination, 1, 1);
	}
	

	
	
	public int getDestination() { return _destination; }
	public int getCost() { return _cost; }
	public int getLength() { return _length; }
	
	
	
}
