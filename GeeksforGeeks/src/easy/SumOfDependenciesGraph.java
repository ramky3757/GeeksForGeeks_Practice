package easy;

public class SumOfDependenciesGraph {
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,3);
		
			Graph g1 = new Graph(4);
				g1.addEdge(0,2);
				g1.addEdge(0,1);
				g1.addEdge(0,3);
		System.out.println(g.dependencies());
		System.out.println(g1.dependencies());
		
	}

}

class Graph{
    
    int[][] adjMatrix;
    int vertices;
    
    Graph(int vertices){
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }
    
    public void addEdge(int x, int y){
        adjMatrix[x][y] = 1;
    }
    
    public int dependencies(){
        int counter =0;
        
        for(int i=0; i<vertices; i++){
            
            for(int j=0; j<vertices; j++){
                
                if(adjMatrix[i][j] == 1){
                    counter++;
                }
            }
        }
        return counter;
    }
}
