import java.util.*;
class Butterfly
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Suggest a number for the butterfly pattern");
        int n=sc.nextInt();int k=0,m=2,p=0;
        for(int i=0;i<2*n;i++)
        {
          if(i<n)
          {
            for(int j=0;j<=k;j++)
            System.out.print("*");
            for(int j=0;j<2*n-m;j++)
            System.out.print(" ");
            for(int j=0;j<=k;j++)
            System.out.print("*");
            k++; m=m+2;
          }else
           { for(int j=0;j<=k-1;j++)
            System.out.print("*");
            for(int j=0;j<p;j++)
            System.out.print(" ");
            for(int j=0;j<=k-1;j++)
            System.out.print("*");
            k--;  p=p+2;
        }System.out.println();
    }
    }
}