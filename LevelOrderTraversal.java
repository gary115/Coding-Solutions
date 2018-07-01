import java.util.Queue;
import java.util.LinkedList;
import java.lang.*;
import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int item)
    {
        data=item;
        left=right=null;
    }
}

public class LevelOrder{
    
    static Node root;
    public static void printLevelOrder(Node root)
    {
        Queue<Node> qu=new LinkedList<Node>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            Node temp=qu.poll();
            System.out.print(temp.data+" ");
            
            if(temp.left!=null)
            {
                qu.add(temp.left);
            }
            if(temp.right!=null)
            {
                qu.add(temp.right);
            }
        }
        
    }

     public static void main(String []args){
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
           int n=s.nextInt();
           HashMap<Integer,Node> m=new HashMap<Integer,Node>();
           Node root=null;
           while(n>0)
           {
               int n1=s.nextInt();
               int n2=s.nextInt();
               char c=s.next().charAt(0);
               Node parent=m.get(n1);
               if(parent==null)
               {
                   parent=new Node(n1);
                   
                   m.put(n1,parent);
                   if(root==null)
                   {
                       root=parent;
                   }
               }
               
               Node child=new Node(n2);
               if(c=='L')
               {
                   parent.left=child;
               }
               else
               {
                   parent.right=child;
               }
               m.put(n2,child);
               
               n--;
           }
           printLevelOrder(root);
           System.out.println();
            
            
            t--;
        }
        
     }
}