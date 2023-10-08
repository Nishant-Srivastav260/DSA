package dynamic_programming;
// Similar to CountBinaryStrings 
// 0 is Building and 1 is Space
public class ArrangeBuildings {
	
 public static void main(String[] args) {
		
	 long lengthOfString = 6;
		 
	 long oldCountOfZeros = 1;
	 long oldCountOfOnes = 1;
		
		for(int i =2; i <= lengthOfString; i++) {
			
			long newCountOfZeros = oldCountOfOnes;
			long newCountOfOnes = oldCountOfOnes + oldCountOfZeros;
			
			oldCountOfZeros = newCountOfZeros;
			oldCountOfOnes = newCountOfOnes;
		}
		long totalPossibility = (long) Math.pow((oldCountOfOnes + oldCountOfZeros), 2);
		
		System.out.println(totalPossibility);
	}

}

