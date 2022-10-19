package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestQuestion1 {

	

//	@Test
//	void test() {
//		Backend code = new Backend();
//		int inputArray[] = {1, 2, 3, 8, 9, 3, 2, 1};
//		int output = code.maxMirror(inputArray);
//		assertEquals(3,output);
//	}
//	@Test
//	void test2() {
//		Backend code = new Backend();
//		int inputArray[] = {7, 1, 4, 9, 7, 4, 1};
//		int output = code.maxMirror(inputArray);
//		assertEquals(2,output);
//	}
//
//	@Test
//	void test3() {
//		Backend code = new Backend();
//		int inputArray[] = {1, 2, 1, 4};
//		int output = code.maxMirror(inputArray);
//		assertEquals(3,output);
//	}
//	
//	@Test
//	void test4() {
//		Backend code = new Backend();
//		int inputArray[] = {1, 4, 5, 3, 5, 4, 1};
//		int output = code.maxMirror(inputArray);
//		assertEquals(7,output);
//	}
//	
//	@Test
//	void test5() {
//		Backend code = new Backend();
//		int inputArray[] = {};
//		int output = code.maxMirror(inputArray);
//		assertEquals(0,output);
//	}

	  public static Stream<Arguments> maxMirrorTesting(){
	        return Stream.of(
	                Arguments.of(new int[] {1, 2, 3, 8, 9, 3, 2, 1}, new int[] {3}),
	                Arguments.of(new int[] {7, 1, 4, 9, 7, 4, 1}, new int[] {2}),
	                Arguments.of(new int[] {1, 2, 1, 4}, new int[] {3}),
	                Arguments.of(new int[] {1, 4, 5, 3, 5, 4, 1}, new int[] {7}),
	                Arguments.of(new int[] {}, new int[] {0}));
	    }
	    
	    
	    @ParameterizedTest
	    @MethodSource
	    public void maxMirrorTesting(int[] testArr, int[] expected) {
	        Backend arrOperations = new Backend();
	        int check = arrOperations.maxMirror(testArr);
	        assertEquals(expected[0], check);
	        
	    }

}
