package dynamic_programming;

public class CountSubsequencesOfFormABC {

	public static void main(String[] args) {
		
		String s= "abcabcbac";
		int a= 0, ab = 0 , abc =0;
		
		for(int i =0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch=='a') {
				a= 2*a + 1;
			}
			else if(ch=='b') {
				ab = 2*ab + a;
			}
			else if(ch == 'c') {
				abc = 2*abc + ab;
			}
		}
		System.out.println(abc);
	}
}
