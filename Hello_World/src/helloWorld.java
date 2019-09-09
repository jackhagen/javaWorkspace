
public class helloWorld {

	
//	Given an array of ints, return true if 6 appears as either the first or last element in the array. 
//	The array will be length 1 or more.
	
	//firstLast6([1, 2, 6]) → true
	//firstLast6([6, 1, 2, 3]) → true
	//firstLast6([13, 6, 1, 2, 3]) → false
	
	public static void main(String[] args) {
		
		  int[] testArray1 = new int[] {1, 2, 6};
		  int[] testArray2 = new int[] {6, 1, 2, 3};
		  int[] testArray3 = new int[] {13, 6, 1, 2, 3};
		  firstLast6(testArray1);
		  firstLast6(testArray2);
		  firstLast6(testArray3);
	}
		
	public static boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {	
			System.out.println("true");
		return true;
		}
		
		System.out.println("false");
		return false;
		
		  
	}
}

