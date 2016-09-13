
public class MainClass {

	static int[][] matrix = new int[][]
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
	
	public static void main(String[] args) {
		MatricialShape mShape = new MatricialShape(matrix);
		
		boolean isClosedShape = mShape.isClosedShape();
		
		System.out.println(isClosedShape);
	}
}
