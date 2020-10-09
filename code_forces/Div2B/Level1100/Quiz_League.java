package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Quiz_League {
	public static void main(String[] args) throws java.lang.Exception
    {		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[n];
		for(int i=0; i<n; i++) a[i]=sc.nextInt();
		k=k-1;
		while(a[k]!=1) {
			++k;
			k%=n;
		}
		System.out.println(k+1);
	}

//	public static void main(String[] args) throws java.lang.Exception
//    {		
//		Scanner sc = new Scanner((new FileReader("input.txt")));
//		FileWriter out = new FileWriter("output.txt");
//		int n=sc.nextInt(),k=sc.nextInt(),a[]=new int[n];
//		for(int i=0; i<n; i++) a[i]=sc.nextInt();
//		int p=0;
//		for(int i=0; i<n; i++) {
//			if(a[k-1]==1) {p=k;break;}
//			else {
//				if(k==n) {
//					for(int j=0;j<n; j++) {
//						if(a[j]==1) {p=j+1;break;}
//					}
//				}else {
//					for(int j=k; j<n; j++) {
//						if(a[j]==1) {p=j+1;break;}
//					}
//				}
//			}
//		}
//		out.write(p);
//	}

}
