import java.util.*;
class SolidRhombus 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rhombus");
        int n=sc.nextInt();int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-k;j++)
            System.out.print(" ");
            for(int j=0;j<n;j++)
            System.out.print("*");
            k++;
            System.out.println();
        }

    }
}