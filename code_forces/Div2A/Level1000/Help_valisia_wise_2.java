package code_forces.Div2A.Level1000;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Help_valisia_wise_2 {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt(),r2=sc.nextInt(),c1=sc.nextInt(),c2=sc.nextInt(),
			d1=sc.nextInt(),d2=sc.nextInt();
		// x=r1-y;y=d2-z;z=c1-x;
		//after calculating we will get x=(r1+c1-d2)/2;
		int x=(r1+c1-d2)/2, y=r1-x,z=c1-x,w=d1-x;
		if(x!=y && x!=z && x!=w && y!=z && y!=w && w!=z &&
			1<=x && x<=9 && 1<=y && y<=9 && 1<=z && z<=9
			&& 1<=w && w<=9 && y+z==d2 && y+w==c2 && z+w ==r2) {
			System.out.println(x+" "+y+"\n"+z+" "+w+"\n");
		}else System.out.println(-1);
	}

}
