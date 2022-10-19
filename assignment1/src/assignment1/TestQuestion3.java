package assignment1;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestQuestion3 {



//	@Test
//	void test() {
//		Backend code = new Backend();
//		int inputArray[] = {1,4,1,5};
//		int X = 4;
//		int Y = 5;
//		int[] output = code.fixXY(inputArray,X,Y);	
//		int checkOutput[] = {1,4,5,1};
//		assertEquals(Arrays.toString(checkOutput),Arrays.toString(output));
//	}
//	@Test
//	void test1() {
//		Backend code = new Backend();
//		int inputArray[] = {5, 4, 9, 4, 9, 5};
//		int X = 4;
//		int Y = 5;
//		int[] output = code.fixXY(inputArray,X,Y);	
//		int checkOutput[] = {9, 4, 5, 4, 5, 9};
//		assertEquals(Arrays.toString(checkOutput),Arrays.toString(output));
//	}
//	@Test
//	void test2() {
//		Backend code = new Backend();
//		int inputArray[] = {1, 4, 1, 5, 5, 4, 1};
//		int X = 4;
//		int Y = 5;
//		int[] output = code.fixXY(inputArray,X,Y);	
//		int checkOutput[] = {1, 4, 5, 1, 1, 4, 5};
//		assertEquals(Arrays.toString(checkOutput),Arrays.toString(output));
//	}

	 public static Stream<Arguments> splitArrayTesting(){
	        return Stream.of(
	                Arguments.of(new int[] {1, 4, 1, 5}, 4, 5, new int[] {1, 4, 5, 1}),
	                Arguments.of(new int[] {5, 4, 9, 4, 9, 5}, 4, 5, new int[] {9, 4, 5, 4, 5, 9}),
	                Arguments.of(new int[] {1, 4, 1, 5, 5, 4, 1}, 4, 5, new int[] {1, 4, 5, 1, 1, 4, 5}),
	                Arguments.of(new int[] {}, 4, 5, new int[] {}),
	                Arguments.of(new int[] {1, 4, 1, 5, 5, 4, 1}, 4, 5, new int[] {1, 4, 1, 5, 5, 4, 1}),
	                Arguments.of(new int[] {1, 4, 4, 5, 5, 4, 5}, 4, 5, new int[] {1, 4, 4, 5, 5, 4, 5})
	                );
	    }
	 @ParameterizedTest
	    @MethodSource
	    public void splitArrayTesting(int[] testArr, int x, int y, int[] expected) {
	        Backend arrOperations = new Backend();
	        int[] check = arrOperations.fixXY(testArr, x, y);
	        assertArrayEquals(expected, check);
	        
	    }

}
