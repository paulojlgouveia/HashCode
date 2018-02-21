public class Main{
	public static void main(String args[]){
		InputReader ir = new InputReader();
		
		Graph g = new Graph(ir.getParam('N'));
		System.out.println(g);
	}
}