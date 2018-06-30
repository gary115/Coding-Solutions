
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
	    HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	        if(!hash.containsKey(arr[i]))
	        {
	            hash.put(arr[i],1);
	        }
	        else
	        {
	            hash.put(arr[i],hash.get(arr[i])+1);
	        }
	    }
	    
	    Map.Entry<Integer,Integer> max=null;
	    int min=0;
	    for(Map.Entry<Integer,Integer> map:hash.entrySet())
	    {
	        if(max==null|| map.getValue().compareTo(max.getValue())>0)
	        {
	            max=map;
	           min=map.getKey();
	        }
	       
	        
	    }
	    boolean stat=true;
	    ArrayList<Integer> arry=new ArrayList<Integer>();
	    for(Map.Entry<Integer,Integer> mapp:hash.entrySet())
	    {
	        if(mapp.getValue()==max.getValue())
	        {
	            arry.add(mapp.getKey());
	        }
	        if(arry.size()>1)
	        { 
	            stat=false;
	            System.out.println("NO Majority Element");
	            
	            break;
	            
	        }
	    }
	    if(stat)
	    {
	    System.out.println(min);
	    }
	    t--;
	}
	}
}