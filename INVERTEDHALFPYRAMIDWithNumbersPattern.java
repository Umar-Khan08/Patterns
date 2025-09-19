import java.util.*;
class INVERTEDHALFPYRAMIDWithNumbersPattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the PYRAMID");
        int n=sc.nextInt();
        int k=n;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=k;j++)
            System.out.print(j+" ");
            System.out.println();
            k--;
        }
    }
}
