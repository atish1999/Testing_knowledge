package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Zero_remainder_array {

	public static void main(String[] args)throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken()),k=Long.parseLong(st.nextToken()),
			 arr[]= new long[(int)a];
			List<Long> l=new ArrayList<>();
			StringTokenizer s = new StringTokenizer(br.readLine());
			for(int i=0; i<arr.length; i++) {
				arr[i]=Long.parseLong(br.readLine());
				if(arr[i]%k!=0) l.add(k-arr[i]%k);
			}
			Map<Boolean,Integer> m=new HashMap<>();
			for(int i=0; i<arr.length; i++) {
//				if(m.get(l.get(i)%k)==0) 
			}
			
		}	
		
	}

}
