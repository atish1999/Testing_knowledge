package hackerearth.basicProgramming;

public class PalindromicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="eovbgggijqjdsdhjyojeaujcdyyyxtpjlllowjyarfhxjxwkxpranhtlucoklahtokmqyozlrwhldozgbgpalkqlcsiowyeslusn";
//		int n=s.length()-1;
//		int size =s.length();
//		boolean isPalindrome =  true;
//		for(int i =0,j=n; i<size/2; i++,j--) {
//			if(s.charAt(i)==s.charAt(j)) {
//				isPalindrome =true;
//			}else {
//				isPalindrome =false;
//				break;
//			}
//		}
//		
//		if(isPalindrome) {
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
//		String s="abcdfftftfytfyffytfytgu",reverse="";
		
		int n =s.length()-1;
		for(int i=0,j=n; i<j; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				System.out.println("NO");
				break;
			}else {
				System.out.println("YES");
			}
		}
		
		
		
		
		
		
		
//		int n = s.length()-1;
//		int i =n;
//		while(i>=0) {
//			reverse=reverse+s.charAt(i);
//			i--;
//		}
//		if(s.equals(reverse)) {
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
	}

}
