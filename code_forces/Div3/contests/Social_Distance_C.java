package code_forces.Div3.contests;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Social_Distance_C {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n =Integer.parseInt(st.nextToken()),k=Integer.parseInt(st.nextToken());
			String s = br.readLine(),S="1";
			for(int i=0; i<k; i++) S+="0";
			S+=s;
			for(int i=0; i<k; i++) S+="0";
			S+="1";
			System.out.println(S);
			List<Integer> a=new ArrayList<>();
			for(int i=0; i<S.length(); i++) {
				if(S.charAt(i)=='1') a.add(i);
			}
			int ans=0;
			for(int i=1; i<a.size(); i++) {
				ans+=((a.get(i)-a.get(i-1))/k+1)-1;
			}
			System.out.println(ans);
		}
	}

}
