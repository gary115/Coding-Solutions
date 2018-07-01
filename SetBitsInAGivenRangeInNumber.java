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
		    int l=s.nextInt();
		    int r=s.nextInt();
		    String bin=Integer.toBinaryString(n);
		    char[] arr=bin.toCharArray();
		    
		    for(int i=arr.length-r;i<=arr.length-l;i++)
		    {
		        arr[i]='1';
		    }
		    String newbin=String.valueOf(arr);
		    //System.out.println(newbin);
		    int dec=Integer.parseInt(newbin,2);
		    System.out.println(dec);
		    
		    t--;
		}
	}
}