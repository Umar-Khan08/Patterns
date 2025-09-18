import java.util.*;
class HollowRectangle
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       for(int i=0;i<=n-1;i++)
       {
        if(i==0||i==(n-1))
        for(int j=0;j<n;j++)
        System.out.print("*");
        else{
            System.out.print("*");
            for(int k=0;k<n-2;k++)
            System.out.print(" ");
            System.out.print("*");
        }System.out.println();
       }
    } 
}