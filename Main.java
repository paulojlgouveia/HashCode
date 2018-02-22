import java.util.*;

public class Main{
	public static void main(String args[]){
		InputReader ir = new InputReader();
		
		final long startTime = System.currentTimeMillis();
		//Create Graph
		Map<String,Integer> params = ir.getParams();
		List<String> streets = ir.getStreets();
		List<String> junctions = ir.getJunctions();

		Graph graph = new Graph();
		int N = params.get("N");
		int M = params.get("M");
		String[] auxStreet,coords;
		Edge auxEdge;
		Node auxNode;


		for(int n = 0; n < N; n++){
			coords = junctions.get(n).split(" ");
			graph.addNode(new Node(Float.parseFloat(coords[0]), Float.parseFloat(coords[1])));
		}

		for(int m = 0; m < M; m++){
			auxStreet = streets.get(m).split(" ");
			auxEdge = new Edge(Integer.parseInt(auxStreet[0]),Integer.parseInt(auxStreet[1])
				,Integer.parseInt(auxStreet[3]),Integer.parseInt(auxStreet[4]));
			graph.getNode(Integer.parseInt(auxStreet[0])).addEdge(auxEdge);
			if(Integer.parseInt(auxStreet[2]) == 2){
				auxEdge = new Edge(Integer.parseInt(auxStreet[1]),Integer.parseInt(auxStreet[0]),
					Integer.parseInt(auxStreet[3]),Integer.parseInt(auxStreet[4]));
				graph.getNode(Integer.parseInt(auxStreet[1])).addEdge(auxEdge);
			}
		}

		final long endTime = System.currentTimeMillis();

		//System.out.println(graph.printGraph());

		System.out.println("Total execution time: " + (endTime - startTime) );



	}
}