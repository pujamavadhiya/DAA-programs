/*import java.util.*;
public class Quick {
    int partition(int a[], int start, int end) {
        int pivot = a[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }
    void quick(int a[], int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quick(a, start, p - 1);
            quick(a, p + 1, end);
        }
    }
    void printArr(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int a[] = new int[sc.nextInt()];
        System.out.println("Enter the elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n = a.length;
        System.out.println("\nBefore sorting array elements are - ");
        Quick q1 = new Quick();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        q1.printArr(a, n);
        System.out.println();
    }
}
 */
import java.util.Scanner;
public class Quick
{
    public static int partition(int a[],int l,int h)
    {
        int i=l+1 ,j=h,c=l,temp;
        for(; i<=j ;)
        {
            while(i<=h && a[i]<a[c] )
                i++;
            while(a[j]>a[c] && j>l)
                j--;
            if(i<j)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            else
                break;
        }
        temp=a[c];
        a[c]=a[j];
        a[j]=temp;
        return j;
    }
    public static void Sort(int a[],int l,int h)
    {
        if(l<h)
        {
            int m=partition(a,l,h);
            Sort(a,l,m-1);
            Sort(a,m+1,h);
        }
    }
    public static void printarray(int a[])
    {
        for(int i=0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int n, res,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println( "elements in array ");
        printarray(a);
        Sort(a,0,n-1);
        System.out.println( "\nelements after sorting");
        printarray(a);
    }
}
