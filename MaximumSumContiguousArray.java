/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
		    int n=s.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=s.nextInt();
		    }
		    int max_so_far=Integer.MIN_VALUE;
		    int max_ending_here=0;
		    for(int i=0;i<n;i++)
		    {
		        max_ending_here+=arr[i];
		        if(max_ending_here<0)
		        {
		            max_ending_here=0;
	            }
	            else if(max_ending_here>max_so_far)
	            {
	                max_so_far=max_ending_here;
	            }
		        
		    }
		    System.out.println(max_so_far);
		    
		    t--;
		}
	}
}