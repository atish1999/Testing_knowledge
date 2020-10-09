package code_forces.EDU.Binary_Search.Step_1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Closest_to_the_right_C_Pr {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken());
		int a[]=new int[n];
		 s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		s = new StringTokenizer(br.readLine());
		while(k-->0) {
			int target=Integer.parseInt(s.nextToken());
			int l=-1,r=n;
			while(l+1<r) {
				int m=(l+r)>>>1;
				if(a[m]>=target) r=m;
				else l=m;
			}
			System.out.println(r+1);
		}
	}
	static void solve1()  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(s.nextToken()),k=Integer.parseInt(s.nextToken());
		int a[]=new int[n];
		 s = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) a[i]=Integer.parseInt(s.nextToken());
		s = new StringTokenizer(br.readLine());
		while(k-->0) {
			int target=Integer.parseInt(s.nextToken());
			int x=Arrays.binarySearch(a, target);
			if(x<0) {x*=-1;}
			else {
				for(int i=x; i>=1; i--) {
					if(a[i]==a[i-1]) --x;
					else break;
				}
				++x;
			}
			
			System.out.println(x);
		}
	}

}
