/**
 * @author Mike Deiters
 * @version 1.0
 * Class: ArrayMethods
 * 
 * The class will reorganize the array passed to the methods.
 * Purpose: This class is to practice reorganizing arrays with 
 methods instead of calling the Java class Array to sort.
 */
public class ArrayMethods {

	/**
	 * createArray
	 * @param array of intergers
	 * Return Type: void
	 * This will create an array of intergers
	 */
	public static void createArray(int[] list){
		
		for(int i=0;i<list.length;i++){
			list[i] = (int)(Math.random()*200);
		}
		
		printArray(list);
		
	}
	
	
	/**
	 * oranizeArray
	 * @param array of intergers
	 * Return Type: void
	 * This will sort the array from largest to smallest
	 */
	public static void organizeArray(int[] list){
		
		for (int i=0;i<list.length-1;i++) {

			// Find the maximum in the list[i..list.length-1]
		    int currentMax = list[i];
		    int currentMaxIndex = i;

		    for (int j=i+1;j<list.length;j++) {
		    	if (currentMax < list[j]) {
		    		currentMax = list[j];
		    		currentMaxIndex = j;
		        }
		    }

		    // Swap list[i] with list[currentMaxIndex] if necessary;
		    if (currentMaxIndex!=i) {
		    	list[currentMaxIndex] = list[i];
		      	list[i] = currentMax;
		    }   
		}
		
		printArray(list);
		
	}
	
	
	/**
	 * reverseArray
	 * @param array of intergers
	 * Return Type: int[]
	 * This will reverse the array
	 */
	public static int[] reverseArray(int[] list){
		
		int[] result = new int[list.length];
		
		for(int i=0,j=result.length-1;i<list.length;i++,j--){
			result[j]=list[i];
		}
		
		return result;
		
	}
	
	
	/**
	 * printArray
	 * @param array of intergers
	 * Return Type: void
	 * This will print the array.
	 */
	public static void printArray(int[] list){
		
		for(int i=0;i<list.length;i++){
			System.out.print(list[i] + " ");
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		
		// Create the array
		int[] myList = new int[20];
		System.out.println("This is the original array:");
		createArray(myList);
		
		// Reverse the array
		System.out.println("This is the reverse array:");
		printArray(reverseArray(myList));		
		
		// Organize the array
		System.out.println("This is the sorted array:");
		organizeArray(myList);

	}

}
