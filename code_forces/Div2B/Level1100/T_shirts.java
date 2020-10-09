package code_forces.Div2B.Level1100;
import java.util.*;
import java.lang.*;
import java.io.*;
public class T_shirts {
	
	public static void main(String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s[]= {"S","M","L","XL","XXL"};
		Map<String, Integer> map=new HashMap<>();int num[]=new int[5];
		for(int i=0; i<5; i++) {
			num[i]=Integer.parseInt(st.nextToken());
			map.put(s[i], i);
		}
		int k=Integer.parseInt(br.readLine());
		while(k-->0) {
			String a=br.readLine();
			int p=map.get(a),ans=10;
			for(int i=4; i>=0; i--) {
				if(num[i]==0) continue;
				if(Math.abs(i-p)<Math.abs(ans-p)) ans=i;
			}
			--num[ans];
			System.out.println(s[ans]);
		}
	}

//	public static void main(String[] args)throws java.lang.Exception
//    {		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		String s[]= {"S","M","L","XL","XXL"};
//		Map<String, Integer> map=new HashMap<>();
//		for(int i=0; i<5; i++) map.put(s[i], Integer.parseInt(st.nextToken()));		
//		int k=Integer.parseInt(br.readLine());
//		while(k-->0) {
//			String a=br.readLine();
//			if(map.get(a)!=0) {
//				System.out.println(a);
//				map.put(a, map.get(a)-1);
//			}else {
//				if(a.equals(s[4])) {
//					for(int i=3; i>=0; i--) {
//						if(map.get(s[i])!=0) {
//							System.out.println(s[i]);
//							map.put(s[i], map.get(s[i])-1);
//							break;
//						}
//					}
//				}else if(a.equals(s[0])) {
//					for(int i=1; i<=4; i++) {
//						if(map.get(s[i])!=0) {
//							System.out.println(s[i]);
//							map.put(s[i], map.get(s[i])-1);
//							break;
//						}
//					}
//				}else if(a.equals(s[1])){
//					if(map.get(s[2])!=0) {
//						System.out.println(s[2]);
//						map.put(s[2], map.get(s[2])-1);
//					}else if(map.get(s[0])!=0) {
//						System.out.println(s[0]);
//						map.put(s[0], map.get(s[0])-1);
//					}else if(map.get(s[3])!=0) {
//						System.out.println(s[3]);
//						map.put(s[3], map.get(s[3])-1);
//					}else if(map.get(s[4])!=0) {
//						System.out.println(s[4]);
//						map.put(s[4], map.get(s[4])-1);
//					}
//				}else if(a.equals(s[2])){
//					if(map.get(s[3])!=0) {
//						System.out.println(s[3]);
//						map.put(s[3], map.get(s[3])-1);
//					}else if(map.get(s[1])!=0) {
//						System.out.println(s[1]);
//						map.put(s[1], map.get(s[1])-1);
//					}else if(map.get(s[4])!=0) {
//						System.out.println(s[4]);
//						map.put(s[4], map.get(s[4])-1);
//					}else if(map.get(s[0])!=0) {
//						System.out.println(s[0]);
//						map.put(s[0], map.get(s[0])-1);
//					}
//				}else if(a.equals(s[3])){
//					if(map.get(s[4])!=0) {
//						System.out.println(s[4]);
//						map.put(s[4], map.get(s[4])-1);
//					}else if(map.get(s[2])!=0) {
//						System.out.println(s[2]);
//						map.put(s[2], map.get(s[2])-1);
//					}else if(map.get(s[1])!=0) {
//						System.out.println(s[1]);
//						map.put(s[1], map.get(s[1])-1);
//					}else if(map.get(s[0])!=0) {
//						System.out.println(s[0]);
//						map.put(s[0], map.get(s[0])-1);
//					}
//				}
//			}
//			
//		}
//	}

}
