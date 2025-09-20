import java.util.*;
class HollowRhombus 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rhombus");
        int n=sc.nextInt();int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-k;j++)
            System.out.print(" ");
            if(i==0||i==n-1)
            {
                for(int j=0;j<n;j++)
            System.out.print("*");
            }else
            {
                System.out.print("*");
                for(int j=0;j<n-2;j++)
                System.out.print(" ");
                System.out.print("*");
            }
            k++;
            System.out.println();
        }

    }
}