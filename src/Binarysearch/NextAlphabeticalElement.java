package Binarysearch;

public class NextAlphabeticalElement {
 public static void main(String[] args) {
	char[] ch = {'c','c','f','h','p'};
	System.out.println(nextAlphabet(ch, 'a'));
}
 public static char nextAlphabet(char[] ch, char a) {
	 int n = ch.length;
	 int start =0, end = n -1, mid =0;
	 
	 while(start<=end) {
		 mid = start + (end-start)/2;
		 if(a == ch[mid]) {
			 return ch[mid+1];
		 }
		 else if(mid+1 < end && ch[mid]<a && ch[mid+1]>a) {
			 return ch[mid+1];
		 }
		 else if(a< ch[start]) {
			 return ch[start];
		 }
		 else if(a < ch[mid]) {
			 end = mid-1;
		 }
		 else if(a> ch[mid]) {
			 start = start +1;
		 }
	 }
	 return '!';
 }
}
