//Hackerrank 
import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();      
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
         Arrays.sort(a);
        int diff=a[1]-a[0],ch=1,j=0;
        for(int i=0;i<a.length-1;i++)
        {
             j=i+1;
            if(a[j]-a[i]!=diff)
            {
                ch=0;
                break;
            }
            
        }
        if(ch==0)
             System.out.println(ch);
        else
            System.out.println(ch);
    }
}
