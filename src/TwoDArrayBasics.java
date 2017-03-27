
public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int[3][5];
		
		// Fill the array with random numbers using fillRandom
		fillRandom(nums);
		// test each method you create below.
		print(nums);
		
		System.out.println(sum(nums, 2));
		
		for(int i = 0; i < rowSums(nums).length; i++) {
			System.out.print(rowSums(nums)[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < rowSums(nums).length; i++) {
			System.out.print(noRepeats(nums[i]) + "\t");
		}
		System.out.println();
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	
	public static void fillRandom(int[][] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				nums[i][j] = (int)(Math.random() * 100 + 1);
			}
		}
	}
	
	/*
	 * create a method that prints a 2D array
	 */
	public static void print(int[][] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[0].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	public static int sum(int[][] nums, int r) {
		int sums = 0;
		for(int i = 0; i < nums[r].length; i++) {
			sums += nums[r][i];
		}
		return sums;
	}

	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	
	public static int[] rowSums(int[][] nums) {
		int[] sums = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			sums[i] = sum(nums, i);
		}
		return sums;
	}
	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	
	public static boolean noRepeats(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j] && i != j) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	

	
	
	/*
	 * return the min value in a 2D array
	 */
	

	
	
	
	/*
	 * return the max value in a 2D array
	 */
	

	
	
	
}
