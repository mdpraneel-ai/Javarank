import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
  int n  = sc.nextInt();
  int[] a = new int[n];
  for(int i=0;i<n;i++)
  {
    a[i] = sc.nextInt();
  }
  int c=0;
  int s=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]<0)
        {   
        c++;
        }
    for(int j=i+1;j<n;j++)
    {    
        s=0;
        for(int k=i;k<=j;k++)
            s+=a[k];
        if(s<0)
            c++;
    }
  }
  System.out.print(c);

    }
