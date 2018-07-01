import java.util.Queue;
import java.util.LinkedList;
import java.util.*;


public class StackUsingQueues{
    static Queue<Integer> q1=new LinkedList<Integer>();
   static  Queue<Integer> q2=new LinkedList<Integer>();
  static   Queue<Integer> temp=new LinkedList<Integer>();
   static void push(int x)
   {
       q2.add(x);
       while(!q1.isEmpty())
       {
           int t=q1.poll();
           q2.add(t);
       }
       temp=q2;
       q2=q1;
       q1=temp;
   }
   
   static int pop()
   {
       int t=-1;
       if(!q1.isEmpty())
       {
           t=q1.poll();
       }
       return t;
   }

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int q=s.nextInt();
            while(q>0)
            {
                int a=s.nextInt();
                if(a==1)
                {
                    int x=s.nextInt();
                    push(x);
                }
                else
                {
                    int w=pop();
                    System.out.print(w+" ");
                }
                
                q--;
            }
            
            t--;
        }
     }
}