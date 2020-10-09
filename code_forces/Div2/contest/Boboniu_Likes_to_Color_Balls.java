package code_forces.Div2.contest;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Boboniu_Likes_to_Color_Balls {
	//method-2
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			long r=Long.parseLong(st.nextToken()),g=Long.parseLong(st.nextToken()),
			b=Long.parseLong(st.nextToken()),w=Long.parseLong(st.nextToken());
			System.out.println((r%2==0 && g%2==0 && b%2==0 || r%2==1 && g%2==1 && b%2==1 || r%2==1 && g%2==0 && b%2==0 && w%2==0
			||r%2==0 && g%2==1 && b%2==0 && w%2==0 || r%2==0 && g%2==0 && b%2==1 && w%2==0||r>0 && r%2==0 && g%2==1 && b%2==1 && w%2==1 
			||g>0 && r%2==1 && g%2==0 && b%2==1 && w%2==1 ||b>0 && r%2==1 && g%2==1 && b%2==0 && w%2==1)?"Yes":"No");	
		}
    }
	
	/*METHOD-1
	 public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			long r=Long.parseLong(st.nextToken()),g=Long.parseLong(st.nextToken()),
			b=Long.parseLong(st.nextToken()),w=Long.parseLong(st.nextToken());		
	        System.out.println(check(r,g,b,w) || (r>0 && b>0 && g>0 && check(r-1,g-1,b-1,w+3))?"Yes":"No");
	       
		}
	}
	// if there is (1)one odd remaining even or (2)no odd all are even or (3)no even all are odd.
    static boolean check(long r, long g, long b, long w) {
    	if((r&1)+(g&1)+(b&1)+(w&1)>1) return false;
    	return true;
    }
    */
	/*
	 * if we follow this approach we will get TLE
	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			long r=Long.parseLong(st.nextToken()),g=Long.parseLong(st.nextToken()),
			b=Long.parseLong(st.nextToken()),w=Long.parseLong(st.nextToken());		
	        long min=Math.min(r, Math.min(g,b));
	        if(min==0) {
	        	int c=0;
	        	if(r==min) ++c;if(g==min) ++c; if(b==min) ++c;
	        	System.out.println(c==1 || c==2 ?"No":"Yes");
	        }else {
		        boolean ok=false;
		        while(min!=0) {
		        	r-=1;b-=1;g-=1;w+=3;
		        	if((r&1)==0 && (g&1)==0 && (b&1)==0 && (w&1)==0 ||(r&1)==1 && (g&1)==0 && (b&1)==0 && (w&1)==0
		        	||(r&1)==0 && (g&1)==1 && (b&1)==0 && (w&1)==0 ||(r&1)==0 && (g&1)==0 && (b&1)==0 && (w&1)==1
		        	||(r&1)==1 && (g&1)==1 && (b&1)==1 && (w&1)==1)  {ok=true;break;}
		        	min-=1;
		        }
		        System.out.println(ok?"Yes":"No");
	        }
		}
	}
	*/
}
