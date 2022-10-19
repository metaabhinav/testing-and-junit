package assignment1;

/**
 * @author Abhinav
 *this class contains 4 method having maxMirror, countClumps, fixXY, splitArray
 */
public class Backend {

	
	/**
	 * Mirror section in an array is a group of contiguous elements
	 *  such that somewhere in the array, the same group appears in reverse order.
	 * @param inputArray takes input as an array of integer
	 * @return the size of the largest mirror section found in the input array
	 */
	int maxMirror(int[] inputArray) {
		int maxLength=1;
		if(inputArray.length <= 0) {
			throw new AssertionError("InputArray length cannot be 0");
		}
		boolean flag = false;
		for(int iterator=0 ; iterator<inputArray.length;iterator++) {
			int tempIterator=iterator;
			int tempCount=1;
			for(int rightIterator = inputArray.length - 1; rightIterator >= 0 && (tempIterator < inputArray.length);rightIterator--) {
				if((inputArray[tempIterator]==inputArray[rightIterator]) && flag != true) {
					flag = true;
					tempIterator++;
					continue;
				}
				if(inputArray[tempIterator]==inputArray[rightIterator] && flag == true) {
					tempCount++;
					tempIterator++;
					if(maxLength < tempCount) {
						maxLength = tempCount;
					}
					continue;
				}
				else if(inputArray[iterator] != inputArray[rightIterator] && flag == true){
					flag = false;
					tempCount = 1;
					tempIterator = iterator;
					continue;
					}
				else if((rightIterator == tempIterator) || (rightIterator - tempIterator)==1) {
					flag = false;
					break;
				}
				}
			}
		
		return (maxLength);
	}
	
	/**
	 * Clump in an array is a series of 2 or more adjacent elements of the same value
	 * @param inputArray takes input as integer
	 * @return number of clumps as an integer
	 */
	int countClumps(int[] inputArray) {
		int noOfClumps = 0;
		if(inputArray.length <= 0)
			throw new AssertionError("InputArray length cannot be 0");
		for(int iterator = 0; iterator < inputArray.length - 1; iterator++) {
			boolean flag = false;
			 while (iterator < inputArray.length - 1 && inputArray[iterator] == inputArray[iterator + 1]) {
			        flag = true;
			        iterator++;
			    }

			if(flag == true)
				noOfClumps++;
		}
		return noOfClumps;
	}
	
	/**
	 * Rearrange the array so that all Y values come immediately after all X values
	 * @param inputArray that takes array of integer as input
	 * @param X takes integer that is present in inputArray
	 * @param Y takes integer that is present in inputArray
	 * @return an array that contains exactly the same numbers as the 
	 * input array, but rearranged so that every X is immediately followed
	 *  by a Y. Do not move X within array, but every other number may move.
	 */
	int[] fixXY(int[] inputArray,int X,int Y) {
		if(inputArray.length == 0) {
			throw new AssertionError("InputArray length cannot be 0");
		}
		int numOfX=0,numOfY=0;
		for(int iterator = 1;iterator < inputArray.length; iterator++) {
			if(inputArray[iterator] == X && inputArray[iterator-1] == X) {
				throw new AssertionError("Two X values are immediately after one another");
			}
		}
		for(int iterator = 0;iterator < inputArray.length; iterator++) {
			if(inputArray[iterator] == X)
				numOfX++;
			if(inputArray[iterator] == Y)
				numOfY++;
		}
		if(inputArray[inputArray.length - 1] == X)
			throw new AssertionError("last element in an array should not be X");
		if(numOfX != numOfY)
			throw new AssertionError("number of X is not equal to number of Y");
		for(int iterator2 = 0; iterator2 < inputArray.length; iterator2++) {
			if(inputArray[iterator2]!=X)
				continue;
			else if(inputArray[iterator2] == X) {
				iterator2 = iterator2 + 1;
				if(inputArray[iterator2] == Y) {
					continue;
				}
				else {
					for(int iterator = 0;iterator < inputArray.length; iterator++) {
						if(inputArray[iterator] != Y) {
							continue;
						}
						else if(iterator > 0 && inputArray[iterator-1] == 4) {
							continue;
						}
						else {
							int temp = inputArray[iterator2];
							inputArray[iterator2] = inputArray[iterator];
							inputArray[iterator] = temp;
							iterator++;
						}
					}
				}
			}
		}
		return inputArray;
	}
	
	/**split the input array so that the sum of the numbers on both side is equal
	 * @param inputArray takes array of integer type
	 * @return the index if there is a place to split the input array so 
	 * that the sum of the numbers on one side is equal to the sum of the numbers 
	 * on the other side else return -1
	 */
	int splitArray(int[] inputArray) {
		if(inputArray.length == 0) {
			throw new AssertionError("InputArray length cannot be 0");
		}
		int iterator=0, totSum=0;
		while(iterator < inputArray.length) {
			totSum = totSum + inputArray[iterator];
			iterator++;
		}
		if(totSum % 2 != 0)
			return -1;
		iterator=0;
		int halfSum = totSum/2;
		while(iterator < inputArray.length) {
			if(inputArray[iterator] < halfSum)
				halfSum = halfSum - inputArray[iterator];
			else if(inputArray[iterator] > halfSum)
				return -1;
			else {
				return (iterator+1);
			}
			iterator++;
		}
		return (iterator+1);
	}
}


    
   
  
