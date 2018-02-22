import java.util.ArrayList;
public class Graph {
	
	private ArrayList<Node> _nodes;
	

	public Graph() {
		_nodes = new ArrayList<Node>();
	}
	
	public Graph(int nodes) {
		_nodes = new ArrayList<Node>(nodes);
	}
	
	
	
	public void addNode(Node node) {
		_nodes.add(node);
	}
	

	public Node getNode(int nodeId){ return _nodes.get(nodeId);}

	public String printGraph(){
		String out = "";
		Edge auxEdge;
		for(int i = 0; i < _nodes.size(); i++){
			out += i + ") Score: " + _nodes.get(i).getScore() + "edges: \n";

			for(int k = 0; k < _nodes.get(i).getEdges().size(); k++){
				auxEdge = (Edge) _nodes.get(i).getEdge(k);//.get(k);
				//out += " src " + _nodes.get(i).getEdges().get(k);
				out += " src " + auxEdge .getSource();
				out += " dest " + auxEdge .getDestination();
				out += " score " + auxEdge .getScore();
				out += "\n--\n";
			}

			out += "*--*\n";
		}

		return out;
	}
	
	
}

/*public void add1Edge(int source, int destination, int cost, int length) {
		_nodes.get(source).addEdge(destination, cost, length);
	}
	
	public void add2Edge(int source, int destination, int cost, int length) {
		_nodes.get(source).addEdge(destination, cost, length);
		_nodes.get(destination).addEdge(source, cost, length);
	}*/