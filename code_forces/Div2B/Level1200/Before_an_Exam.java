package code_forces.Div2B.Level1200;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Before_an_Exam {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int d=Integer.parseInt(st.nextToken()),sum=Integer.parseInt(st.nextToken());
		int a[][]=new int[d][2],min=0,max=0;
		for(int i=0; i<d; i++) {
			StringTokenizer s=new StringTokenizer(br.readLine());
			a[i][0]=Integer.parseInt(s.nextToken());a[i][1]=Integer.parseInt(s.nextToken());
			min+=a[i][0];max+=a[i][1];
		}
		if(sum>=min && sum<=max) {
			System.out.println("YES");
			int difference=sum-min;
			for(int i=0; i<d; i++) {
				int extra=Math.min(difference, a[i][1]-a[i][0]);
				a[i][0]+=extra;
				difference-=extra;
				if(difference==0) break;
			}
			for(int i=0; i<d; i++) System.out.print(a[i][0]+" ");
		}else System.out.println("NO");
	}

}
