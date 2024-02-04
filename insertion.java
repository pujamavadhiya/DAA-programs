import java.util.Scanner;
public class insertion {
    static int cmp=0;
    static int shift=0;
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter the elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        insertion(arr);
    }
    static void insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {   int key=arr[i];
            int j=i-1;
            cmp++;
            while(j>=0 && key<arr[j] )
            {
                cmp++;
                arr[j+1]=arr[j];
                j--;
                shift++;
            }
            arr[j+1]=key;
        }
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("no of comparison :"+cmp+" : " +" no of shifting "+shift);
    }

}

