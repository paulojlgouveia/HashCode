
import java.util.ArrayList;

public class Graph {
	
	private ArrayList<int> _vertices;
	private ArrayList<ArrayList<>> _edges;
	

	public Graph(int vertices) {
		
	}
	
	public addEdge(int source, int destination, int cost, int length) {
		
	}
	
}


from igraph import *

def main():

	file = open("files/paris_54000.txt",'r')
	input = file.readlines()
	params = input[0].split()
	N = int(params[0])
	M = int(params[1])
	T = int(params[2])
	C = int(params[3])
	S = int(params[4])
	junctions = input[1:N+1]
	streets = input[N+1:]
	
	
	g = Graph()
	
	g.add_vertices(N)
	
	print(g)




if __name__ == '__main__':
	main()
