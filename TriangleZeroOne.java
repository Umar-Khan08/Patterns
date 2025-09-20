import java.util.*;
class TriangleZeroOne
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length of the rows");
       int n=sc.nextInt();
       int k=1,l=0;
       for(int i=0;i<n;i++)
       {
         for(int j=1;j<=k;j++)
         {
            if(i%2==0)
            System.out.print(j%2 + " ");
            else
            {
               System.out.print(l%2 + " ");
               l++;
            }
                  
         }k++;
         System.out.println();
       }
    }
}