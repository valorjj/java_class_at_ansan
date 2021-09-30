package Day03;

public class Day03_10 {

	public static void main(String[] args) {
		// Using DFS to make star Tree
		// triangular shape
		int level = 0;
		int shape = 3;
		singleTree(shape);

	
	
	}
	
	public static void DFS(int level, int shape) {
		
		

	}
	
	public static void singleTree(int shape) {
		for(int i=0; i<=2*shape-1; i++) {
			for(int j=0; j<=2*shape-1; j++) {
				
				if(i==2*shape-1) {
					System.out.print("*");
				} else {
					if((i+j) % 2 == 0) System.out.print("*");
					else System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}

}
