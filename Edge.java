
public class Edge {
	
	private int _destination;
	private int _cost;
	private int _length;
	

	public Edge(int destination) {
		Edge(destination, 1, 1);
	}
	
	public Edge(int destination, int cost, int length) {
		_destination = destination;
		_cost = cost;
		_length = length;
	}
	
	
}
