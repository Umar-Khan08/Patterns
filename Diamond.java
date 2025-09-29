import java.util.*;
class Diamond 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the diamond pattern");
        int n=sc.nextInt();int k=n,l=1,k2=0,l2=2*n;
        for(int i=1;i<=2*n;i++)
        {
            if(i<=n)
            {
                for(int j=0;j<k-1;j++)
                    System.out.print(" ");
                for(int j=0;j<l;j++)
                    System.out.print("*");
                k--; 
                l=l+2;
                System.out.println();
            }   
            else 
            {
                for(int j=0;j<k2;j++)
                    System.out.print(" ");
                for(int j=0;j<l2-1;j++)
                    System.out.print("*");     
                k2++;
                l2=l2-2; 
                System.out.println();   
        }
    }
  }
}