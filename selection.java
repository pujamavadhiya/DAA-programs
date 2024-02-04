import java.util.*;
public class selection {
    static int swap=0;
    static int cmp=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter the elements ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        selection(arr);
    }
    static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                cmp++;
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            swap++;
        }
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("noswap of swap:"+swap+" : "+"no of comparison "+cmp);
    }
}

