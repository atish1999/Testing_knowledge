package Atcoder.Beginner_Contest.one73;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Chat_in_a_Circle {

	public static void main(String[] args)throws java.lang.Exception
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine()),p=0,total=0;
		List<Long> l=new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) l.add(Long.parseLong(st.nextToken()));
		Collections.sort(l, Collections.reverseOrder());
		for(int i=0; i<n-1; i++) {
			total+=l.get((int)p);//repeat this operation untill we get new value of p
			if((i&1)==0) ++p;
		}
		System.out.println(total);
	}

}
