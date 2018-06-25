import java.util.*;
import java.lang.*;

public class StringLeftRight{

     public static void main(String []args){
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
         char[] st=str.toCharArray();
         int n=s.nextInt();
         s.nextLine();
         String op[]=new String[n];
         for(int i=0;i<op.length;i++)
         {
             op[i]=s.nextLine();
         }
         
         for(int i=0;i<op.length;i++)
         {
             String temp=op[i];
             String[] arr=temp.split(" ");
                 int l=Integer.parseInt(arr[0]);
                 int r=Integer.parseInt(arr[1]);
                 char ch=arr[2].charAt(0);
                 
                 for(int j=l;j<=r;j++)
                 {
                     int sym=(int)st[j];
                     if(ch=='L'&& st[j]!='a')
                     {
                         sym-=1;
                         st[j]=(char)sym;
                     }
                     if(ch=='L'&& st[j]=='a')
                     {
                         sym+=25;
                         st[j]=(char)sym;
                     }
                     else if(ch=='R')
                     {
                         sym+=1;
                         st[j]=(char)sym;
                     }
                 }
                 
                 
             
         }
         System.out.println(String.valueOf(st));
        
     }
}