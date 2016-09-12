import java.util.ArrayList;

public class MatricialShape {

	int[][] matrix = new int[][]
	{
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,1,1,1,0},
			{0,0,0,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,1,0},
			{0,0,0,0,0,1,0,1,0},
			{0,1,1,1,1,1,0,1,0},
			{0,1,0,0,0,0,0,1,0},
			{0,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,0}
	};
	
	public boolean isClosedShape()
	{	
		for (int i=0; i < matrix.length; i++){
			int[] currRow = matrix[i];
			for (int j=0; j < currRow.length; j++){
				if (currRow[j] == 1){
					int nodesSum = 0;
					/* For each node that's a 1, acquire all four surrounding non-diagonal nodes. 
					 * If there's only one 1 around this node, the shape is not closed.
					 */
					ArrayList<Integer> array = returnSurroundingNodes(matrix, i, j);
					for (Integer item:array){
						nodesSum = nodesSum + item;
					}
					if (nodesSum < 2){
						return false; 
					}
				}
			}
		}
		
		return true;
	}
	
	private ArrayList<Integer> returnSurroundingNodes(int[][] matrix, int i, int j){
		ArrayList<Integer> array = new ArrayList<Integer>();

		if (i>0) { array.add(matrix[i-1][j]); }
		
		if (j>0) { array.add(matrix[i][j-1]); }
		if (j<matrix[0].length) { array.add(matrix[i][j+1]); }

		if (i<matrix.length) { array.add(matrix[i+1][j]); }
		
		return array;
	}
	
	public boolean isPointContained(int x, int y){
		
		/** TODO **/
		
		return true;
	}
}
