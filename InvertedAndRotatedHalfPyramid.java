import java.util.*;
class InvertedAndRotatedHalfPyramid
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of PYRAMID");
        int n=sc.nextInt();int k=0;
        for(int i=0;i<n;i++)
        {
            //for spaces
            for(int l=n-1;l>=k;l--)
            System.out.print(" ");
            //for '*'
            for(int j=0;j<=k;j++)
            System.out.print("*");
            k++;
            System.out.println();
        }
    }
}
    

