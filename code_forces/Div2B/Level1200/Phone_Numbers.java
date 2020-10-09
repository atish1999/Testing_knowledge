package code_forces.Div2B.Level1200;
import java.util.*;
import java.io.*;
public class Phone_Numbers {

	public static void main(String[] args) throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[][]=new int[n][3],count=0;
		int tm=Integer.MIN_VALUE,pm=Integer.MIN_VALUE,gm=Integer.MIN_VALUE;
		List<String> taxi=new ArrayList<>(),pizza=new ArrayList<>(),girl=new ArrayList<>(),
		f=new ArrayList<>();
		while(n-->0) {
			StringTokenizer s=new StringTokenizer(br.readLine());
			int d=Integer.parseInt(s.nextToken()); f.add(s.nextToken());
			int t=0,p=0,g=0;
			while(d-->0) {
				String s1=br.readLine();
				int num[]=new int[6];
				String s2=s1.substring(0, 2)+s1.substring(3, 5)+s1.substring(6);
				for(int i=0; i<6; i++) num[i]=s2.charAt(i);
				int c=0,c1=0,c2=0;
				for(int i=0; i<5; i++) {
					if(num[i]==num[i+1]) ++c;
					else if(num[i]>num[i+1]) ++c1;
					else {++c2;break;}
				}
				if(c==5) ++t;
				else if(c1==5) ++p;
				else ++g;
			}
			tm=Math.max(tm, t);pm=Math.max(pm, p);gm=Math.max(gm, g);
			a[count][0]=t;a[count][1]=p;a[count][2]=g;
			++count;
		}
		for(int i=0; i<f.size(); i++) {
			if(tm==a[i][0]) taxi.add(f.get(i));
			if(pm==a[i][1]) pizza.add(f.get(i));
			if(gm==a[i][2]) girl.add(f.get(i));
		} 
		//method-1
//		System.out.print("If you want to call a taxi, you should call: ");
//		for(int i=0; i<taxi.size(); i++) {
//			System.out.print(taxi.get(i));
//			if(i!=taxi.size()-1) System.out.print(", ");
//			else System.out.print(".\n");
//		}
//		System.out.print("If you want to order a pizza, you should call: ");
//		for(int i=0; i<pizza.size(); i++) {
//			System.out.print(pizza.get(i));
//			if(i!=pizza.size()-1) System.out.print(", ");
//			else System.out.print(".\n");
//		}
//		System.out.print("If you want to go to a cafe with a wonderful girl, you should call: ");
//		for(int i=0; i<girl.size(); i++) {
//			System.out.print(girl.get(i));
//			if(i!=girl.size()-1) System.out.print(", ");
//			else System.out.print(".\n");
//		}
		//method-2
		StringJoiner sj = new StringJoiner(", ", "If you want to call a taxi, you should call: ", ".");
        for (String name : taxi) {
            sj.add(name);
        }
        System.out.println(sj);
        sj = new StringJoiner(", ", "If you want to order a pizza, you should call: ", ".");
        for (String name : pizza) {
            sj.add(name);
        }
        System.out.println(sj);
        sj = new StringJoiner(", ", "If you want to go to a cafe with a wonderful girl, you should call: ", ".");
        for (String name : girl) {
            sj.add(name);
        }
        System.out.println(sj);
	}

}
