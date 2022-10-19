package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestQuestion2 {


	 public static Stream<Arguments> clumpsTesting(){
	        return Stream.of(
	                Arguments.of(new int[] {1, 1, 1, 1, 1}, new int[] {1}),
	                Arguments.of(new int[] {1, 1, 2, 1, 1}, new int[] {2}),
	                Arguments.of(new int[] {1,2,2,3,4,4}, new int[] {2}),
	                Arguments.of(new int[] {}, new int[] {0}));
	    }
	 @ParameterizedTest
	    @MethodSource
	    public void clumpsTesting(int[] testArr, int[] expected) {
	        Backend arrOperations = new Backend();
	        int check = arrOperations.countClumps(testArr);
	        assertEquals(expected[0], check);
	        
	    }
}
