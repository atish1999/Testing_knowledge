package code_forces.Div2B.Level1300;
import java.util.*;
import java.io.*;
public class Lucky_Numbers_easy {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int digit=(int) (Math.log10(n)+1);
		outer:
			while(true) {
				for(int i=0; i<(1<<digit); i++) {
					long ans=0,c=1,four=0,seven=0;
					for(int j=0; j<digit; j++) {
						if((i&(1<<j))!=0) {
							ans+=c*7;
							++seven;
						}else {
							ans+=c*4;
							++four;
						}
						c*=10;
					}
					if(ans>=n && four==seven) {
						System.out.println(ans);
						break outer;
					}
				}
				++digit;
			}
	}

}
