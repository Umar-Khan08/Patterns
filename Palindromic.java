import java.util.*;
class Palindromic
{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();int k=n-1,k1=1,k2=1,z=1,m=2;
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<k;j++)
             System.out.print(" ");
             int z2=k1; 
             for(int j=0;j<z;j++)
             System.out.print(z2--);
             if(i>0)
             {
              m=2;
              for(int j=0;j<k2-1;j++)
              System.out.print(m++);
             }
              k2++;k1++;k--;z++;
              System.out.println();
        }
     }
}
