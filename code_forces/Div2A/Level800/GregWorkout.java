package code_forces.Div2A.Level800;

import java.util.Scanner;

public class GregWorkout {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),c=0,bi=0,ba=0;
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n; i+=3) {
			c+=a[i];
			if(i+1<n) bi+=a[i+1];
			if(i+2<n) ba+=a[i+2];
		}
		if(c>bi && c>ba) {
			System.out.println("chest");
		}else if(bi>c && bi>ba) {
			System.out.println("biceps");
		}else {
			System.out.println("back");
		}
	}
}
//import java.util.*;
//import java.math.*;
//
//public class Workout{
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt(), chest = 0, biceps = 0, back = 0;
//		
//		for(int i = 1; i <= n; i++){
//			int x = sc.nextInt();
//			if(i%3 == 1)
//				chest+=x;
//			if(i%3 == 2)
//				biceps+=x;
//			if(i%3 == 0)
//				back+=x;
//		}
//		int max = Math.max(chest, Math.max(biceps, back));
//
//		if(max == chest)
//			System.out.println("chest");
//		else if(max == biceps)
//			System.out.println("biceps");
//		else
//			System.out.println("back");
//	}
//}
