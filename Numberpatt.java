import java.util.*;
class Numberpatt
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for the diamond pattern");
        int n=sc.nextInt();int k=n,l=1,k2=1,l2=2*n;
        for(int i=1;i<=n;i++)
        {
            
                for(int j=0;j<k-1;j++)
                    System.out.print(" ");
                for(int j=0;j<l;j++)
                    System.out.print(k2);
                k--; k2++;
                l=l+2;
                System.out.println();
            
        }
    }
}