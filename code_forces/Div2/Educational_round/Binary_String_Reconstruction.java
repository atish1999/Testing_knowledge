package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Binary_String_Reconstruction {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			char s[]=br.readLine().toCharArray();
			int x=Integer.parseInt(br.readLine()),n=s.length;
			char w[]=new char[n];
//			initially all the position should be filled with 1
			Arrays.fill(w, '1');
//			now we have to insert 0.and the condition is:
//			if there is 0 in s[i] then in w left and right position of that 0 should be filled
//			with 0 if that positions exist.
			for(int i=0; i<n; i++) {
				if(s[i]=='0') {
					int l=i-x;
					int r=i+x;
					if(l>=0) w[l]='0';
					if(r<n) w[r]='0';
				}
			}
//			now we have to check for 1, if s[i]==1 then at least in one position of this i
//			w[i] should be 1.i.e. either w[l]==1 or w[r]==1 or both w[l] and w[r] would be 1
//			if the above conditions are missing then we will not be able to construct w...
			boolean ok=true;
			for(int i=0; i<n; i++) {
				if(s[i]=='1') {
					int l=i-x;
					int r=i+x;
					if(l>=0 && w[l]=='1' || r<n && w[r]=='1') {
						continue;
					}
					else {
						ok=false;
						break;
					}
				}
			}
			if(ok) System.out.println(w);
			else System.out.println(-1);
		}

	}

}
