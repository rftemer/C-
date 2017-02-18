import static org.junit.Assert.*;

import org.junit.Test;

public class HellTriangleTest {

	@Test
	public void testNoTriangle() {
		HellTriangle hell = new HellTriangle();
		int[][] input = {{1},{2}};
		assertEquals(-1, hell.CalculateSum(input));
	}
	
	@Test
	public void testNoTriangleWithOneElement() {
		HellTriangle hell = new HellTriangle();
		int[][] input = {{1}};
		assertEquals(-1, hell.CalculateSum(input));
	}
	
	@Test
	public void testTriangleWithTwoLeves() {
		HellTriangle hell = new HellTriangle();
		int[][] input = {{1}, {2,3}};
		assertEquals(4, hell.CalculateSum(input));
	}
	
	@Test
	public void testTriangleSample() {
		HellTriangle hell = new HellTriangle();
		int[][] input = {{6}, {3,5}, {9, 7, 1}, {4, 6, 8, 4}};
		assertEquals(26, hell.CalculateSum(input));
	}
	
	@Test
	public void testTriangleReverse() {
		HellTriangle hell = new HellTriangle();
		int[][] input = {{4, 6, 8, 4}, {9, 7, 1}, {3,5}, {6}};
		assertEquals(-1, hell.CalculateSum(input));
	}

}
