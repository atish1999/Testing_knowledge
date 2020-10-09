package code_forces.Div2.Educational_round;
import java.util.*;
import java.io.*;
public class Colored_Rectangles {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer s1 = new StringTokenizer(br.readLine());
		StringTokenizer s2 = new StringTokenizer(br.readLine());
		StringTokenizer s3 = new StringTokenizer(br.readLine());
		int r =Integer.parseInt(st.nextToken()),g=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
		List<Integer> red=new ArrayList<>(),green=new ArrayList<>(),blue=new ArrayList<>();
		for(int i=0; i<r; i++) red.add(Integer.parseInt(s1.nextToken()));
		for(int i=0; i<g; i++) green.add(Integer.parseInt(s2.nextToken()));
		for(int i=0; i<b; i++) blue.add(Integer.parseInt(s3.nextToken()));
		Collections.sort(red, Collections.reverseOrder());
		Collections.sort(green, Collections.reverseOrder());
		Collections.sort(blue, Collections.reverseOrder());
		long area=0;
		
	}

}
