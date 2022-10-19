package assignment1;
import java.util.*;
public class DriverCode {

	public static void main(String args[]) {
		Scanner sd = new Scanner(System.in);
		while(true) {
			System.out.println("If you want to do the task enter 1 or else 0");
			int decide = sd.nextInt();
			if(decide == 0) {
				break;
			}
			System.out.println("Enter the choice");
			System.out.println("1. Return the size of the largest mirror section found");
			System.out.println("2. Return the number of clumps in the input array");
			System.out.println("3. Solve fixXY problem");
			System.out.println("4. splitArray");
			int choice = sd.nextInt();
			Backend back = new Backend();
			if(choice == 1) {
				System.out.println("Enter the size of the array you want to enter");
				int sizeOfArray = sd.nextInt();
				int[]inputArray = new int[sizeOfArray];
				System.out.println("Enter the array");
				int iterator=0;
				while(iterator<sizeOfArray) {
					System.out.print("Enter the "+(iterator+1)+" element: ");
					inputArray[iterator] = sd.nextInt();
					iterator++;
				}
				int output = back.maxMirror(inputArray);
				System.out.println("Size of the largest mirror section found in the input array is: "+output);
			}
			else if(choice == 2) {
				System.out.println("Enter the size of the array you want to enter");
				int sizeOfArray = sd.nextInt();
				int[]inputArray = new int[sizeOfArray];
				System.out.println("Enter the array");
				int iterator=0;
				while(iterator<sizeOfArray) {
					System.out.print("Enter the "+(iterator+1)+" element: ");
					inputArray[iterator] = sd.nextInt();
					iterator++;
				}
				int output = back.countClumps(inputArray);
				System.out.println("Number of Clumps are " + output);		
			}
			else if(choice == 3) {
				System.out.println("Enter the size of the array you want to enter");
				int sizeOfArray = sd.nextInt();
				int[]inputArray = new int[sizeOfArray];
				System.out.println("Enter the array");
				int iterator=0;
				while(iterator<sizeOfArray) {
					System.out.print("Enter the "+(iterator+1)+" element: ");
					inputArray[iterator] = sd.nextInt();
					iterator++;
				}
				System.out.println("Enter value of the X");
				int X = sd.nextInt();
				System.out.println("Enter value of the Y");
				int Y = sd.nextInt();
				int[] output = back.fixXY(inputArray,X,Y);
				System.out.println("Array after fixXY is ");	
				int count=0;
				System.out.print("{");
				while(count < output.length-1) {
					System.out.print(output[count]+",");
					count++;
				}
				System.out.println(output[count]+"}");
			}
			else if(choice == 4) {
				System.out.println("Enter the size of the array you want to enter");
				int sizeOfArray = sd.nextInt();
				int[]inputArray = new int[sizeOfArray];
				System.out.println("Enter the array");
				int iterator=0;
				while(iterator<sizeOfArray) {
					System.out.print("Enter the "+(iterator+1)+" element: ");
					inputArray[iterator] = sd.nextInt();
					iterator++;
				}
				int output = back.splitArray(inputArray);
				System.out.println("Index of the place to split array " + output);	
			}
			else {
				System.out.println("Wrong Input");
			}
		}
		sd.close();
	}
}
