import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int arr[]=new int[N];

        for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }

    for(int i=0;i<N;i++)
    {
        for(int j=i;j<N;j++)
        {
            for (int k=i;k<=j;k++)
            {
                System.out.print(arr[k]);
            }
            System.out.println("");
        }
    }
}
    }
