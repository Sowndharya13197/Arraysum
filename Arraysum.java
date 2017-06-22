import java.io.*;
import java.util.Scanner;
public class Arraysum
{
    public static void main(String args[])
    {Scanner s=new Scanner(System.in);
        int arr[]=new int[100];
        int n,i,j,sum=0;
        n=s.nextInt();
        for(i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
    }
    for(i=0;i<args.length;i++)
    {
        for(j=1;j<args.length;j++)
        {
            sum=arr[i]+arr[j];
        
    if(sum==n)
    {
        System.out.println(arr[i]+" "+arr[j]);
    
}}}
}}
