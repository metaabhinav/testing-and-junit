package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestQuestion4 {

	

	   public static Stream<Arguments> splitArrayTesting(){
	        return Stream.of(
	                Arguments.of(new int[] {1, 1, 1, 2, 1}, new int[] {3}),
	                Arguments.of(new int[] {2, 1, 1, 2, 1}, new int[] {-1}),
	                Arguments.of(new int[] {10,10}, new int[] {1}),
	                Arguments.of(new int[] {1,1,1,-2,4,5}, new int[] {5}),
	                Arguments.of(new int[] {}, new int[] {1}));
	    }
	 @ParameterizedTest
	    @MethodSource
	    public void splitArrayTesting(int[] testArr, int[] expected) {
	        Backend arrOperations = new Backend();
	        int check = arrOperations.splitArray(testArr);
	        assertEquals(expected[0], check);
	        
	    }

	
	

}
