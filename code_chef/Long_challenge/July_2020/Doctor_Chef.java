package code_chef.Long_challenge.July_2020;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Doctor_Chef {

	public static void main(String[] args)  throws java.lang.Exception
    {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringTokenizer s = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
			List<Integer> l=new ArrayList<>(),v=new ArrayList<>();
			for(int i=0; i<n; i++) l.add(Integer.parseInt(s.nextToken()));
			Collections.sort(l);
			int lb=lower(l,x),d=0;	
			for(int i=lb;i<n;i++){
		    	if(x<l.get(i)){
		    		while(x<l.get(i)){
		    			x=2*x;
		    			d++;
		    		}
		    		d++;
		    	}
		    	else
		    	d++;
		    	x=2*l.get(i);
		    }
			int tot=lb+d;
		    if(lb!=0) {
		    	d=0;
		    	lb--;
		    	for(int i=lb;i<n;i++){
		    		if(x<l.get(i)){
		    			while(x<l.get(i)){
		    				x=2*x;
		    				d++;
		    			}
		    			d++;
		    		}
		    		else
		    		d++;
		    		x=2*l.get(i);
		    	}
		    	int ans=Math.min(d+lb,tot);
		    	System.out.println(ans);
		    }
		    else System.out.println(tot);
		}
    }
	public static int lower(List<Integer> arr,int key){
	    int low = 0;
	    int high = arr.size()-1;
	    while(low < high){
	        int mid = low + (high - low)/2;
	        if(arr.get(mid) >= key){
	            high = mid;
	        }
	        else{
	            low = mid+1;
	        }
	    }
	    return low;
	}

}
