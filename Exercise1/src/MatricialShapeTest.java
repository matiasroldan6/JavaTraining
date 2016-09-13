import static org.junit.Assert.*;

import org.junit.Test;


public class MatricialShapeTest {

	private MatricialShape matrix;
	
	@Test
	public void testClosedShape() {
		int[][] shape = new int[][]
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
		
		matrix =  new MatricialShape(shape);
		assertTrue(matrix.isClosedShape());
	}
	
	@Test
	public void testOpenShape() {
		int[][] shape = new int[][]
				{
						{0,0,0,0,0,0,0,0,0},
						{0,0,0,0,0,0,1,1,0},
						{0,0,0,0,0,1,0,1,0},
						{0,0,0,0,0,1,0,1,0},
						{0,0,0,0,0,1,0,1,0},
						{0,1,1,1,1,1,0,1,0},
						{0,1,0,0,0,0,0,1,0},
						{0,1,1,1,1,1,1,1,0},
						{0,0,0,0,0,0,0,0,0}
				};
		
		matrix =  new MatricialShape(shape);
		assertFalse(matrix.isClosedShape());
	}
}
